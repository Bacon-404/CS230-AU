import ch02.figures.FigureInterface;
/**
 * 
 * @author Cj Fagan
 *
 */
public class RegularPentagon extends InvalidSideException implements FigureInterface {
	
	private double side;
	/**
	 * 
	 * @param s Side argument, has to be bigger than 0
	 * @throws InvalidSideException if the side is 
	 * smaller than 0 the exception is thrown
	 */
	public RegularPentagon(double s) throws InvalidSideException {
		
		if (s <= 0) {
			throw new InvalidSideException("Error: side value not valid,"
					+ " must be greater than -1.");
		}
		else if (s > 0) {
			side = s;
		}
	}
	/**
	 * 
	 * @param pentagon Copy Constructor, uses another 
	 * Pentagon object as a base for the new object
	 */
	public RegularPentagon(RegularPentagon pentagon) {
		this.side = pentagon.side;
	}
	/**
	 *  Returns perimeter of object using the perimeter formula
	 */
	public double perimeter() {
		return side * 5;
	}
	/**
	 *  Returns area of object using the pentagon's formula
	 */
	public double area() {
		double z = 5; //Hardcoded in because Math functions were reading as int
		double y = 2; //rather than double which the function calls for.
		
		double area = (1 / 4 * Math.sqrt((z + y * Math.sqrt(z))) * Math.pow(side, y));
		return area;
	}
	/**
	 * 
	 * @param pentagon The object the base object is 
	 * being compared against.
	 * @return Returns a boolean value on whether or not 
	 */
	public boolean equals(RegularPentagon pentagon) {
		boolean result;
		
		if (this.side == pentagon.side) {
			result = true;
		}
		else {
			result = false;
		}
		return result;
	}
	/**
	 * 
	 * @return Returns copied object
	 * @throws InvalidSideException Throws an exception if in the off 
	 * chance the base object has a invalid side attribute
	 */
	public RegularPentagon copy() throws InvalidSideException {
		RegularPentagon copyObj = new RegularPentagon(1); 
		//Doesn't play nice if initialized as null.
		
		copyObj.side = this.side;
		
		return copyObj;
	}
	/**
	 * toString method that calls the side attribute.
	 */
	public String toString() {
		return "Side: " + side + " ";
	}
}
