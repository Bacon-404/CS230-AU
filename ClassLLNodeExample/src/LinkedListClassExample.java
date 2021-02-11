import support.LLNode;

public class LinkedListClassExample {
	public static void main(String [] args) {
		// Create inital list node
		LLNode<String> list = new LLNode<String>("C");
		
		
		// Add nodes to the linked list
		LLNode<String> newNode = new LLNode<String>("J");
		list.setLink(newNode);
		
		newNode.setLink(new LLNode<String>("F"));
		newNode = newNode.getLink();
		
		newNode.setLink(new LLNode<String>("A"));
		newNode = newNode.getLink();
		
		newNode.setLink(new LLNode<String>("G"));
		newNode = newNode.getLink();
		
		newNode.setLink(new LLNode<String>("A"));
		newNode = newNode.getLink();
		
		newNode.setLink(new LLNode<String>("N"));
		newNode = newNode.getLink();
		
		//output
		LLNode<String> currentNode = list;
		
		while(currentNode != null) {
			System.out.print(currentNode.getInfo());
			currentNode = currentNode.getLink();
		}
		
	}
}
