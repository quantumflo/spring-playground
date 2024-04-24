package com.quantumflo.game.utils;

import com.quantumflo.game.utils.Game;

public class GameRunner {
    private Game game;
    public GameRunner(Game game) {
        this.game = game;
    }

    public void run() {
        System.out.println("Running game: " + game);
        game.up();
        game.down();
    }
}
