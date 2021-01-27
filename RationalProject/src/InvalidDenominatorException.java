
public class InvalidDenominatorException extends Exception {
	
	public InvalidDenominatorException() {
		super();
	}
	
	
	public InvalidDenominatorException(int den) {
		super("Error: Denominator value:" + den + "not valid,"
				+ " must be greater than -1.");
	}
}
