
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
				mainString = mainString.toUpperCase();
				mainStack.push(mainString);
			}
			
			if (orderString.equals("L")) {
				mainString = mainString.toLowerCase();
				mainStack.push(mainString);
			}
			
			if (orderString.equals("A")) {
				System.out.print("Please input where you "
						+ "would like to change a character");
				int pos = inputKeyboard.nextInt();
				System.out.print("Please input what you would"
						+ " like to change to.");
				String replace = inputKeyboard.nextLine();
				
				if (replace.length() == 1) { 
					mainString.substring(pos, replace.charAt(0));
				}
				else {
					System.out.print("Please input only one character.");
					replace = inputKeyboard.nextLine();
				}
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
				String 
			}
			
			else if (orderString.equals("Z")) {
				mainStack.pop();
			}
			
		}
		
		
	
	}
	
	
}
