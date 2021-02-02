
public class RationalDemo {

	public static void main(String[] args) throws InvalidDenominatorException {
		
		
		//First Rational Object using first constructor
		Rational demo1 = new Rational(1,12);
		
		demo1.toString();
		System.out.print(demo1);
		
		//Second Rational object using second constructor
		String str1 = new String("-3");
		String str2 = new String("12");
		
		Rational demo2 = new Rational(str1, str2);
		
		demo2.toString();
		System.out.print(demo2);
		
		//Third Rational object using second constructor
		String str3 = new String("1");
		String str4 = new String("3");
		
		Rational demo3 = new Rational(str3, str4);
		
		demo3.toString();
		System.out.print(demo3);
		
		//Fourth Rational object using second constructor
		String str5 = new String("-3");
		String str6 = new String("15");
		
		Rational demo4 = new Rational(str5, str6);
		
		demo4.toString();
		System.out.print(demo4);
		
		//Fifth Rational object using first object in copy constructor
		Rational demo5 = new Rational(demo1);
		demo5.toString();
		System.out.print(demo5);
		
		//Sixth Rational object using second object in copy method
		Rational demo6 = new Rational(demo2.copy());
		demo6.toString();
		System.out.print(demo6);
		
		//First comparison method call series on first object
		System.out.print(demo1.equals(demo2)+ " " + demo1.equals(demo3) + " " 
		+ demo1.equals(demo4) + " " + demo1.equals(demo5) + " " +
				demo1.equals(demo6) + " ");
		
		//Second comparison method call series on second object
		System.out.print(demo2.equals(demo3) + " " 
				+ demo2.equals(demo4) + " " + demo2.equals(demo5) + " " +
						demo2.equals(demo6) + " ");
		
		//Third comparison method call series on third object
		System.out.print(demo3.equals(demo4) + " " + demo3.equals(demo5) + " " +
						demo3.equals(demo6) + " ");
		
		//Fourth comparison method call series on fourth object
		System.out.print(demo4.equals(demo5) + " " +
				demo3.equals(demo6) + " ");
	}

}
