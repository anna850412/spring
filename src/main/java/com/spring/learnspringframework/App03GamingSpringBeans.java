package com.spring.learnspringframework;

import com.spring.learnspringframework.game.GameRunner;
import com.spring.learnspringframework.game.GamingConsole;
import com.spring.learnspringframework.game.PacmanGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.annotation.Annotation;

public class App03GamingSpringBeans {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(GamingConfiguration.class);
        context.getBean(GamingConsole.class).up();
        context.getBean(GameRunner.class).run();
        System.out.println(context.getBean("game"));
    }
}
