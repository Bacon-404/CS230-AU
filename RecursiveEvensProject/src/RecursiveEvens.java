import support.LLNode;
import java.util.Scanner;

public class RecursiveEvens {
	
	public static void main(String [] args) {
		LLNode<String> numList = new LLNode<String>(null);
		
		LLNode<String> newNode = new LLNode<String>(null);
		
		numList.setLink(newNode);
		instruc();
		Scanner inputKey = new Scanner(System.in);
		
		while(inputKey.hasNextInt()) {
			newNode.setLink(new LLNode<String>(inputKey.nextLine()));
			newNode = newNode.getLink();
			if (inputKey.nextLine() == "0") {
				inputKey.close();
				break;
			}
		}
		
		
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
