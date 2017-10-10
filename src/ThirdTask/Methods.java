package ThirdTask;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class Methods {
	static Collection<Integer> collection;
	
	public static Collection<Integer> CreateCollectionArray () {
		collection = new ArrayList<Integer>();
		for (int i = 0; i < 10000; i++) {
			collection.add(CreateNumber());
		} return collection;
	}
	
	public static Collection<Integer> CreateCollectionLinked () {
		collection = new LinkedList<Integer>();
		for (int i = 0; i < 10000; i++) {
			collection.add(CreateNumber());
		} return collection;
		
	}
	
	public static int CreateNumber() {
		return (int) (Math.random()*Integer.MAX_VALUE);
	}
	
	public static int[] PositionElement() {
		int[] position = new int[10000];
		for (int i = 0; i < position.length; i++) {
			position[i] = i;
		}
		for (int i = 0; i < position.length; i++) {
			int first = (int) (Math.random()*position.length);
			int second = (int) (Math.random()*position.length);
			int third = position[first];
			position[first] = position[second];
			position[second] = third;
		}
		return position;
	}
}
