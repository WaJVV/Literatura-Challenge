package com.devWay.LiteruraChallenge;

import com.devWay.LiteruraChallenge.Menu.menu;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiteruraChallengeApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(LiteruraChallengeApplication.class, args);
	}



	@Override
	public void run(String... args) throws Exception {
		menu menuPrincipal = new menu();
		menuPrincipal.mostrarMenu();
	}






}
