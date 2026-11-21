package com.miniar.recettes;

import java.util.Date;
import java.util.List;

import com.miniar.recettes.entities.PaysOrigine;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.miniar.recettes.entities.Recette;
import com.miniar.recettes.repos.RecetteRepository;

@SpringBootTest
class RecettesApplicationTests {

	@Autowired
	private RecetteRepository recetteRepository;

	// 1. Tester l'ajout d'une recette
	@Test
	public void testCreateRecette() {
		Recette rec = new Recette("Couscous", 45.0, new Date());
		recetteRepository.save(rec);
	}

	// 2. Tester la recherche par ID
	@Test
	public void testFindRecette() {
		Recette r = recetteRepository.findById(2L).get();
		System.out.println(r);
	}

	// 3. Tester la modification d'une recette
	@Test
	public void testUpdateRecette() {
		Recette r = recetteRepository.findById(2L).get();
		r.setTempsPreparation(60.0);
		recetteRepository.save(r);
	}

	// 4. Tester la suppression par ID
	@Test
	public void testDeleteRecette() {
		recetteRepository.deleteById(1L);
	}

	// 5. Tester l'affichage de toutes les recettes
	@Test
	public void testListerTousRecettes() {
		List<Recette> recs = recetteRepository.findAll();
		for (Recette r : recs) {
			System.out.println(r);
		}
	}


	// Test : Recherche par nom
	@Test
	public void testFindByNomRecette() {
		List<Recette> recs = recetteRepository.findByNomRecette("Couscous");
		for (Recette r : recs) {
			System.out.println(r);
		}
	}

	// Test : Recherche contenant un texte
	@Test
	public void testFindByNomRecetteContains() {
		List<Recette> recs = recetteRepository.findByNomRecetteContains("Cous");
		for (Recette r : recs) {
			System.out.println(r);
		}
	}

	// Test : Recherche par nom et temps de préparation
	@Test
	public void testFindByNomTemps() {
		List<Recette> recs = recetteRepository.findByNomTemps("Couscous", 30.0);
		for (Recette r : recs) {
			System.out.println(r);
		}
	}

	// Test : Recherche par entité PaysOrigine
	@Test
	public void testFindByPaysOrigine() {
		PaysOrigine pays = new PaysOrigine();
		pays.setIdpaysOrigine(1L);
		List<Recette> recs = recetteRepository.findByPaysOrigine(pays);
		for (Recette r : recs) {
			System.out.println(r);
		}
	}

	// Test : Recherche par ID du PaysOrigine
	@Test
	public void testFindByPaysOrigineIdpaysOrigine() {
		List<Recette> recs = recetteRepository.findByPaysOrigineIdpaysOrigine(1L);
		for (Recette r : recs) {
			System.out.println(r);
		}
	}

	// Test : Tri alphabétique par nom
	@Test
	public void testFindByOrderByNomRecetteAsc() {
		List<Recette> recs = recetteRepository.findByOrderByNomRecetteAsc();
		for (Recette r : recs) {
			System.out.println(r);
		}
	}

	// Test : Tri combiné nom ASC et temps DESC
	@Test
	public void testTrierRecettesNomsTemps() {
		List<Recette> recs = recetteRepository.trierRecettesNomsTemps();
		for (Recette r : recs) {
			System.out.println(r);
		}
	}

}