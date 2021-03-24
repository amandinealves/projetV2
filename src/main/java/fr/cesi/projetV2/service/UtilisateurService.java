package fr.cesi.projetV2.service;

import fr.cesi.projetV2.business.Utilisateur;

import java.util.List;


public interface UtilisateurService {
	//C
	public Utilisateur ajouterUtilisateur(String email, String motDePasse, String adresse, String telUtilisateur);

	//R
	public Utilisateur rechercherUtilisateur(String email, String mdp);
	
	public List<Utilisateur> recupererUtilisateurs();

    Utilisateur recupererUtilisateurId(String email);

	Utilisateur rechercherUtilisateurParID(Long idUtilisateur);

	//U
	
	//D

}
