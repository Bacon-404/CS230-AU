import support.LLNode;
import java.util.Scanner;

public class RecursiveEvens {
	
	public static void main(String [] args) {
		LLNode<Integer> numList = new LLNode<Integer>(null);
		
		LLNode<Integer> newNode = new LLNode<Integer>(null);
		
		numList.setLink(newNode);
		instruc();
		Scanner inputKey = new Scanner(System.in);
		
		while(inputKey.nextLine() == "0") {
			newNode.setLink(new LLNode<Integer>(inputKey.nextInt()));
			newNode = newNode.getLink();
		}
		
		inputKey.close();
		
		numEvens();
	}
		
		
	
	public static void numEvens() {
		num % 2 == 0
	}
	
	
	public static void instruc() {
		System.out.println("Hello, this is a program about"
				+ " finding even numbers");
		System.out.println("We will need to collect numbers from you "
				+ "to find the evens in the set");
	}
}
