package com.spring;

import com.confuguration.SpringConfiguration;
import com.game.Contra;
import com.game.Gamerunner;
import com.game.Gamingconsole;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@SpringBootApplication
@Configuration
@ComponentScan("com.game")
public class Application {
//	@Bean
//	Gamingconsole game(){
//		var game=new Contra();
//		return game;
//	}
//	@Bean
//	Gamerunner gamerunner(Gamingconsole game){
//		var gamerunner = new Gamerunner(game);
//		return gamerunner;
//	}

	public static void main(String[] args) {

		try (var context=new AnnotationConfigApplicationContext(Application.class)) {
				context.getBean(Gamingconsole.class).up();
				context.getBean(Gamerunner.class).run();
		};



	}

}
