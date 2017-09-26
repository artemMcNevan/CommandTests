package SecondTask;

public class Deque<T> {
	private Element<T> firstElement;
	private Element<T> lastElement;

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
		T value = lastElement.getValue();
		lastElement = lastElement.getLeftElement();
		lastElement.deleteRigthElement();
		return value;
	}

	public T get_front() {
		T value = firstElement.getValue();
		firstElement = firstElement.getRigthElement();
		firstElement.deleteLeftElement();
		return value;
	}
	
	private void setLinks () {
		firstElement.setRigthElement(lastElement);
		lastElement.setLeftElement(firstElement);
	}

}
