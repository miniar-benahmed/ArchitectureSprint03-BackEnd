package com.miniar.recettes.restcontrollers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.miniar.recettes.entities.Recette;
import com.miniar.recettes.service.RecetteService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class RecetteRESTController {

    @Autowired
    private RecetteService recetteService;

    // 1. Obtenir toutes les recettes : GET http://localhost:8080/recettes/api
    @GetMapping
    public List<Recette> getAllRecettes() {
        return recetteService.getAllRecettes();
    }

    // 2. Consulter une recette par son ID : GET http://localhost:8080/recettes/api/{id}
    @GetMapping("/{id}")
    public Recette getRecetteById(@PathVariable("id") Long id) {
        return recetteService.getRecette(id);
    }

    // 3. Créer une nouvelle recette : POST http://localhost:8080/recettes/api
    @PostMapping
    public Recette createRecette(@RequestBody Recette recette) {
        return recetteService.saveRecette(recette);
    }

    // 4. Modifier une recette : PUT http://localhost:8080/recettes/api
    @PutMapping
    public Recette updateRecette(@RequestBody Recette recette) {
        return recetteService.updateRecette(recette);
    }

    // 5. Supprimer une recette : DELETE http://localhost:8080/recettes/api/{id}
    @DeleteMapping("/{id}")
    public void deleteRecette(@PathVariable("id") Long id) {
        recetteService.deleteRecetteById(id);
    }

    // 6. Obtenir les recettes selon leur pays d'origine : GET http://localhost:8080/recettes/api/recettespays/{idPays}
    @GetMapping("/recettespays/{idPays}")
    public List<Recette> getRecettesByPaysId(@PathVariable("idPays") Long idPays) {
        return recetteService.findByPaysOrigineIdpaysOrigine(idPays);
    }

    // 7. Rechercher des recettes par nom
    @GetMapping("/recsByName/{nom}")
    public List<Recette> findByNomRecetteContains(@PathVariable("nom") String nom) {
        return recetteService.findByNomRecetteContains(nom);
    }
}