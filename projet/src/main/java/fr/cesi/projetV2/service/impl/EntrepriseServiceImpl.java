package fr.cesi.projetV2.service.impl;

import fr.cesi.projetV2.business.Entreprise;
import fr.cesi.projetV2.dao.EntrepriseDao;
import fr.cesi.projetV2.dao.impl.EntrepriseDaoImpl;
import fr.cesi.projetV2.service.EntrepriseService;
import fr.cesi.projetV2.service.UtilisateurService;

import java.sql.SQLException;
import java.util.List;

public class EntrepriseServiceImpl implements EntrepriseService {

    private EntrepriseDao entrepriseDao;
    private UtilisateurService us;

    public EntrepriseServiceImpl(){
        entrepriseDao = new EntrepriseDaoImpl();
        us= new UtilisateurServiceImpl();
    }


    @Override
    public Entreprise ajouterEntreprise(Long idUtilisateur) {
        Entreprise entreprise = new Entreprise(us.rechercherUtilisateurParID(idUtilisateur));
        try{
            entreprise = entrepriseDao.createEntreprise(entreprise);
            return entreprise;
        } catch (SQLException e){
            e.printStackTrace();
            return null;
        }

    }

    @Override
    public Entreprise rechercherEntrepriseParIDUti(Long idUtilisateur) {
        Entreprise entreprise =null;
        try {
            entreprise = entrepriseDao.searchByIDUti(idUtilisateur);
            return entreprise;
        }catch(SQLException e){
            e.printStackTrace();
            return null;
        }

    }

    @Override
    public List<Entreprise> rechercherEntreprises() {
        System.out.println("RechercheEntreprise");
        try{
            System.out.println("RechercheEntreprise");
            return entrepriseDao.findAll();
        }catch (SQLException e){
            e.printStackTrace();
            return null;
        }

    }
}
