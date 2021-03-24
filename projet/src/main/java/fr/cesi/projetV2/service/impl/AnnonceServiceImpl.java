package fr.cesi.projetV2.service.impl;

import fr.cesi.projetV2.business.Annonce;
import fr.cesi.projetV2.business.Entreprise;
import fr.cesi.projetV2.business.Etudiant;
import fr.cesi.projetV2.dao.AnnonceDao;
import fr.cesi.projetV2.dao.impl.AnnonceDaoImpl;
import fr.cesi.projetV2.service.AnnonceService;

import java.sql.SQLException;
import java.util.List;

public class AnnonceServiceImpl implements AnnonceService {

    public AnnonceDao annonceDao;

    public AnnonceServiceImpl(){
        annonceDao = new AnnonceDaoImpl();
    }


    @Override
    public Annonce ajouterAnnonce(String objet, String lettreMotivation, Etudiant etudiant, Entreprise entreprise) {
        return null;
    }

    @Override
    public List<Annonce> rechercherAnnonces(Long idEtudiant, Long idEntreprise) {
        try{
            System.out.println("RechercheEntreprise");
            return annonceDao.findAllETP(idEtudiant,idEntreprise);
        }catch (SQLException e){
            e.printStackTrace();
            return null;
        }

    }
}
