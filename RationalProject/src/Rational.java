/**
 * 
 */
/**
 * @author Christian Fagan
 *
 */

import InvalidDenominatorException;

public class Rational {
	
	int numerator = 0;
	int denominator = 0;
	
	/** 
	 * 
	 * @param a The value that the numerator will be set to.
	 */
	public Rational(int num, int den) {
		numerator = num;
		if (den <= -1)
			throw InvalidDenominatorException;
		denominator = den;
	}
	
	public Rational(String num, String den) {
		
	}

		
}