package ejercicio5;

/**
 * Java program that gets two dates as arguments and calculates how many years have passed in between them. Uses Java 8 .time package, very useful.
 * @author eebritos
 * 
 */

import java.time.LocalDate;
import java.time.Period;

public class Age {

	public static void main(String[] args) {	
		String[] bdayArray = args[0].split("/");
		String[] nowArray = args[1].split("/");
		String parsedBD = bdayArray[2] + "-" + bdayArray[1] + "-" + bdayArray[0];
		String parsedNow = nowArray[2] + "-" + nowArray[1] + "-" + nowArray[0];
		
		LocalDate birthDay = LocalDate.parse(parsedBD);
		LocalDate now = LocalDate.parse(parsedNow);
		long numberOfYears = Period.between(birthDay, now).getYears();
		System.out.println("Desde " + args[0] + " hasta " + args[1] + " han pasado " + numberOfYears + " años");
	}

}
