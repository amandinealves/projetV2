package fr.cesi.projetV2.service.impl;

import fr.cesi.projetV2.business.Etudiant;
import fr.cesi.projetV2.business.Utilisateur;
import fr.cesi.projetV2.dao.EtudiantDao;
import fr.cesi.projetV2.dao.impl.EtudiantDaoImpl;
import fr.cesi.projetV2.service.EtudiantService;
import fr.cesi.projetV2.service.StatutService;
import fr.cesi.projetV2.service.UploadService;
import fr.cesi.projetV2.service.UtilisateurService;

import java.sql.SQLException;

public class EtudiantServiceImpl implements EtudiantService {

    public EtudiantDao etudiantDao;
    private StatutService ss;
    private UtilisateurService us;
    private UploadService ups;

    public EtudiantServiceImpl(){
        etudiantDao = new EtudiantDaoImpl();
        us= new UtilisateurServiceImpl();
    }


    @Override
    public Etudiant ajouterEtudiant(Long idUtilisateur) {
        System.out.println("ajoutetudiant");
        Etudiant etudiant = new Etudiant();
        etudiant.setUtilisateur(us.rechercherUtilisateurParID(idUtilisateur));
        try{
            System.out.println(etudiant.toString());
            etudiant = etudiantDao.createEtudiant(etudiant);
            return etudiant;
        }catch (SQLException e){
            e.printStackTrace();
            return null;
        }

    }

    @Override
    public Etudiant rechercherEtudiantParIDUti(Long idUtilisateur) {
        Etudiant etudiant = null;
        try {
            etudiant = etudiantDao.searchByIDUti(idUtilisateur);
            return etudiant;
        }catch (SQLException e){
            e.printStackTrace();
            return null;
        }
    }

}
