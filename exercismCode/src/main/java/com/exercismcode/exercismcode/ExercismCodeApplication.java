package com.exercismcode.exercismcode;

import com.exercismcode.exercismcode.greeter.Greeter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExercismCodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExercismCodeApplication.class, args);

		Greeter greeter = new Greeter();
		greeter.getGreeting();
	}

}
