package com.miniar.recettes.repos;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.miniar.recettes.entities.PaysOrigine;
import com.miniar.recettes.entities.Recette;

@RepositoryRestResource(path = "rest")
public interface RecetteRepository extends JpaRepository<Recette, Long> {

    List<Recette> findByNomRecette(String nom);

    List<Recette> findByNomRecetteContains(String nom);

    @Query("select r from Recette r where r.nomRecette like %?1 and r.tempsPreparation > ?2")
    List<Recette> findByNomTemps(String nom, Double temps);

    @Query("select r from Recette r where r.paysOrigine = ?1")
    List<Recette> findByPaysOrigine(PaysOrigine paysOrigine);

    List<Recette> findByPaysOrigineIdpaysOrigine(Long id);

    List<Recette> findByOrderByNomRecetteAsc();

    @Query("select r from Recette r order by r.nomRecette ASC, r.tempsPreparation DESC")
    List<Recette> trierRecettesNomsTemps();
}