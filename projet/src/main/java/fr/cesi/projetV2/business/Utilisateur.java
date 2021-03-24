package fr.cesi.projetV2.business;

import java.util.List;

public class Utilisateur {
    private Long idUtilisateur;
    private String email;
    private String motDePasse;
    private String adresse;
    private String telUtilisateur;
    private List<Annonce> annonces;

    public Utilisateur() {
        super();
        // TODO Auto-generated constructor stub
    }


    public Utilisateur(String email, String motDePasse) {
        super();
        this.email = email;
        this.motDePasse = motDePasse;
    }

    public Utilisateur(Long idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public Utilisateur(String email, String motDePasse, String adresse, String telUtilisateur) {
        super();
        this.email = email;
        this.motDePasse = motDePasse;
        this.adresse = adresse;
        this.telUtilisateur = telUtilisateur;
    }


    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }


    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }


    /**
     * @return the motDePasse
     */
    public String getMotDePasse() {
        return motDePasse;
    }


    /**
     * @param motDePasse the motDePasse to set
     */
    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }


    /**
     * @return the adresse
     */
    public String getAdresse() {
        return adresse;
    }


    /**
     * @param adresse the adresse to set
     */
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }





    /**
     * @return the annonces
     */
    public List<Annonce> getAnnonces() {
        return annonces;
    }


    /**
     * @param annonces the annonces to set
     */
    public void setAnnonces(List<Annonce> annonces) {
        this.annonces = annonces;
    }


    /**
     * @return the idUtilisateur
     */
    public Long getIdUtilisateur() {
        return idUtilisateur;
    }


    /**
     * @param idUtilisateur the idUtilisateur to set
     */
    public void setIdUtilisateur(Long idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }


    /**
     * @return the telUtilisateur
     */
    public String getTelUtilisateur() {
        return telUtilisateur;
    }


    /**
     * @param telUtilisateur the telUtilisateur to set
     */
    public void setTelUtilisateur(String telUtilisateur) {
        this.telUtilisateur = telUtilisateur;
    }

    @Override
    public String toString() {
        return "Utilisateur{" +
                "idUtilisateur=" + idUtilisateur +
                ", email='" + email + '\'' +
                ", motDePasse='" + motDePasse + '\'' +
                ", adresse='" + adresse + '\'' +
                ", telUtilisateur='" + telUtilisateur + '\'' +
                ", annonces=" + annonces +
                '}';
    }
}
