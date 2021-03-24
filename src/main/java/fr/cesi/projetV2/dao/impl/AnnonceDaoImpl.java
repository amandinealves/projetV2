package fr.cesi.projetV2.dao.impl;

import fr.cesi.projetV2.business.Annonce;
import fr.cesi.projetV2.business.Entreprise;
import fr.cesi.projetV2.dao.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AnnonceDaoImpl implements AnnonceDao {

    private Connection connection;
    private EtudiantDao etudiantDao;
    private EntrepriseDao entrepriseDao;

    public AnnonceDaoImpl(){
        try{
            this.connection = ConnexionBdd.getConnection();
            etudiantDao = new EtudiantDaoImpl();
            entrepriseDao = new EntrepriseDaoImpl();
        }catch(Exception e){
            System.out.println(e);
        }
    }

    @Override
    public List<Annonce> findAllETP(Long idEntreprise,Long idEtudiant) throws SQLException {
        List<Annonce> annonces = new ArrayList<>();
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery(fr.cesi.projetV2.dao.Requetes.TOUTES_LES_ANNONCES_ETP);
        while(rs.next()){
            Annonce annonce = new Annonce();
            annonce.setIdAnnonce(rs.getLong(1));
            annonce.setObjet(rs.getString(2));
            annonce.setLettreMotivation(rs.getString(3));
            annonce.setEtudiant(etudiantDao.searchByID(idEtudiant));
            annonces.add(annonce);
        }
        return annonces;
    }


}
