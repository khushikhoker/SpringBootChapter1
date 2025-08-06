package com.in28minutes.learn_spring_framework;

import com.in28minutes.learn_spring_framework.game.MarioGame;
import com.in28minutes.learn_spring_framework.game.SuperContraGame;

public class App01GamingBasic {

    public static void main(String[] args) {
        var marioGame = new MarioGame();
        var superContraGame = new SuperContraGame();
        var gameRunner = new GameRunner(marioGame);
        gameRunner.run();
        var gameRunner2 = new GameRunner(superContraGame);
        gameRunner2.run();
    }
}
