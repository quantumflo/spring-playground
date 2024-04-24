package com.quantumflo.game;

import com.quantumflo.game.utils.GameRunner;
import com.quantumflo.game.utils.RoadRash;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GameApplication {

	public static void main(String[] args) {
//		var game = new MarioGame();
		var game = new RoadRash();
		var gameRunner = new GameRunner(game);
		gameRunner.run();
//		SpringApplication.run(GameApplication.class, args);
	}

}
