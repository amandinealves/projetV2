package fr.cesi.projetV2.dao.impl;

import fr.cesi.projetV2.business.Etudiant;
import fr.cesi.projetV2.dao.ConnexionBdd;
import fr.cesi.projetV2.dao.EtudiantDao;
import fr.cesi.projetV2.dao.Requetes;
import fr.cesi.projetV2.dao.UtilisateurDao;

import java.sql.*;

public class EtudiantDaoImpl implements EtudiantDao{

    private Connection connection;
    private UtilisateurDao utilisateurDao;

    public EtudiantDaoImpl() {
        try {
            this.connection = ConnexionBdd.getConnection();
            utilisateurDao = new UtilisateurDaoImpl();
        }catch(Exception e){
            System.out.println(e);
        }

    }

    @Override
    public Etudiant createEtudiant(Etudiant etudiant) throws SQLException {
        PreparedStatement ps = connection.prepareStatement(Requetes.AJOUTER_ETUDIANT, Statement.RETURN_GENERATED_KEYS);
        ps.setLong(1, etudiant.getUtilisateur().getIdUtilisateur());
        ps.executeUpdate();
        ResultSet rs = ps.getGeneratedKeys();
        rs.next();
        etudiant.setIdEtudiant(rs.getLong(1));
        return etudiant;
    }

    @Override
    public Etudiant searchByIDUti(Long idUtilisateur) throws SQLException {
        PreparedStatement ps = connection.prepareStatement(fr.cesi.projetV2.dao.Requetes.RECHERCHER_ETUDIANT_BY_IDUSER,Statement.RETURN_GENERATED_KEYS);
        ps.setLong(1, idUtilisateur);
        ResultSet rs = ps.executeQuery();
        if(rs.next()) {
            Etudiant etudiant = new Etudiant();
            etudiant.setIdEtudiant(rs.getLong(1));
            etudiant.setUtilisateur(utilisateurDao.searchByID(rs.getLong(7)));
            etudiant.setNom(rs.getString(2));
            etudiant.setPrenom(rs.getString(3));
            etudiant.setDateNaissance(rs.getDate(4));
            etudiant.setDiplome(rs.getString(5));
            etudiant.setEcole(rs.getString(6));
            return etudiant;
        }
        return null;
    }

    @Override
    public Etudiant searchByID(Long idEtudiant) {
        return null;
    }
}
