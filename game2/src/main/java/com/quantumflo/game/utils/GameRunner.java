package com.quantumflo.game.utils;

import com.quantumflo.game.utils.Game;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    private Game game;
    public GameRunner( @Qualifier("MarioQualifier") Game game ) {
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
