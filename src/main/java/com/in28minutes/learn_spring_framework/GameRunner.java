package com.in28minutes.learn_spring_framework;

import com.in28minutes.learn_spring_framework.game.GamingConsole;

public class GameRunner {
    GamingConsole game;

    public GameRunner(GamingConsole game) {
        this.game = game;
    }

    public void run() {
        System.out.println(game+ " is started");
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
