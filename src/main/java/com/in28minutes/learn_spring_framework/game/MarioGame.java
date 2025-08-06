package com.in28minutes.learn_spring_framework.game;

public class MarioGame implements GamingConsole{

    private String name = "Mario";

    public String getName() {
        return name;
    }

    public void up() {
        System.out.println("Jump");
    }

    public void down() {
        System.out.println("Go into the hole");
    }

    public void right() {
        System.out.println("Go Forward");
    }

    public void left() {
        System.out.println("Go back");
    }
}
