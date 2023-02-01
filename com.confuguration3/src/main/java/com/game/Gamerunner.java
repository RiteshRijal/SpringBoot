package com.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Gamerunner    {

    Gamingconsole game;
    public Gamerunner(@Qualifier("MarioQualifier") Gamingconsole game){
        this.game=game;
    }
    public void run(){
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
