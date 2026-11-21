package com.miniar.recettes.entities;

import jakarta.persistence.*;

import java.util.Date;
@Entity

public class Recette {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)


    private Long idRecette;
    private String nomRecette;
    private double tempsPreparation;
    private Date dateAjout;
    @ManyToOne
    private PaysOrigine paysOrigine;
    private String difficulte;

    public Recette(String nomRecette, double tempsPreparation, Date dateAjout) {
        super();
        this.nomRecette = nomRecette;
        this.tempsPreparation = tempsPreparation;
        this.dateAjout = dateAjout;
    }


    public Recette() {
        super();
    }


    public Recette(Long idRecette, String nomRecette, double tempsPreparation, Date dateAjout) {
        this.idRecette = idRecette;
        this.nomRecette = nomRecette;
        this.tempsPreparation = tempsPreparation;
        this.dateAjout = dateAjout;
    }


    public Long getIdRecette() {
        return idRecette;
    }

    public void setIdRecette(Long idRecette) {
        this.idRecette = idRecette;
    }

    public String getNomRecette() {
        return nomRecette;
    }

    public void setNomRecette(String nomRecette) {
        this.nomRecette = nomRecette;
    }

    public double getTempsPreparation() {
        return tempsPreparation;
    }

    public void setTempsPreparation(double tempsPreparation) {
        this.tempsPreparation = tempsPreparation;
    }

    public Date getDateAjout() {
        return dateAjout;
    }

    public void setDateAjout(Date dateAjout) {
        this.dateAjout = dateAjout;
    }
    public PaysOrigine getPaysOrigine() {
        return paysOrigine;
    }

    public void setPaysOrigine(PaysOrigine paysOrigine) {
        this.paysOrigine = paysOrigine;
    }
    public String getDifficulte() {
        return difficulte;
    }

    public void setDifficulte(String difficulte) {
        this.difficulte = difficulte;
    }

    @Override
    public String toString() {
        return "Recette{" +
                "idRecette=" + idRecette +
                ", nomRecette='" + nomRecette + '\'' +
                ", tempsPreparation=" + tempsPreparation +
                ", dateAjout=" + dateAjout +
                '}';
    }
}