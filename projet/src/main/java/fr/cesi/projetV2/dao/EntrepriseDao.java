package fr.cesi.projetV2.dao;

import fr.cesi.projetV2.business.Entreprise;

import java.sql.SQLException;
import java.util.List;

public interface EntrepriseDao {

    Entreprise createEntreprise(Entreprise entreprise) throws SQLException;

    Entreprise searchByIDUti(Long idUtilisateur) throws SQLException;

    List<Entreprise> findAll() throws SQLException;

}
