package fr.cesi.projetV2.dao.impl;

import fr.cesi.projetV2.business.Statut;
import fr.cesi.projetV2.dao.ConnexionBdd;
import fr.cesi.projetV2.dao.StatutDao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class StatutDaoImpl implements StatutDao {

	private Connection connection;
	
	public StatutDaoImpl() {
		// TODO Auto-generated constructor stub
		try {
			this.connection = ConnexionBdd.getConnection();
			
		}catch(Exception e){
			System.out.println(e);
		}
	}

	@Override
	public List<Statut> findAll() throws SQLException {
		// TODO Auto-generated method stub
		List<Statut> statuts = new ArrayList<>();
		Statement stmt = connection.createStatement();
		ResultSet rs = stmt.executeQuery(fr.cesi.projetV2.dao.Requetes.TOUS_LES_STATUTS);
		while(rs.next()) {
			Statut statut = new Statut();
			statut.setIdStatut(rs.getLong(1));
			statut.setDescription(rs.getString(2));
			statuts.add(statut);
		}
		return statuts;
	}

	@Override
	public Statut findOne(String idStatut) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(fr.cesi.projetV2.dao.Requetes.RECHERCHER_STATUT_ID);
		ps.setString(1,idStatut);
		ResultSet rs = ps.executeQuery();
		if(rs.next()){
			Statut statut = new Statut();
			statut.setIdStatut(rs.getLong(1));
			statut.setDescription(rs.getString(2));
			return statut;
		}
		return null;
	}

}
