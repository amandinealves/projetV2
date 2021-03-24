package fr.cesi.projetV2.dao;

import fr.cesi.projetV2.business.Statut;

import java.sql.SQLException;
import java.util.List;

public interface StatutDao {
	public List<Statut> findAll() throws SQLException;

    Statut findOne(String idStatut) throws SQLException;
}
