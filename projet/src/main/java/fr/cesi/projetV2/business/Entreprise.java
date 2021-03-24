package fr.cesi.projetV2.business;

public class Entreprise {
    private Long idEntreprise;
    private Utilisateur utilisateur;
    private String raisonSociale;
    private String domaineActivite;
    private String siteEntreprise;

    public Entreprise() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Entreprise(Utilisateur  utilisateur){
        this();
        this.utilisateur = utilisateur;
    }

    public Entreprise(String raisonSociale,  String domaineActivite,
                      String siteEntreprise) {
        super();
        this.raisonSociale = raisonSociale;
        this.domaineActivite = domaineActivite;
        this.siteEntreprise = siteEntreprise;
    }

    /**
     * @return the idEntreprise
     */
    public Long getIdEntreprise() {
        return idEntreprise;
    }

    /**
     * @param idEntreprise the idEntreprise to set
     */
    public void setIdEntreprise(Long idEntreprise) {
        this.idEntreprise = idEntreprise;
    }
    /**
     * @return the utilisateur
     */
    public Utilisateur getUtilisateur() {
        return utilisateur;
    }
    /**
     * @param utilisateur the utilisateur to set
     */
    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }
    /**
     * @return the raisonSociale
     */
    public String getRaisonSociale() {
        return raisonSociale;
    }
    /**
     * @param raisonSociale the raisonSociale to set
     */
    public void setRaisonSociale(String raisonSociale) {
        this.raisonSociale = raisonSociale;
    }
    /**
     * @return the domaineActivite
     */
    public String getDomaineActivite() {
        return domaineActivite;
    }
    /**
     * @param domaineActivite the domaineActivite to set
     */
    public void setDomaineActivite(String domaineActivite) {
        this.domaineActivite = domaineActivite;
    }
    /**
     * @return the siteEntreprise
     */
    public String getSiteEntreprise() {
        return siteEntreprise;
    }
    /**
     * @param siteEntreprise the siteEntreprise to set
     */
    public void setSiteEntreprise(String siteEntreprise) {
        this.siteEntreprise = siteEntreprise;
    }

    @Override
    public String toString() {
        return "Entreprise [idEntreprise=" + idEntreprise + ", utilisateur=" + utilisateur + ", raisonSociale="
                + raisonSociale + ", domaineActivite="
                + domaineActivite + ", siteEntreprise=" + siteEntreprise + "]";
    }


}
