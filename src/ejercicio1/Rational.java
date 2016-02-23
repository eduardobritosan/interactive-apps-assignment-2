package ejercicio1;
/**
 * A Rational numbers class, implemented using Java wrappers, and implementing some basic arithmetic operations.
 * @author eebritos
 * @version 1.0.0
 * @since 2016-23-02
 */
public class Rational {
	
	private Integer numerator;
	private Integer denominator;
	
	public Rational() {
		numerator = 1;
		denominator = 1;
	}
	
	/**
	 * 
	 * @param numerator	The value to be set as the numerator of the Rational object being instanced.
	 * @param denominator The value to be set as the denominator of the Rational object being instanced.
	 */
	public Rational(int numerator, int denominator){
		setNumerator(numerator);
		if (denominator != 0) {
			setDenominator(denominator);
		}
		else {
			throw new IllegalArgumentException();
		}
		
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Rational [numerator=" + numerator + ", denominator="
				+ denominator + "]";
	}
	
	public Rational sum(Rational b){
		return new Rational((b.getDenominator() * getNumerator() + getDenominator() * b.getNumerator()), getDenominator() * b.getDenominator());
	}
	
	public Rational substraction(Rational b){
		return new Rational((b.getDenominator() * getNumerator() - getDenominator() * b.getNumerator()), getDenominator() * b.getDenominator());
	}
	
	public Rational multiplication(Rational b){
		return new Rational(b.getNumerator() * getNumerator(), b.getDenominator() * getDenominator());
	}
	
	public Rational division(Rational b){
		return multiplication(new Rational(b.getDenominator(), b.getNumerator()));
	}

	/**
	 * @return the numerator
	 */
	private Integer getNumerator() {
		return numerator;
	}

	/**
	 * @param numerator the numerator to set
	 */
	private void setNumerator(Integer numerator) {
		this.numerator = numerator;
	}

	/**
	 * @return the denominator
	 */
	private Integer getDenominator() {
		return denominator;
	}

	/**
	 * @param denominator the denominator to set
	 */
	private void setDenominator(Integer denominator) {
		this.denominator = denominator;
	}
	
	

}
