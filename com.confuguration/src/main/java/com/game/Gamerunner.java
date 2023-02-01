package com.game;

public class Gamerunner    {

    Gamingconsole game;
    public Gamerunner(Gamingconsole game){
        this.game=game;
    }
    public void run(){
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
