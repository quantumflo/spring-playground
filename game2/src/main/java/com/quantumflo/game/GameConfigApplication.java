package com.quantumflo.game;

import com.quantumflo.game.utils.Game;
import com.quantumflo.game.utils.GameRunner;
import com.quantumflo.game.utils.MarioGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan("com.quantumflo.game.utils")
public class GameConfigApplication {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(GameConfigApplication.class);
        context.getBean(Game.class).up();
       context.getBean(GameRunner.class).run();

    }
}
