
/**
 * @author Christian Fagan
 *
 */

public class Rational {
	
	private int numerator = 0;
	private int denominator = 0;
	
	/**
	 * @param num integer numerator attribute
	 * @param den integer denominator attribute
	 * @throws InvalidDenominatorException Thrown if there is a 0 inputted 
	 * into the program
	 */
	
	public Rational(int num, int den) throws InvalidDenominatorException {
		numerator = num;
		if (den <= 0) {
			throw new InvalidDenominatorException(den);
		}
		else if (den > 0) {
			denominator = den;
		}

	}
	
	/**
	 * 
	 * @param num String form of numerator argument
	 * @param den String form of denominator argument
	 * @throws InvalidDenominatorException Throws if data input into program is invalid
	 */
	
	public Rational(String num, String den) throws InvalidDenominatorException  {
		numerator = Integer.parseInt(num);
		
		if (Integer.parseInt(den) > 0) {
			denominator = Integer.parseInt(den);
		}
		
		else {
			throw new InvalidDenominatorException();
		}
	}
	
	/**
	 * 
	 * @param rational Copy constructor for new object 
	 * using current object's fields
	 */
	
	public Rational(Rational rational) {
		this.numerator = rational.numerator;
		this.denominator = rational.denominator;
	}
	/**
	 * 
	 * @return Returns objects numerator field
	 */
	
	public int getNumerator() {
		return numerator;
	}
	
	/**
	 * 
	 * @return Returns object's denominator field
	 */
	
	public int getDenominator() {
		return denominator;
	}
	
	/**
	 * 
	 * @return Returns decimal form of the object's fraction
	 */
	
	public double getDecimal() {
		return this.numerator / this.denominator;
	}
	
	/**
	 * 
	 * @param rational Object that this current object is comparing against
	 * @return Returns true or false based on if the fields are the same
	 */
	
	public boolean equals(Rational rational) {
		boolean result;
		
		if (this.numerator == rational.numerator && 
				this.denominator == rational.denominator) {
			result = true;
		}
		else {
			result = false;
		}
		return result;
		
	}
	
	/**
	 * 
	 * @return Returns new object that is copied from current object
	 * @throws InvalidDenominatorException Since an object is created
	 * here to be changed, throws declaration was needed.
	 */
	
	public Rational copy() throws InvalidDenominatorException {
		//Eclipse was being irrational so I set integer args to make it happy
		Rational copyObj = new Rational(1,1);
		
		copyObj.numerator = this.numerator;
		copyObj.denominator = this.denominator;
		
		return copyObj;
	}
	
	/**
	 *  ToString method that overrides super toString method
	 */
	
	@Override
	public String toString() {
		return " " + numerator + "/" + denominator + " ";
	}
}