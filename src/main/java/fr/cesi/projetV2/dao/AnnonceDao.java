package fr.cesi.projetV2.dao;

import fr.cesi.projetV2.business.Annonce;

import java.sql.SQLException;
import java.util.List;

public interface AnnonceDao {



    List<Annonce> findAllETP(Long idEtudiant, Long idEntreprise) throws SQLException;
}
