package fr.cesi.projetV2.dao;

import fr.cesi.projetV2.business.Upload;

import java.sql.SQLException;

public interface UploadDao {

    Upload findOne(Long idUpload) throws SQLException;
}
