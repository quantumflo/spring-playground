package com.quantumflo.game;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GameApplication {

	public static void main(String[] args) {
		var mario = new MarioGame();
		var roadrash = new RoadRash();
		var gameRunner = new GameRunner(roadrash);
		gameRunner.run();
//		SpringApplication.run(GameApplication.class, args);
	}

}
