
public class RationalDemo {

	public static void main(String[] args) throws InvalidDenominatorException {
		Rational demo1 = new Rational(1,12);
		
		demo1.toString();
		
		String str1 = new String("-3");
		String str2 = new String("12");
		
		Rational demo2 = new Rational(str1, str2);
		
		demo2.toString();
		
		String str3 = new String("1");
		String str4 = new String("3");
		
		Rational demo3 = new Rational(str3, str4);
		
		demo3.toString();
	}

}
