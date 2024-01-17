package com.spring.learnspringframework.game;

public class PacmanGame implements GamingConsole {
    public void up(){
        System.out.println("Jump pacman");
    }
    public void down(){
        System.out.println("Go into a hole pacman");
    }
    public void left(){
        System.out.println("Go left pacman");
    }
    public void right(){
        System.out.println("Go right pacman");
    }
}
