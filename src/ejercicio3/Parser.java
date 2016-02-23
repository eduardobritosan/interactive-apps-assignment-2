package ejercicio3;

/**
 * Parser class that reads a file filled with Doubles, 1 in each line.
 * 
 * @author eebritos
 * @version 1.0.0
 * @since 2016-19-02
 * 
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Parser {
	
	private BufferedReader reader;
	
	public Parser() {}
	
	public Parser(String filename) throws IOException {
		FileReader fileReader = new FileReader(filename);
		setReader(new BufferedReader(fileReader));
	}
	
	public ArrayList<Double> getFileArray(){
		ArrayList<Double> auxArray = new ArrayList<Double>();
		
		try {
			while (getReader().ready()) {
				String auxString = getReader().readLine();
				if (auxString != null) {
					auxArray.add(Double.parseDouble(auxString));
				}
			}
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return auxArray;
	}

	/**
	 * @return the reader
	 */
	public BufferedReader getReader() {
		return reader;
	}

	/**
	 * @param reader the reader to set
	 */
	public void setReader(BufferedReader reader) {
		this.reader = reader;
	}
}
