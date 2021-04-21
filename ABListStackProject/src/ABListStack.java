import ch02.stacks.StackInterface;
import ch02.stacks.StackOverflowException;
import ch02.stacks.StackUnderflowException;

import ch06.lists.ABList;

public class ABListStack<T> implements StackInterface<T> {

	
	protected ABList<T> elements;
	protected int numElements = -1;
	
	@Override
	public void push(T element) throws StackOverflowException {
		elements.add(element);
		numElements++;
	}
 
	@Override
	public void pop() throws StackUnderflowException {
		//This should remove the element at the top of the stack.
		 elements.remove(numElements);
		 numElements--;
		
	}

	@Override
	public T top() throws StackUnderflowException {
		T topOfStack = null;
	    if (isEmpty())
	      throw new StackUnderflowException("Top attempted on an empty stack.");    
	    else 
	      topOfStack = elements.get(elements.size() - 1);
	    return topOfStack;
	}

	@Override
	public boolean isEmpty() {
		return (elements.size() == 0);
	}

	@Override
	public boolean isFull() {
		//Stack is unbounded
		return false;
	}
	
	//No arg constructor
	public ABListStack() {
		elements = new ABList<T>();
	}
	
	@Override
	public String toString() {
		String str = null;
		return str;
	}
}
