package fr.cesi.projetV2.service.impl;

import fr.cesi.projetV2.business.Upload;
import fr.cesi.projetV2.dao.UploadDao;
import fr.cesi.projetV2.dao.impl.UploadDaoImpl;
import fr.cesi.projetV2.service.UploadService;

import java.sql.SQLException;

public class UploadServiceImpl implements UploadService {

    private UploadDao uploadDao;

    public UploadServiceImpl() {
        uploadDao = new UploadDaoImpl();
    }

    @Override
    public Upload recupererUploadId(Long idUpload) {
        Upload upload = null;
        try{
            upload = uploadDao.findOne(idUpload);
            return upload;
        } catch(SQLException e) {
            e.printStackTrace();
            return null;
        }

    }
}
