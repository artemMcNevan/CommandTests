package ThirdTask;

import java.util.ArrayList;
import java.util.Collection;

public class TestingArray extends Methods {
	ArrayList<Integer> array;
		
	public TestingArray() {
		array = new ArrayList<>();
	}
		
	public void insertDefault() {
		filling();
	}
	
	public void insertRandomElement() {
		for (int i = 0; i < 10000; i++) {
			array.add((int)Math.random()*array.size(), CreateNumber());
		}
	}
	
	public void insertToReadyArray() {
		array = new ArrayList<>(10000);
		filling();
	}
	
	public void insertCollection(Collection<Integer> col) {
		array.addAll(col);
	}
	
	public void removeDefaultElement() {
		for (int i = array.size(); i == 0; i--) {
			array.remove(i);
		}
	}
	
	public void removeRandomElement() {
		for (int i = 0; i < array.size(); i++) {
			array.remove((int)Math.random()*array.size());
		}
	}
	
	public void getDefaultElement() {
		for (int i = 0; i < array.size(); i++) {
			array.get(i);
		}
	}
	
	public void getRandomElement(int[] position) {
		for (int i = 0; i < array.size(); i++) {
			array.get(position[i]);
		}
	}
	
	private void filling() {
		for (int i = 0; i < 10000; i++) {
			array.add(CreateNumber());
		}
	}
}
