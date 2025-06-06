package com.exercismcode.exercismcode;

import com.exercismcode.exercismcode.greeter.Greeter;
import com.exercismcode.exercismcode.jedlikstoycar.JedliksToyCar;
import com.exercismcode.exercismcode.squeakyclean.SqueakyClean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExercismCodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExercismCodeApplication.class, args);

		// Greeter greeter = new Greeter();
		// greeter.getGreeting();

		JedliksToyCar car = new JedliksToyCar();
		// Drain the battery
		for (int i = 0; i < 17; i++) {
			car.drive();
		}

		System.out.println(car.distanceDisplay());


	}

}
