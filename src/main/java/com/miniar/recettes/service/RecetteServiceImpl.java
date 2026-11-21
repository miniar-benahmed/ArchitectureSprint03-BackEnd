package com.miniar.recettes.service;

import java.util.List;

import com.miniar.recettes.entities.PaysOrigine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.miniar.recettes.entities.Recette;
import com.miniar.recettes.repos.RecetteRepository;

@Service

public class RecetteServiceImpl implements RecetteService {
    @Autowired
    RecetteRepository recetteRepository;
    @Override
    public Recette saveRecette(Recette r) {
        return recetteRepository.save(r);
    }
    @Override
    public Recette updateRecette(Recette r) {
        return recetteRepository.save(r);
    }
    @Override
    public void deleteRecette(Recette r) {
        recetteRepository.delete(r);
    }
    @Override
    public void deleteRecetteById(Long id) {
        recetteRepository.deleteById(id);
    }
    @Override
    public Recette getRecette(Long id) {
        return recetteRepository.findById(id).get();
    }
    @Override
    public List<Recette> getAllRecettes() {
        return recetteRepository.findAll();
    }
    @Override
    public List<Recette> findByNomRecette(String nom) {
        return recetteRepository.findByNomRecette(nom);
    }

    @Override
    public List<Recette> findByNomRecetteContains(String nom) {
        return recetteRepository.findByNomRecetteContains(nom);
    }

    @Override
    public List<Recette> findByNomTemps(String nom, Double temps) {
        return recetteRepository.findByNomTemps(nom, temps);
    }

    @Override
    public List<Recette> findByPaysOrigine(PaysOrigine paysOrigine) {
        return recetteRepository.findByPaysOrigine(paysOrigine);
    }

    @Override
    public List<Recette> findByPaysOrigineIdpaysOrigine(Long id) {
        return recetteRepository.findByPaysOrigineIdpaysOrigine(id);
    }

    @Override
    public List<Recette> findByOrderByNomRecetteAsc() {
        return recetteRepository.findByOrderByNomRecetteAsc();
    }

    @Override
    public List<Recette> trierRecettesNomsTemps() {
        return recetteRepository.trierRecettesNomsTemps();
    }
}

