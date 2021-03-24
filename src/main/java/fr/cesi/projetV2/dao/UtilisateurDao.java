package fr.cesi.projetV2.dao;

import fr.cesi.projetV2.business.Utilisateur;

import java.sql.SQLException;
import java.util.List;

public interface UtilisateurDao {
	
	public Utilisateur createUser(Utilisateur utilisateur) throws SQLException;
	
	public Utilisateur searchByMailAndPassword(String email, String mdp) throws SQLException;

	public List<Utilisateur> findAll() throws SQLException;

    Utilisateur findOne(String email) throws SQLException;

	Utilisateur searchByID(Long idUtilisateur) throws SQLException;
}
