package com.spring.learnspringframework;

import com.spring.learnspringframework.game.GameRunner;
import com.spring.learnspringframework.game.GamingConsole;
import com.spring.learnspringframework.game.MarioGame;
import com.spring.learnspringframework.game.PacmanGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class GamingConfiguration {
//    @Bean
//    public MarioGame marioGame() {
//        return new MarioGame();
//    }

    @Bean
    public GamingConsole game() {
        var game = new PacmanGame();
        return game;
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game) {
        var gameRunner = new GameRunner(game);
        return gameRunner;
    }

//        var game = new SuperContraGame();
//
//    var gameRunner = new GameRunner(game);
//        gameRunner.run();
}
