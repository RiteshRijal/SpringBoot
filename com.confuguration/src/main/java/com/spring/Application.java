package com.spring;

import com.confuguration.SpringConfiguration;
import com.game.Gamerunner;
import com.game.Gamingconsole;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		try (var context=new AnnotationConfigApplicationContext(Gamingconfiguration.class)) {
				context.getBean(Gamingconsole.class).up();
				context.getBean(Gamerunner.class).run();
		};



	}

}
