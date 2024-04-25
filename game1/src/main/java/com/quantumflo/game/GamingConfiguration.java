package com.quantumflo.game;

import com.quantumflo.game.utils.Game;
import com.quantumflo.game.utils.GameRunner;
import com.quantumflo.game.utils.MarioGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {
    @Bean
    public Game mario() {
        return new MarioGame();
    }
    @Bean
    public GameRunner gameRunner(Game mario) {
        return new GameRunner(mario);
    }
}
