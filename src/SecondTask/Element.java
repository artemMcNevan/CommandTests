package SecondTask;

public class Element <T> {
	private Element <T> leftElement = null;
	private T value;
	private Element <T> rigthElement = null;
	
	public Element (T value) {
		this.value = value;
	}
	
	public void setLeftElement(Element<T> newElement) {
		this.leftElement = newElement;
	}
	
	public void setRigthElement(Element<T> newElement) {
		this.rigthElement = newElement;
	}
	
	public Element<T> getLeftElement (){
		return leftElement;
	}
	
	public Element<T> getRigthElement() {
		return rigthElement;		
	}

	public void deleteRigthElement() {
		rigthElement = null;		
	}
	
	public void deleteLeftElement() {
		leftElement = null;
	}
	
	public T getValue () {
		return value;
	}
}