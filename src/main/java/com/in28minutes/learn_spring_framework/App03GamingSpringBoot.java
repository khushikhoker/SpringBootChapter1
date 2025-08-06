package com.in28minutes.learn_spring_framework;

import com.in28minutes.learn_spring_framework.game.GamingConsole;
import com.in28minutes.learn_spring_framework.game.MarioGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.in28minutes.learn_spring_framework")
public class App03GamingSpringBoot {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(App03GamingSpringBoot.class)) {
            context.getBean(GameRunner.class).run();
        }
    }
}
