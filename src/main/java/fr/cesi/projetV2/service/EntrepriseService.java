package fr.cesi.projetV2.service;

import fr.cesi.projetV2.business.Entreprise;

import java.util.List;

public interface EntrepriseService {

    public Entreprise ajouterEntreprise(Long idUtilisateur);

    public Entreprise rechercherEntrepriseParIDUti(Long idUtilisateur);

    public List<Entreprise> rechercherEntreprises();
}
