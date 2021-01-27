
public class InvalidDenominatorException extends Exception {
	
	public InvalidDenominatorException() {
		super("Error: Denominator value not valid, must be greater than -1.");
	}
}
