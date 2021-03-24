package fr.cesi.projetV2.business;

import java.sql.Blob;

public class Upload {
    private Long idUpload;
    private Blob cv;
    private Blob lettreMotivation;

    public Upload() {
    }

    public Long getIdUpload() {
        return idUpload;
    }

    public void setIdUpload(Long idUpload) {
        this.idUpload = idUpload;
    }

    public Blob getCv() {
        return cv;
    }

    public void setCv(Blob cv) {
        this.cv = cv;
    }

    public Blob getLettreMotivation() {
        return lettreMotivation;
    }

    public void setLettreMotivation(Blob lettreMotivation) {
        this.lettreMotivation = lettreMotivation;
    }

    @Override
    public String toString() {
        return "Upload{" +
                "idUpload=" + idUpload +
                ", cv=" + cv +
                ", lettreMotivation=" + lettreMotivation +
                '}';
    }
}
