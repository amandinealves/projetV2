package fr.cesi.projetV2.dao.impl;

import fr.cesi.projetV2.business.Entreprise;
import fr.cesi.projetV2.dao.ConnexionBdd;
import fr.cesi.projetV2.dao.EntrepriseDao;
import fr.cesi.projetV2.dao.UtilisateurDao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EntrepriseDaoImpl implements EntrepriseDao {

    private Connection connection;
    private UtilisateurDao utilisateurDao;

    public EntrepriseDaoImpl() {
        try {
            this.connection = ConnexionBdd.getConnection();
            utilisateurDao = new UtilisateurDaoImpl();
        }catch (Exception e){
            System.out.println(e);
        }
    }

    @Override
    public Entreprise createEntreprise(Entreprise entreprise) throws SQLException {
        java.sql.PreparedStatement ps = connection.prepareStatement(fr.cesi.projetV2.dao.Requetes.AJOUTER_ENTREPRISE,
                Statement.RETURN_GENERATED_KEYS);
        System.out.println(entreprise.getUtilisateur().getIdUtilisateur());
        ps.setLong(1,entreprise.getUtilisateur().getIdUtilisateur());
        ps.executeUpdate();
        ResultSet rs = ps.getGeneratedKeys();
        rs.next();
        entreprise.setIdEntreprise(rs.getLong(1));
        return entreprise;
    }

    @Override
    public Entreprise searchByIDUti(Long idUtilisateur) throws SQLException {
        PreparedStatement ps = connection.prepareStatement(fr.cesi.projetV2.dao.Requetes.RECHERCHER_ENTREPRISE_BY_IDUTI,Statement.RETURN_GENERATED_KEYS);
        ps.setLong(1,idUtilisateur);
        ResultSet rs = ps.executeQuery();

        if(rs.next()){
            Entreprise entreprise = new Entreprise();
            entreprise.setIdEntreprise(rs.getLong(1));
            entreprise.setUtilisateur(utilisateurDao.searchByID(rs.getLong(2)));
            entreprise.setRaisonSociale(rs.getString(3));
            entreprise.setDomaineActivite(rs.getString(4));
            entreprise.setSiteEntreprise(rs.getString(5));
            return entreprise;
        }
        return null;

    }

    @Override
    public List<Entreprise> findAll() throws SQLException {
        List<Entreprise> entreprises = new ArrayList<>();
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery(fr.cesi.projetV2.dao.Requetes.TOUTES_LES_ENTREPRISES);
        System.out.println("FINDALL");
        while(rs.next()){
            Entreprise entreprise = new Entreprise();
            entreprise.setIdEntreprise(rs.getLong(1));
            entreprise.setRaisonSociale(rs.getString(2));
            entreprise.setDomaineActivite(rs.getString(3));
            entreprise.setSiteEntreprise(rs.getString(4));
            entreprises.add(entreprise);
        }
        return entreprises;
    }
}
