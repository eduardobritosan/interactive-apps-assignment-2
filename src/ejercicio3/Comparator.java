package ejercicio3;

/**
 * A class used to see the maximum, minimum and difference between each other in a Double array.
 * 
 * @author eebritos
 * @version 1.0.0
 * @since 2016-19-02
 * 
 */
import java.util.ArrayList;

public class Comparator {

	private ArrayList<Double> array;
	private Double min;
	private Double max;
	
	public Comparator(ArrayList<Double> array) {
		setArray(array);
		setMin(Double.MAX_VALUE);
		setMax(Double.MIN_VALUE);
		calcMin();
		calcMax();
	}
	
	private void calcMin(){
		for (Double arrayElement : getArray()) {
			if (arrayElement < getMin()) {
				setMin(arrayElement);
			}
		}
	}
	
	private void calcMax(){
		for (Double arrayElement : getArray()) {
			if (arrayElement > getMax()) {
				setMax(arrayElement);
			}
		}
	}
	
	public Double getDiff(){
		return Math.abs(getMax() - getMin());
	}

	/**
	 * @return the array
	 */
	public ArrayList<Double> getArray() {
		return array;
	}

	/**
	 * @param array the array to set
	 */
	public void setArray(ArrayList<Double> array) {
		this.array = array;
	}

	/**
	 * @return the min
	 */
	public Double getMin() {
		return min;
	}

	/**
	 * @param min the min to set
	 */
	public void setMin(Double min) {
		this.min = min;
	}

	/**
	 * @return the max
	 */
	public Double getMax() {
		return max;
	}

	/**
	 * @param max the max to set
	 */
	public void setMax(Double max) {
		this.max = max;
	}

}
