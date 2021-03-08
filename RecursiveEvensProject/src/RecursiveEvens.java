import support.LLNode;
import java.util.Scanner;
/**
 * 
 * @author CJ Fagan
 * A program that reads in positive numbers from the user, stores the numbers in a linked list, uses a
 * recursive method to determine the amount of even numbers in the linked list, and finally outputs the
 * result.
 */
public class RecursiveEvens  {
	/**
	 * 
	 * @param args main method args array
	 */
	public static void main(String [] args) {
		//Setting linked lists
		LLNode<Integer> numList = new LLNode<Integer>(null);
		//Setting counter for number of even numbers
		int counter = 0;
		LLNode<Integer> newNode = new LLNode<Integer>(null);
		//Adding nodes to linked list
		numList.setLink(newNode);
		//Calling instruction method
		instruc();
		Scanner inputKey = new Scanner(System.in);
		
		
		 //Runs as Scanner runs inputting user input until 0 is entered.
		 
		while(inputKey.nextInt() != 0) {
			System.out.print("If you input 0 the program will stop accepting numbers.");
			//User input checking.
			if(inputKey.nextInt() <= -1) {
				System.out.println("This integer has been ignored as it is a negative number");
			}
				else {
					//If valid input, adds number to linkedList for later processing.
					newNode.setLink(new LLNode<Integer>(inputKey.nextInt()));
					newNode = newNode.getLink();
				}
		}
		
		//Closing scanner
		inputKey.close(); 
		//Working list to get info from numList
		LLNode<Integer> currentNode = numList;
		numEvens(currentNode, counter);
	}
		
		
	/**
	 * 
	 * @param currentNode Current node that is being checked for even number.
	 * @param counter Integer that increments when a even number is found. 
	 */
	public static void numEvens(LLNode<Integer> currentNode, int counter) {
		if (currentNode != null) {
			if (currentNode.getInfo() % 2 == 0) { 
				//Runs if even number is found.
				counter++;
				currentNode = currentNode.getLink();
				numEvens(currentNode, counter);
			}
			else {
				//Moves onto next number if odd is found.
				currentNode = currentNode.getLink();
				numEvens(currentNode, counter);
			}
		}
		else {
			//Once currentNode becomes null counter is printed of all evens found.
			System.out.print(counter);
		}
	}
	
	/**
	 * Instruction Method for introducing user to the program.
	 */
	public static void instruc() {
		System.out.println("Hello, this is a program about"
				+ " finding even numbers");
		System.out.println("We will need to collect numbers from you "
				+ "to find the evens in the set");
	}
}
