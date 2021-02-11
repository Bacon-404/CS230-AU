public class InvalidSideException extends Exception {
	
	public InvalidSideException() {
		super();
	}
	
	
	public InvalidSideException(int s) {
		super("Error: Side value:" + s + "not valid,"
				+ " must be greater than -1.");
	}
}