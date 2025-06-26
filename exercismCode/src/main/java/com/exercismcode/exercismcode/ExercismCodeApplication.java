package com.exercismcode.exercismcode;

import com.exercismcode.exercismcode.captainslog.CaptainsLog;
import com.exercismcode.exercismcode.footballmatchreports.FootballMatchReports;
import com.exercismcode.exercismcode.greeter.Greeter;
import com.exercismcode.exercismcode.jedlikstoycar.JedliksToyCar;
import com.exercismcode.exercismcode.loglevels.LogLevels;
import com.exercismcode.exercismcode.logslogslogs.LogLine;
import com.exercismcode.exercismcode.salarycalculator.SalaryCalculator;
import com.exercismcode.exercismcode.squeakyclean.SqueakyClean;
import com.exercismcode.exercismcode.timfrommarketing.Badge;
import com.exercismcode.exercismcode.wizardsandwarriors.Warrior;
import com.exercismcode.exercismcode.wizardsandwarriors.Wizard;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Random;

@SpringBootApplication
public class ExercismCodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExercismCodeApplication.class, args);

		// Greeter greeter = new Greeter();
		// greeter.getGreeting();

		//JedliksToyCar car = new JedliksToyCar();
		// Drain the battery
		/*
		for (int i = 0; i < 17; i++) {
			car.drive();
		}
		 */

		/*
		SalaryCalculator salaryCalculator = new SalaryCalculator();
		System.out.println(salaryCalculator.finalSalary(2,90));
		 */

		// System.out.println(FootballMatchReports.onField(11));

		/* Wizard wizard = new Wizard();
		Warrior warrior = new Warrior();

		System.out.println(wizard.getDamagePoints(warrior));
		wizard.prepareSpell();
		 */

		/*var logLine = new LogLine("[ERR]: Stack Overflow");
		System.out.println(logLine.getOutputForShortLog());
		*/

		/*Badge badge = new Badge();
		System.out.println(badge.print(254, "Charlotte Hale", null));
		 */

		CaptainsLog captainsLog = new CaptainsLog(new Random());
		System.out.println(captainsLog.randomPlanetClass());
		System.out.println(captainsLog.randomShipRegistryNumber());
		System.out.println(captainsLog.randomShipRegistryNumber());
		System.out.println(captainsLog.randomShipRegistryNumber());
		System.out.println(captainsLog.randomShipRegistryNumber());
		System.out.println(captainsLog.randomShipRegistryNumber());


	}

}
