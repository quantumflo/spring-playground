package com.quantumflo.game.utils;

import com.quantumflo.game.utils.Game;

public class RoadRash implements Game {
    @Override
    public void up() {
        System.out.println("Wheelie");
    }

    @Override
    public void down() {
        System.out.println("Bend");
    }

    @Override
    public void right() {
        System.out.println("Right");
    }

    @Override
    public void left() {
        System.out.println("Left");
    }
}
