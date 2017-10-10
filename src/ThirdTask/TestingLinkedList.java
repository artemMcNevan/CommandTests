package ThirdTask;

import java.util.Collection;
import java.util.LinkedList;

public class TestingLinkedList extends Methods {
	LinkedList<Integer> linked;
	
	public TestingLinkedList() {
		linked = new LinkedList<>();
	}
	
	public void insertDefault() {
		for (int i = 0; i < 10000; i++) {
			linked.add(CreateNumber());
		}
	}
	
	public void insertRandomElement() {
		for (int i = 0; i < 10000; i++) {
			int position = (int) ((Math.random()*linked.size()));
			linked.add(position, CreateNumber());
		}
	}
	
	public void insertCollectionToLinked(Collection<Integer> col) {
		linked.addAll(col);
	}
	
	public void removeDefaultElement() {
		for (int i = linked.size(); i == 0; i--) {
			linked.remove();
		}
	}
	
	public void removeRandomElement() {
		for (int i = 0; i < 10000; i++) {
			linked.remove((int) ((Math.random()*linked.size())));
		}
	}
	
	public void getDefaultElement() {
		for (int i = 0; i < linked.size(); i++) {
			linked.get(i);
		}
	}
	
	public void getRandomElement(int[] position) {
		for (int i = 0; i < linked.size(); i++) {
			linked.get(position[i]);
		}
	}
}
