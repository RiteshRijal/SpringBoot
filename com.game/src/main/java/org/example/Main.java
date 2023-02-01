package org.example;

import game.Contra;
import game.Gamerunner;
import game.Pacman;

public class Main {
    public static void main(String[] args) {
       // var game = new Mario();
     //   var game=new Contra();
        var game=new Pacman();

        var gamerunner = new Gamerunner(game);

        gamerunner.run();
    }
}