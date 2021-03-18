import ch04.queues.QueueUnderflowException;

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
		multiQueue.enqueue(7);
		multiQueue.enqueue(3);
		multiQueue.enqueue(5);
		multiQueue.enqueue(11);
		multiQueue.enqueue(12);
		multiQueue.enqueue(71);
		multiQueue.enqueue(52);
		multiQueue.enqueue(34);
		multiQueue.enqueue(29);
		multiQueue.enqueue(32);
		multiQueue.enqueue(15);
		
		
		exceptionQueue.enqueue(1);
		exceptionQueue.enqueue(9);
		
		try {
		emptyQueue.toString();
		}
		catch (QueueUnderflowException qunflow1) {
			System.out.println("Works as expected");
		}
		
		System.out.println(oneQueue.toString());
		System.out.println(multiQueue.toString());
		
		
		System.out.println(emptyQueue.space());
		System.out.println(oneQueue.space());
		System.out.println(multiQueue.space());
		
		ArrayBoundedQueue2<Integer> fullQueue = 
				new ArrayBoundedQueue2<Integer>(1);
		fullQueue.enqueue(23);
		
		System.out.println(fullQueue.space());
		try {
		emptyQueue.remove(3);
		} 
		catch (QueueUnderflowException qunflow2) {
			System.out.println("Works as expected");
		}
		
		
		multiQueue.remove(5);
		System.out.println(multiQueue.toString());
		
		System.out.println(emptyQueue.swapStart());
		System.out.println(oneQueue.swapStart());
		
		System.out.println(exceptionQueue.swapStart());
		
		multiQueue.swapStart();
		System.out.println(multiQueue.toString());
		
		
		System.out.println(emptyQueue.swapEnds());
		System.out.println(oneQueue.swapEnds());
		System.out.println(exceptionQueue.swapEnds());
		multiQueue.swapEnds();
		System.out.println(multiQueue.toString());
	}
	
	
	
	
	
}
