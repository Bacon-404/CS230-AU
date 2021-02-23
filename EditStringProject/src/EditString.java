
import ch02.stacks.*;
import java.util.Scanner;

public class EditString {

	
	public static void main(String [] args) {
		ArrayBoundedStack<String> mainStack = new ArrayBoundedStack<String>();
		
	
		Scanner inputKeyboard = new Scanner(System.in);
		System.out.print("Please input a string to edit.");
		
		String mainString = inputKeyboard.nextLine();
		
		mainStack.push(mainString);
		System.out.println();
		String orderString = inputKeyboard.nextLine();
		while (!(orderString.equals("X")))	 {
			
			if (orderString.equals("U")) {
				mainString = mainStack.peek().toUpperCase();
				mainStack.push(mainString);
			}
			
			if (orderString.equals("L")) {
				mainString = mainStack.peek().toLowerCase();
				mainStack.push(mainString);
			}
			
			if (orderString.equals("A")) {
				System.out.print("Please input where you "
						+ "would like to change a character");
				int pos = inputKeyboard.nextInt();
				String replace = inputKeyboard.nextLine();
				
			}
			
			if (orderString.equals("C")) {
				System.out.print("Please type out the string you "
						+ "would like to add and press enter");
				String conString = inputKeyboard.nextLine();
				mainString = mainString + conString;
				
				System.out.print("Your changes have been added.");
				mainStack.push(mainString);
				
			}
			
			if (orderString.equals("R")) {
				
			}
			
			else if (orderString.equals("Z")) {
				mainStack.pop();
			}
			
		}
	
	}
	
	
}
