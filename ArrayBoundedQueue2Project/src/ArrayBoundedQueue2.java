
import ch04.queues.QueueInterface;
import ch04.queues.QueueOverflowException;
import ch04.queues.QueueUnderflowException;
/**
 * 
 * @author CJ Fagan
 *
 * @param <T> Generic type for the array.
 */
public class ArrayBoundedQueue2<T> implements QueueInterface<T>
{
  protected final int DEFCAP = 100; // default capacity
  protected T[] elements;           // array that holds queue elements
  protected int numElements = 0;    // number of elements in this queue
  protected int front = 0;          // index of front of queue
  protected int rear;               // index of rear of queue
  /**
   * 
   */
  public ArrayBoundedQueue2() 
  {
    elements = (T[]) new Object[DEFCAP];
    rear = DEFCAP - 1;
  }
  /**
   * 
   * @param maxSize Argument provided in object 
   * creation for max size of the queue.
   */
  public ArrayBoundedQueue2(int maxSize) 
  {
    elements = (T[]) new Object[maxSize];
    rear = maxSize - 1;
  }
  /**
   * Enqueue method provided by the interface. 
   * Adds elements to the queue
   */
  public void enqueue(T element)
  // Throws QueueOverflowException if this queue is full;
  // otherwise, adds element to the rear of this queue.
  {  
    if (isFull())
      throw new QueueOverflowException("Enqueue attempted on a full queue.");
    else
    {
      rear = (rear + 1) % elements.length;
      elements[rear] = element;
      numElements = numElements + 1;
    }
  }
  /**
   * Dequeue method provided by the interface. 
   * Removes elements from the queue.
   */
  public T dequeue()
  // Throws QueueUnderflowException if this queue is empty;
  // otherwise, removes front element from this queue and returns it.
  {   
    if (isEmpty())
      throw new QueueUnderflowException("Dequeue attempted on empty queue.");
    else
    {
      T toReturn = elements[front];
      elements[front] = null;
      front = (front + 1) % elements.length;
      numElements = numElements - 1;
      return toReturn;
    }
  }
  /**
   * Boolean method for determining if queue is empty.
   */
  public boolean isEmpty()
  // Returns true if this queue is empty; otherwise, returns false.
  {              
    return (numElements == 0);
  }
  /**
   * Boolean method for determining if queue is empty.
   */
  public boolean isFull()
  // Returns true if this queue is full; otherwise, returns false.
  {              
    return (numElements == elements.length);
  }
  /**
   * Returns the number of elements in this queue.
   */
  public int size()
  // Returns the number of elements in this queue.
  {
    return numElements;
  }
  
	
	//Actual assignment code
  
  	/**
  	 * @return Outputs the whole of the queue as a concatenated string.
  	 */
	@Override
	public String toString() {
		String str = new String();
		String strHold = new String();
		for (int i = numElements; i <= 0; i--) {
			strHold = " " + elements[i];
			str.concat(strHold);
			strHold = null;
		}
		return str;
		
	}
	/**
	 * 
	 * @return Returns the space left in the queue.
	 */
	public int space() {
		return elements.length - numElements;
		
	}
	/**
	 * 
	 * @param count Argument given for number of elements to remove.
	 * @throws QueueUnderflowException Thrown if the count argument 
	 * is larger than the amount of elements in the queue.
	 */
	public void remove(int count) throws QueueUnderflowException {
		if (count > numElements) {
			throw new QueueUnderflowException();
		}
		else {
			front = (front + count) % elements.length;
			numElements = numElements - count;
		}
	}
	/**
	 * 
	 * @return Swaps the first two elements in the queue.
	 * Uses temporary variables to swap the indexes to the objects.
	 */
	public boolean swapStart() {		
		if (numElements > 2) {
			return false;
		}
		else {
			int holdFront1 = front;
			int holdFront2 = (front + 1) % elements.length;
			
			T swapFrontHold = elements[holdFront1];
			elements[holdFront1] = elements[holdFront2];
			elements[holdFront2] = swapFrontHold;
			return true;
		}
	}
	/**
	 * 
	 * @return Swaps the rearmost elements in the queue. 
	 * Uses temporary variables to swap the indexes to the objects.
	 */
	public boolean swapEnds() {
		if (numElements > 2) {
			return false;
		}
		else {
			
			int holdRear1 = rear;
			int holdRear2 = (rear - 1) % elements.length;
			
			T swapEndHold = elements[holdRear1];
			elements[holdRear1] = elements[holdRear2];
			elements[holdRear2] = swapEndHold;
			return true;
		}
	}
	
}
