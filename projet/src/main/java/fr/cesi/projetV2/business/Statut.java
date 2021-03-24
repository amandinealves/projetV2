package fr.cesi.projetV2.business;

public class Statut {

    private Long idStatut;
    private String description;

    public Statut() {
        // TODO Auto-generated constructor stub
    }
    public Statut(String description) {
        super();
        this.description = description;
    }


    /**
     * @return the idStatut
     */
    public Long getIdStatut() {
        return idStatut;
    }

    /**
     * @param idStatut the idStatut to set
     */
    public void setIdStatut(Long idStatut) {
        this.idStatut = idStatut;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Statut [idStatut=" + idStatut + ", description=" + description + "]";
    }


}
