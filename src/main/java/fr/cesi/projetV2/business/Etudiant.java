package fr.cesi.projetV2.business;

import java.sql.Blob;
import java.sql.Date;

public class Etudiant {
    private Long idEtudiant;
    private Utilisateur utilisateur;
    private String nom;
    private String prenom;
    private Date dateNaissance;
    private String ecole;
    private String diplome;
   // private Statut statutEtudiant;
    //private Upload uploadEtudiant;


    public Etudiant() {
    }

    public Long getIdEtudiant() {
        return idEtudiant;
    }

    public void setIdEtudiant(Long idEtudiant) {
        this.idEtudiant = idEtudiant;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getEcole() {
        return ecole;
    }

    public void setEcole(String ecole) {
        this.ecole = ecole;
    }

    public String getDiplome() {
        return diplome;
    }

    public void setDiplome(String diplome) {
        this.diplome = diplome;
    }

   /* public Statut getStatutEtudiant() {
        return statutEtudiant;
    }

    public void setStatutEtudiant(Statut statutEtudiant) {
        this.statutEtudiant = statutEtudiant;
    }

    public Upload getUploadEtudiant() {
        return uploadEtudiant;
    }

    public void setUploadEtudiant(Upload uploadEtudiant) {
        this.uploadEtudiant = uploadEtudiant;
    }
*/
    @Override
    public String toString() {
        return "Etudiant{" +
                "idEtudiant=" + idEtudiant +
                ", utilisateur=" + utilisateur +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", dateNaissance=" + dateNaissance +
                ", ecole='" + ecole + '\'' +
                ", diplome='" + diplome + '\'' +
             /*   ", statutEtudiant=" + statutEtudiant +
                ", uploadEtudiant=" + uploadEtudiant +*/
                '}';
    }
}
