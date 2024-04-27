package com.quantumflo.game.utils;

import com.quantumflo.game.utils.Game;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
@Qualifier("MarioQualifier")
public class MarioGame implements Game {
    public void up() {
        System.out.println("up");
    }

    public void down() {
        System.out.println("down");
    }

    public void right() {
        System.out.println("fireball");
    }

    public void left() {
        System.out.println("left");
    }

}

