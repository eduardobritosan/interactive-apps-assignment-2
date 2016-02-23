package ejercicio2;

/**
 * Java program that counts the amount of a's, uppercase or lowercase, contained inside a sentence written in real time by the user.
 * 
 * @author eebritos
 * @version 1.0.0
 * @since 2016-19-02
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {


	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 
		System.out.println("Introduzca el texto a analizar");
		try {
			String text = in.readLine();
			int count = text.length() - text.replaceAll("[aA]", "").length(); //The regexp allows for it to match being case insensitive.
			System.out.println(count);

		} catch (IOException e) {
			System.out.println("Error en la introduccion de datos");
			e.printStackTrace();
		}

	}

}
