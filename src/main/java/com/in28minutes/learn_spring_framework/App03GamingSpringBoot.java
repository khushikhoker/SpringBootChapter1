package com.in28minutes.learn_spring_framework;

import com.in28minutes.learn_spring_framework.game.GamingConsole;
import com.in28minutes.learn_spring_framework.game.MarioGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class App03GamingSpringBoot {

    @Bean
    public GamingConsole game() {
        var gameconsole = new MarioGame();
        return gameconsole;
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game) {
        var runner = new GameRunner(game);
        return runner;
    }

    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(App03GamingSpringBoot.class)) {
            context.getBean(GameRunner.class).run();
        }
    }
}
