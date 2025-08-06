package com.in28minutes.learn_spring_framework.game;

public class SuperContraGame implements GamingConsole{
    @Override
    public void up() {
        System.out.println("Punch");
    }

    @Override
    public void down() {
        System.out.println("sit");
    }

    @Override
    public void left() {
        System.out.println("Move front");
    }

    @Override
    public void right() {
        System.out.println("Move back");
    }
}
