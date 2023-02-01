package com.lunch;


import com.database.Bussinesscal;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;





@SpringBootApplication
@Configuration
@ComponentScan("com.database")
public class Databaseluncher {
	public static void main(String[] args) {

		try (var context=
					 new AnnotationConfigApplicationContext
							 (Databaseluncher.class)) {
			System.out.println(context.getBean(Bussinesscal.class).findMax());



		};
	}

}
