package com.miniar.recettes.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nomRecette", types = { Recette.class })
public interface RecetteProjection {
    public String getNomRecette();
}