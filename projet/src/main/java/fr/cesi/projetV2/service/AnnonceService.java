package fr.cesi.projetV2.service;

import fr.cesi.projetV2.business.Annonce;
import fr.cesi.projetV2.business.Entreprise;
import fr.cesi.projetV2.business.Etudiant;

import java.util.List;

public interface AnnonceService {

    public Annonce ajouterAnnonce(String objet, String lettreMotivation, Etudiant etudiant, Entreprise entreprise);

    public List<Annonce> rechercherAnnonces(Long idEtudiant, Long idEntreprise);
}
