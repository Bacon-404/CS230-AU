
import ch04.queues.QueueInterface;
import ch04.queues.QueueOverflowException;
import ch04.queues.QueueUnderflowException;

public class ArrayBoundedQueue2<T> implements QueueInterface<T>
{
  protected final int DEFCAP = 100; // default capacity
  protected T[] elements;           // array that holds queue elements
  protected int numElements = 0;    // number of elements in this queue
  protected int front = 0;          // index of front of queue
  protected int rear;               // index of rear of queue

  public ArrayBoundedQueue2() 
  {
    elements = (T[]) new Object[DEFCAP];
    rear = DEFCAP - 1;
  }

  public ArrayBoundedQueue2(int maxSize) 
  {
    elements = (T[]) new Object[maxSize];
    rear = maxSize - 1;
  }

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

  public boolean isEmpty()
  // Returns true if this queue is empty; otherwise, returns false.
  {              
    return (numElements == 0);
  }

  public boolean isFull()
  // Returns true if this queue is full; otherwise, returns false.
  {              
    return (numElements == elements.length);
  }
  
  public int size()
  // Returns the number of elements in this queue.
  {
    return numElements;
  }
  
	
	//Actual assignment code
	
	public String toString() {
		String s = new String("Im an idiot");
		return s;
		//Like down below remove when done.
		
	}
	
	public int space() {
		return rear - numElements;
		
	}
	
	public void remove(int count) throws QueueUnderflowException {
		if (count > numElements) {
			throw new QueueUnderflowException();
		}
		else {
			//Remove elements from the front here
		}
	}
	
	public boolean swapStart() {		
		if (numElements > 2) {
			return false;
		}
		else {
			T toReturn = elements[front];
			
		}
	}
	
	public boolean swapEnds() {
		return false;
	}
	
}
