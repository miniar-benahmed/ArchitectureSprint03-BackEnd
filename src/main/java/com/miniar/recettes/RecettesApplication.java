package com.miniar.recettes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.miniar.recettes.entities.PaysOrigine;
import com.miniar.recettes.entities.Recette;

@SpringBootApplication
public class RecettesApplication implements CommandLineRunner {

	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;

	public static void main(String[] args) {
		SpringApplication.run(RecettesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Expose les IDs pour Recette ET PaysOrigine
		repositoryRestConfiguration.exposeIdsFor(Recette.class, PaysOrigine.class);
	}
}