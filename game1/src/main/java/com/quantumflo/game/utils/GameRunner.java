package com.quantumflo.game.utils;

import com.quantumflo.game.utils.Game;
import org.springframework.context.annotation.Configuration;

public class GameRunner {
    private Game game;
    public GameRunner(Game game) {
        this.game = game;
    }

    public void run() {
        System.out.println("Running game: " + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
