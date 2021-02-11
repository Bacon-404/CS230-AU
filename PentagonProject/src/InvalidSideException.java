/**
 * 
 * @author CJ Fagan
 *
 */

public class InvalidSideException extends Exception {
	
	/**
	 * Explicit Exception method
	 */
	
	public InvalidSideException() {
		super();
	}
	
	/**
	 * 
	 * @param message Returns the message that is passed
	 *  to the class from where the exception is thrown.
	 */
	public InvalidSideException(String message) {
		super(message);
	}
}