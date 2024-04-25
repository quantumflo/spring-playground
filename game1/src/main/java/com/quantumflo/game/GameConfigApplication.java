package com.quantumflo.game;

import com.quantumflo.game.utils.Game;
import com.quantumflo.game.utils.GameRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GameConfigApplication {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(GamingConfiguration.class);
        context.getBean(Game.class).up();
       context.getBean(GameRunner.class).run();

    }
}
