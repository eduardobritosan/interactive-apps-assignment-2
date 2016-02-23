package ejercicio4;

/**
 * Class that compares two Doubles with a set precision value (epsilon)
 * 
 * @author eebritos
 * @version 1.0.0
 * @since 2016-20-02
 */

public class CasiCero {

	private static final Double EPSILON = Math.pow(10, -17);

	public static void main(String[] args) {
		System.out.println(args[0] + " y " + args[1] + " son iguales: " + compare(Double.parseDouble(args[0]), Double.parseDouble(args[1])));

	}
	
	private static boolean compare(Double firstVal, Double secondVal){
		return Math.abs(firstVal - secondVal) <= Math.max(firstVal, secondVal) * EPSILON; 
	}
}
