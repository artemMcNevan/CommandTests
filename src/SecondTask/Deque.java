package SecondTask;

public class Deque<T> {
	private Element<T> firstElement = null;
	private Element<T> lastElement = null;

	public void push_front(T value) {
		if (firstElement == null && lastElement == null) {
			Element<T> newElement = new Element<T>(value);
			firstElement = newElement;
		} else if (firstElement == null && lastElement != null) {
			Element<T> newElement = new Element<T>(value);
			firstElement = newElement;
			setLinks();
		} else if (firstElement != null && lastElement == null) {
			Element<T> newElement = new Element<T>(value);
			lastElement = new Element<T>(firstElement.getValue());
			firstElement = newElement;
			setLinks();
		} else {
			Element<T> newElement = new Element<T> (value);
			newElement.setRigthElement(firstElement);
			firstElement.setLeftElement(newElement);
			firstElement = newElement;
		}
	}

	public void push_back (T value) {
		if (lastElement == null && firstElement == null) {
			Element<T> newElement = new Element<T>(value);
			lastElement = newElement;
		} else if (lastElement == null && firstElement != null) {
			Element<T> newElement = new Element<T>(value);
			lastElement = newElement;
			setLinks();
		} else if (lastElement != null && firstElement == null) {
			Element<T> newElement = new Element<T>(value);
			firstElement = new Element<T>(lastElement.getValue());
			lastElement = newElement;
			setLinks();
		} else {
			Element<T> newElement = new Element<T> (value);
			newElement.setLeftElement(lastElement);
			lastElement.setRigthElement(newElement);
			lastElement = newElement;
		}
	}

	public T get_back() {
		T value = null;
		if (lastElement == null & firstElement == null) {
			return null; 
		} else if (lastElement == null & firstElement != null) {
			value = firstElement.getValue();
			firstElement = null; 
		} else if (lastElement != null & firstElement == null) {
			value = lastElement.getValue();
			lastElement = null;
		} else if (lastElement.getLeftElement() == firstElement) {
			value = lastElement.getValue();
			lastElement = null;
			firstElement.deleteRigthElement();
		} else {
			value = lastElement.getValue();
			lastElement = lastElement.getLeftElement();
			lastElement.deleteRigthElement();
		}
		return value;
	}

	public T get_front() {
		T value = null;
		if (lastElement == null & firstElement == null) {
			return null; 
		} else if (firstElement == null & lastElement != null) {
			value = lastElement.getValue();
			lastElement = null; 
		} else if (firstElement != null & lastElement == null) {
			value = firstElement.getValue();
			firstElement = null; 
		} else if (firstElement.getRigthElement() == lastElement) {
			value = firstElement.getValue();
			firstElement = null;
			lastElement.deleteLeftElement();
		} else {
			value = firstElement.getValue();
			firstElement = firstElement.getRigthElement();
			firstElement.deleteLeftElement();
		} 
		return value;
	}
	
	public int size () {
		int size;
		Element<T> newElement = firstElement;
		if (firstElement == null && lastElement == null) {
			size = 0;
		}
		else if ((firstElement == null && lastElement != null) | (firstElement != null && lastElement == null)) {
			size = 1;
		}
		else if (firstElement.getRigthElement() == lastElement) {
			size = 2;
		} else {
			size = 2;
			while (newElement.getRigthElement() != lastElement ) {
				newElement = newElement.getRigthElement();
				size += 1;
			}
		}
		return size;
	}
	
	private void setLinks () {
		firstElement.setRigthElement(lastElement);
		lastElement.setLeftElement(firstElement);
	}

}
