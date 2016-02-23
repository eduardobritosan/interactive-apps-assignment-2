package ejercicio3;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		try {
			Parser parser = new Parser(args[0]);
			Comparator comparator = new Comparator(parser.getFileArray());
			System.out.println(comparator.getDiff());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
