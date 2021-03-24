package fr.cesi.projetV2.dao.impl;

import fr.cesi.projetV2.business.Upload;
import fr.cesi.projetV2.dao.ConnexionBdd;
import fr.cesi.projetV2.dao.UploadDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UploadDaoImpl implements UploadDao {
    private Connection connection;

    public UploadDaoImpl() {
        try {
            this.connection = ConnexionBdd.getConnection();
        } catch (Exception e){
            System.out.println(e);
        }
    }

            @Override
    public Upload findOne(Long idUpload) throws SQLException {
        PreparedStatement ps = connection.prepareStatement(fr.cesi.projetV2.dao.Requetes.UPLOAD_ID);
        ps.setLong(1,idUpload);
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            Upload upload = new Upload();
            upload.setIdUpload(rs.getLong(1));
            upload.setCv(rs.getBlob(2));
            upload.setLettreMotivation(rs.getBlob(3));
        }

        return null;
    }
}
