/**
 * 
 */
/**
 * @author Christian Fagan
 *
 */


public class Rational {
	
	int numerator = 0;
	int denominator = 0;
	
	/** 
	 * 
	 * @param a The value that the numerator will be set to.
	 * @throws InvalidDenominatorException 
	 */
	public Rational(int num, int den) throws InvalidDenominatorException {
		numerator = num;
		if (den <= -1) {
			throw new InvalidDenominatorException();
		}
		else if (den > -1) {
			denominator = den;
		}

	}
	
	public Rational(String num, String den) throws InvalidDenominatorException  {
		numerator = Integer.parseInt(num);
		
		if (Integer.parseInt(den) > 0) {
			denominator = Integer.parseInt(den);
		}
		
		else {
			throw new InvalidDenominatorException();
		}
	}
	
	public Rational(Rational rational) {
		this.numerator = rational.numerator;
		this.denominator = rational.denominator;
	}
	
	public int getNumerator() {
		return numerator;
	}
	
	public int getDenominator() {
		return denominator;
	}
	
	public double getDecimal() {
		return this.numerator / this.denominator;
	}
	
	public boolean equals(Rational rational) {
		boolean result;
		
		if (this.equals(rational)) {
			result = true;
		}
		else {
			result = false;
		}
		return result;
		
	}
	
	public Rational copy() {
		Rational copyObj = null;
		copyObj.numerator = this.numerator;
		copyObj.denominator = this.denominator;
		
		return copyObj;
	}
	
	@Override
	public String toString() {
		return " " + numerator + "/" + denominator + " ";
	}
}