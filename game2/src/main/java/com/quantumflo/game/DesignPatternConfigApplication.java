package com.quantumflo.game;

import com.quantumflo.game.utils.Game;
import com.quantumflo.game.utils.GameRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
class Singleton {
}
@Component
@Scope(value="prototype")
class Prototype {

}
@Configuration
@ComponentScan("com.quantumflo.game")
public class DesignPatternConfigApplication {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(DesignPatternConfigApplication.class);
        System.out.println("Singleton = " + context.getBean(Singleton.class));
        System.out.println("Singleton = " + context.getBean(Singleton.class));
        System.out.println("Singleton = " + context.getBean(Singleton.class));

        System.out.println("Prototype = " + context.getBean(Prototype.class));
        System.out.println("Prototype = " + context.getBean(Prototype.class));
        System.out.println("Prototype = " + context.getBean(Prototype.class));

    }
}
