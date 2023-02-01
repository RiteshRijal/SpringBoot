package com.spring;

import com.game.Contra;
import com.game.Gamerunner;
import com.game.Gamingconsole;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Gamingconfiguration {

    @Bean
    Gamingconsole game(){
        var game=new Contra();
        return game;
    }
    @Bean
    Gamerunner gamerunner(Gamingconsole game){
        var gamerunner = new Gamerunner(game);
        return gamerunner;
    }



}
