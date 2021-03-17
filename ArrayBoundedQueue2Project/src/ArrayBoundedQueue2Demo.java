
public class ArrayBoundedQueue2Demo {
	
	public static void main(String[] args) {
		
		ArrayBoundedQueue2<Integer> emptyQueue = 
				new ArrayBoundedQueue2<Integer>();
		ArrayBoundedQueue2<Integer> oneQueue = 
				new ArrayBoundedQueue2<Integer>();
		ArrayBoundedQueue2<Integer> multiQueue = 
				new ArrayBoundedQueue2<Integer>();
		
		ArrayBoundedQueue2<Integer> exceptionQueue = 
				new ArrayBoundedQueue2<Integer>();
		
		oneQueue.enqueue(4);
		
		multiQueue.enqueue(1);
		multiQueue.enqueue(5);
		multiQueue.enqueue(8);
		multiQueue.enqueue(9);
		
		exceptionQueue.enqueue(1);
		exceptionQueue.enqueue(9);
		
		//emptyQueue.toString();
		
		//oneQueue.toString();
		//multiQueue.toString();
		
		
		//emptyQueue.space();
		//oneQueue.space();
		//multiQueue.space();
		
		//ArrayBoundedQueue2<Integer> fullQueue = 
				//new ArrayBoundedQueue2<Integer>(1);
		//fullQueue.enqueue(23);
		
		//fullQueue.space();
		
		//emptyQueue.remove(0);
		
		//multiQueue.remove(2);
		//multiQueue.toString();
		
		//emptyQueue.swapStart();
		//oneQueue.swapStart();
		
		//exceptionQueue.swapStart();
		
		//multiQueue.enqueue(4);
		//multiQueue.enqueue(7);
		
		//multiQueue.swapStart();
		//multiQueue.toString();
		
		
		//emptyQueue.swapEnds();
		//oneQueue.swapEnds();
		//exceptionQueue.swapEnds();
		//multiQueue.swapEnds();
		//multiQueue.toString();
	}
	
	
	
	
	
}
