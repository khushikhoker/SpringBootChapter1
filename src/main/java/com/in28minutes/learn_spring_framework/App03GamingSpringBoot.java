package com.in28minutes.learn_spring_framework;

import com.in28minutes.learn_spring_framework.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpringBoot {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(GameConfiguration.class)) {
            context.getBean(GameRunner.class).run();
        }
    }
}
