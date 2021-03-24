package fr.cesi.projetV2.service.impl;

import fr.cesi.projetV2.business.Utilisateur;
import fr.cesi.projetV2.dao.UtilisateurDao;
import fr.cesi.projetV2.dao.impl.UtilisateurDaoImpl;
import fr.cesi.projetV2.service.UtilisateurService;

import java.sql.SQLException;

import java.util.List;

public class UtilisateurServiceImpl implements UtilisateurService {
	
	private UtilisateurDao utiDao;
	
	
	public UtilisateurServiceImpl() {		
		utiDao = new UtilisateurDaoImpl();
	
	}

	@Override
	public Utilisateur rechercherUtilisateur(String email, String mdp) {
		// TODO Auto-generated method stub
		Utilisateur utilisateur = new Utilisateur(email,mdp);
		try {
			utilisateur = utiDao.searchByMailAndPassword(email, mdp);
		} catch(SQLException e){
			e.printStackTrace();
		}
		return utilisateur;
	}

	@Override
	public Utilisateur rechercherUtilisateurParID(Long idUtilisateur) {
		System.out.println("rechercherUtilisateurParID");
		Utilisateur utilisateur = null;
		try{
			utilisateur = utiDao.searchByID(idUtilisateur);
			return utilisateur;
		}catch(SQLException e){
			e.printStackTrace();
			return null;
		}


	}

	
	
	@Override
	public Utilisateur ajouterUtilisateur(String email, String motDePasse, String adresse, String telUtilisateur) {
		// TODO Auto-generated method stub
		Utilisateur utilisateur = new Utilisateur();
		utilisateur.setEmail(email);
		utilisateur.setMotDePasse(motDePasse);
		utilisateur.setAdresse(adresse);
		utilisateur.setTelUtilisateur(telUtilisateur);
		try {
			utilisateur = utiDao.createUser(utilisateur);
			return utilisateur;
		} catch(SQLException e){
			e.printStackTrace();
			return null;
		}
		
	}
	
	
	@Override
	public List<Utilisateur> recupererUtilisateurs() {
		try {
			return utiDao.findAll();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}

	@Override
	public Utilisateur recupererUtilisateurId(String email) {
		Utilisateur utilisateur = null;
		try{
			utilisateur = utiDao.findOne(email);
			return utilisateur;
		}catch(SQLException e){
			e.printStackTrace();
			return null;
		}
	}




}
