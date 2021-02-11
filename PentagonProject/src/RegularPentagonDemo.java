/**
 * 
 * @author CJ fagan
 *
 */

public class RegularPentagonDemo {
	
	/**
	 * 
	 * @param args Standard main method arguments.
	 * @throws InvalidSideException Throws if any of the objects 
	 * have sides smaller than 0.
	 */
	
	public static void main(String [] args) throws InvalidSideException {
	RegularPentagon demo1 = new RegularPentagon(5.4);
	demo1.toString();
	demo1.area();
	demo1.perimeter();
	
	RegularPentagon demo2 = new RegularPentagon(14.6);
	
	System.out.print(demo2.toString());
	demo2.perimeter();
	demo2.area();
	
	RegularPentagon demo3 = new RegularPentagon(demo1);
	
	System.out.print(demo3.toString());
	demo3.area();
	demo3.perimeter();
	
	RegularPentagon demo4 = new RegularPentagon(demo2.copy());
	demo4.toString();
	demo4.area();
	demo4.perimeter();
	
	//Third comparison method call series on third object
	System.out.print(demo1.equals(demo2) + " " + demo1.equals(demo3)
		+ " " + demo1.equals(demo4) + " ");
		
	System.out.print(demo2.equals(demo3) + " " + demo2.equals(demo4) + " ");
		
	System.out.print(demo3.equals(demo4));
	}
}
