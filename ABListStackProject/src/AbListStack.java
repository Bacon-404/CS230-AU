import ch02.stacks.StackInterface;
import ch02.stacks.StackOverflowException;
import ch02.stacks.StackUnderflowException;

import ch06.lists.ABList;

public class AbListStack<T> extends ABList implements StackInterface {

	
	protected ABList<T> elements;
	
	@Override
	public void push(Object element) throws StackOverflowException {
		elements.add(element);
		
	}

	@Override
	public void pop() throws StackUnderflowException {
		//This should remove the element at the top of the stack.
		elements.remove(numElements);
		
	}

	@Override
	public Object top() throws StackUnderflowException {
		return elements.get(numElements);
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
	public AbListStack() {
	}
	
	@Override
	public String toString() {
		String str = null;
		return str;
	}
}
