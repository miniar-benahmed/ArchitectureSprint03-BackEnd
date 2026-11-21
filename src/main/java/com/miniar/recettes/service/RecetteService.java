package com.miniar.recettes.service;

import java.util.List;
import com.miniar.recettes.entities.PaysOrigine;
import com.miniar.recettes.entities.Recette;

public interface RecetteService {
    Recette saveRecette(Recette r);
    Recette updateRecette(Recette r);
    void deleteRecette(Recette r);
    void deleteRecetteById(Long id);
    Recette getRecette(Long id);
    List<Recette> getAllRecettes();

    // Nouvelles méthodes Atelier 02
    List<Recette> findByNomRecette(String nom);
    List<Recette> findByNomRecetteContains(String nom);
    List<Recette> findByNomTemps(String nom, Double temps);
    List<Recette> findByPaysOrigine(PaysOrigine paysOrigine);
    List<Recette> findByPaysOrigineIdpaysOrigine(Long id);
    List<Recette> findByOrderByNomRecetteAsc();
    List<Recette> trierRecettesNomsTemps();
}