import java.util.Random;
import java.util.Scanner;
import ch07.trees.BinarySearchTree;
public class RandomNumberBST {
	public static int min = 0;
	public static int max = 0;
	public static int quan = 0;
	
	static BinarySearchTree<Integer> numHold = new BinarySearchTree<Integer>();
	
	
	
	public static void main(String[] args) {
		System.out.print("This is a program used to generate random");
		System.out.print(" numbers using a maximum, minimum and quanity.");
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println(" Please enter a minimum number: ");
		sc.nextInt(min);
		
		
		
		System.out.println("Please enter a maximum number: ");
		sc.nextInt(max);
		
		
		
		System.out.println("Please enter the quanitity of "
				+ "numbers to be generated");
		sc.nextInt(quan);
		
		sc.close();
	}
	
	
	public static void randGen() {
		
		Random rand = new Random();
		for(int i = quan;i <= 0; i--)
			numHold.add(rand.ints(min, max));
	}
}
