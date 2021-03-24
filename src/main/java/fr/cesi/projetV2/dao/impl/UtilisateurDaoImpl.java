package fr.cesi.projetV2.dao.impl;

import fr.cesi.projetV2.business.Utilisateur;
import fr.cesi.projetV2.dao.ConnexionBdd;
import fr.cesi.projetV2.dao.UtilisateurDao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;



public class UtilisateurDaoImpl implements UtilisateurDao {
	
	private Connection connection;	
	
	public UtilisateurDaoImpl() {
		try {
			this.connection = ConnexionBdd.getConnection();
			
		}catch(Exception e){
			System.out.println(e);
		}

	}


	@Override
	public Utilisateur searchByMailAndPassword(String email, String mdp) throws SQLException {
		java.sql.PreparedStatement ps = connection.prepareStatement(fr.cesi.projetV2.dao.Requetes.RECHERCHER_UTILISATEUR,Statement.RETURN_GENERATED_KEYS);
		ps.setString(1, email);
		ps.setString(2, mdp);
		ResultSet rs = ps.executeQuery();
		if(rs.next()) {
			Utilisateur utilisateur = new Utilisateur();
			utilisateur.setIdUtilisateur(rs.getLong(1));
			utilisateur.setEmail(rs.getString(2));
			utilisateur.setMotDePasse(rs.getString(3));
			utilisateur.setAdresse(rs.getString(4));
			utilisateur.setTelUtilisateur(rs.getString(5));
			
			return utilisateur;
		}
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Utilisateur searchByID(Long idUtilisateur) throws SQLException {
		System.out.println("searchByIDDAO");
		PreparedStatement ps = connection.prepareStatement(fr.cesi.projetV2.dao.Requetes.RECHERCHER_UTILISATEUR_BY_ID,Statement.RETURN_GENERATED_KEYS);
		ps.setLong(1, idUtilisateur);
		System.out.println("searchByIDDAO");
		ResultSet rs = ps.executeQuery();

		if(rs.next()) {
			Utilisateur utilisateur = new Utilisateur();
			utilisateur.setIdUtilisateur(rs.getLong(1));
			System.out.println(rs.toString());
			utilisateur.setEmail(rs.getString(2));
			utilisateur.setMotDePasse(rs.getString(3));
			utilisateur.setAdresse(rs.getString(4));
			utilisateur.setTelUtilisateur(rs.getString(5));
			return utilisateur;
		}
		return null;
	}


	@Override
	public Utilisateur createUser(Utilisateur utilisateur) throws SQLException {
		// TODO Auto-generated method stub
		java.sql.PreparedStatement ps = connection.prepareStatement(fr.cesi.projetV2.dao.Requetes.AJOUTER_UTILISATEUR,Statement.RETURN_GENERATED_KEYS);
		ps.setString(1, utilisateur.getEmail());
		ps.setString(2, utilisateur.getMotDePasse());
		ps.setString(3, utilisateur.getAdresse());
		ps.setString(4, utilisateur.getTelUtilisateur());
		ps.executeUpdate();
		ResultSet rs = ps.getGeneratedKeys();
		rs.next();
		utilisateur.setIdUtilisateur(rs.getLong(1));
		return utilisateur;
	}


	@Override
	public List<Utilisateur> findAll() throws SQLException {
		List<Utilisateur> utilisateurs = new ArrayList<>();
		Statement stmt = connection.createStatement();
		ResultSet rs = stmt.executeQuery(fr.cesi.projetV2.dao.Requetes.TOUS_LES_UTILISATEURS);
		while (rs.next()) {
			Utilisateur utilisateur = new Utilisateur();
			utilisateur.setIdUtilisateur(rs.getLong(1));
			utilisateur.setEmail(rs.getString(2));
			utilisateur.setMotDePasse(rs.getString(3));
			utilisateur.setAdresse(rs.getString(4));
			utilisateur.setTelUtilisateur(rs.getString(5));
			utilisateurs.add(utilisateur);
		}
		// TODO Auto-generated method stub
		return utilisateurs;
	}

	@Override
	public Utilisateur findOne(String email) throws SQLException {
		java.sql.PreparedStatement ps = connection.prepareStatement(fr.cesi.projetV2.dao.Requetes.RECHERCHER_UTILISATEUR_ID,Statement.RETURN_GENERATED_KEYS);
		ps.setString(1, email);
		ResultSet rs = ps.executeQuery();
		if(rs.next()) {
			Utilisateur utilisateur = new Utilisateur();
			utilisateur.setIdUtilisateur(rs.getLong(1));
			utilisateur.setEmail(rs.getString(2));
			utilisateur.setMotDePasse(rs.getString(3));
			utilisateur.setAdresse(rs.getString(4));
			utilisateur.setTelUtilisateur(rs.getString(5));
			return utilisateur;
		}
		return null;

	}



}
