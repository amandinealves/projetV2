package fr.cesi.projetV2.service;

import fr.cesi.projetV2.business.Etudiant;


public interface EtudiantService {

    public Etudiant ajouterEtudiant(Long idUtilisateur) ;

    Etudiant rechercherEtudiantParIDUti(Long idUtilisateur);

    }
