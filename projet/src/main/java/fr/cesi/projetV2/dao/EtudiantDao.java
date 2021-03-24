package fr.cesi.projetV2.dao;

import fr.cesi.projetV2.business.Etudiant;


import java.sql.SQLException;

public interface EtudiantDao {

    public Etudiant createEtudiant(Etudiant etudiant) throws SQLException;

    Etudiant searchByIDUti(Long idUtilisateur) throws SQLException;

    Etudiant searchByID(Long idEtudiant);
}
