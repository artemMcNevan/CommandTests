package SecondTask2;

import SecondTask2.Element;

public class Deque<T> {
	private Element<T> firstElement = null;
	private Element<T> lastElement = null;
	private int size;

	public void push_front(T value) {
		Element<T> newElement = new Element<T>(value);
		if (firstElement == null & lastElement == null) {
			firstElement = newElement;
			lastElement = newElement;
			size = 1;
		}
		else {
			firstElement.setLeftElement(newElement);
			newElement.setRigthElement(firstElement);
			firstElement = newElement;
			size ++;
		}
	}
	
	public void push_back (T value) {
		Element<T> newElement = new Element<T>(value);
		if (firstElement == null & lastElement == null) {
			firstElement = newElement;
			lastElement = newElement;
			size = 1;
		}
		else {
			lastElement.setRigthElement(newElement);
			newElement.setLeftElement(lastElement);
			lastElement = newElement;
			size ++;
		}
	}
	
	public T get_back() {
		T value = lastElement.getValue();
		if (size == 1) {
			firstElement = null;
			lastElement = null;
		} else lastElement = lastElement.getLeftElement();
		size --;
		return value;
	}
	
	public T get_front() {
		T value = firstElement.getValue();
		if (size == 1) {
			firstElement = null;
			lastElement = null;
		} else firstElement = firstElement.getRigthElement();
		size --;
		return value;
	}
	
	public int size() {
		return size;
	}
}


