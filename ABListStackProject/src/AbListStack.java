import ch02.stacks.StackInterface;
import ch02.stacks.StackOverflowException;
import ch02.stacks.StackUnderflowException;

import ch06.lists.ABList;

public class AbListStack<T> extends ABList implements StackInterface {

	@Override
	public void push(Object element) throws StackOverflowException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pop() throws StackUnderflowException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object top() throws StackUnderflowException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	public AbListStack() {
		ABList generic =  new ABList();
	}
	
	@Override
	public String toString() {
		String str = null;
		return str;
	}
}
