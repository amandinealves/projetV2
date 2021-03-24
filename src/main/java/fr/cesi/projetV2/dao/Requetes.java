package fr.cesi.projetV2.dao;

public class Requetes {	
	
	public static final String RECHERCHER_UTILISATEUR = "SELECT * FROM `utilisateur` WHERE `email`=? AND `motDePasse`=?";
	
	public static final String TOUS_LES_UTILISATEURS = "SELECT * FROM `utilisateur`";

	public static final String AJOUTER_UTILISATEUR = "INSERT INTO `utilisateur`(`email`, `motDePasse`, `adresse`, `telUtilisateur`) VALUES (?,?,?,?)";

	public static final String TOUS_LES_STATUTS = "SELECT * FROM `statut`";

	public static final String AJOUTER_ETUDIANT = "INSERT INTO `etudiant`( `idUtilisateur`) VALUES (?)";

    public static final String UPLOAD_ID = "";

    public static final String RECHERCHER_STATUT_ID = "SELECT `idStatut`, `description` FROM `statut` WHERE `idStatut` =?" ;
	public static final String RECHERCHER_UTILISATEUR_ID = "SELECT * FROM `utilisateur` WHERE `email`=?";
	public static final String RECHERCHER_UTILISATEUR_BY_ID = "SELECT * FROM `utilisateur` WHERE `idUtilisateur`=?";
	public static final String AJOUTER_ENTREPRISE = "INSERT INTO `entreprise`(`idUtilisateur`) VALUES (?)" ;

    public static final String RECHERCHER_ETUDIANT_BY_IDUSER = "SELECT * FROM `etudiant` WHERE `idUtilisateur`=?";
    public static final String RECHERCHER_ENTREPRISE_BY_IDUTI = "SELECT * FROM `entreprise` WHERE `idUtilisateur`=?";

    public static final String TOUTES_LES_ENTREPRISES = "SELECT `idEntreprise`,`raisonSociale`, `domaineActivite`, `siteEntreprise` FROM `entreprise`" ;
    public static final String TOUTES_LES_ANNONCES_ETP = "SELECT * FROM `annonce` WHERE `idEntreprise`=?";
}
