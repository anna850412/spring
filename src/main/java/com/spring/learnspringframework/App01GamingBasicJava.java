package com.spring.learnspringframework;

import com.spring.learnspringframework.game.GameRunner;
import com.spring.learnspringframework.game.PacmanGame;

public class App01GamingBasicJava {
    public static void main(String[] args){
//        var game = new MarioGame();
        var game = new PacmanGame();
//        var game = new SuperContraGame();

        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
