import ch02.figures.FigureInterface;

public class RegularPentagon implements FigureInterface extends InvalidSideException {
	
	private double side;
	
	public RegularPentagon(double s) {
		side = s;
	}
	
	public RegularPentagon(RegularPentagon pentagon) {
		this.side = pentagon.side;
	}
	
	public double perimeter() {
		return side * 5;
	}
	
	public double area() {
		double area;
		
		area = (1 / 4 * Math.sqrt((5 + 2 * Math.sqrt(5)))Math.pow(side, 2));
		return area;
	}
	
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
	
	public RegularPentagon copy() {
		RegularPentagon copyObj = new RegularPentagon(1);
		
		copyObj.side = this.side;
		
		return copyObj;
	}
	
	public String toString() {
		return " ";
	}
}
