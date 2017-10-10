package ThirdTask;

import java.text.DecimalFormat;
import java.util.Collection;

public class Task extends Methods {
	static TestingArray testArray;
	static TestingLinkedList testLinked;
	static long start;
	static long finish;
	static float timeArray;
	static float timeLinked;

	public static void main (String [] args) {
		print("Starting test!");
		testInsertDefaultElement();
		testInsertRandomElement();
		testInsertElementToReadyArray();
		testInsertCollection();
		testGetDefaultElement();
		testGetRandomElement();
		testRemoveDefaultElement();
		testRemoveRandomElement();
	}
	
	public static void testInsertDefaultElement() {
		createNew();
		print("Test insert default to position");
		start();
		testArray.insertDefault();
		print("Time for insert to ArrayList: " + finish(true));
		start();
		testLinked.insertDefault();
		print("Time for insert to LinkedList: " + finish(false));
		compare();
		System.out.println("----------------------------------------------");
	}
	
	public static void testInsertRandomElement() {
		createNew();
		print("Test insert random position");
		start();
		testArray.insertRandomElement();
		print("Time for insert to ArrayList: " + finish(true));
		start();
		testLinked.insertRandomElement();
		print("Time for insert to LinkedList: " + finish(false));
		compare();
		System.out.println("----------------------------------------------");
	}
	
	public static void testInsertElementToReadyArray() {
		createNew();
		print("Test insert element to arraylist use constructor");
		start();
		testArray.insertToReadyArray();
		print("Time for insert to ArrayList: " + finish(true));
		start();
		testLinked.insertDefault();
		print("Time for insert to LinkedList: " + finish(false));
		compare();
		System.out.println("----------------------------------------------");
	}
	
	public static void testInsertCollection() {
		createNew();
		print("Test insert colection");
		Collection<Integer> collection = CreateCollectionArray();
		start();
		testArray.insertCollection(collection);
		print("Time for insert to ArrayList: " + finish(true));
		collection = CreateCollectionLinked();
		start();
		testLinked.insertCollectionToLinked(collection);
		print("Time for insert to LinkedList: " + finish(false));
		compare();
		System.out.println("----------------------------------------------");
	}
	
	public static void testGetDefaultElement() {
		createNew();
		print("Test get element with use default method");
		testArray.insertDefault();
		start();
		testArray.getDefaultElement();
		print("Time for insert to ArrayList: " + finish(true));
		testLinked.insertDefault();
		start();
		testLinked.getDefaultElement();
		print("Time for insert to LinkedList: " + finish(false));
		compare();
		System.out.println("----------------------------------------------");
	}
	
	public static void testGetRandomElement() {
		createNew();
		print("Test get random element");
		testArray.insertDefault();
		int[] position = PositionElement();
		start();
		testArray.getRandomElement(position);
		print("Time for insert to ArrayList: " + finish(true));
		testLinked.insertDefault();
		start();
		testLinked.getRandomElement(position);
		print("Time for insert to LinkedList: " + finish(false));
		compare();
		System.out.println("----------------------------------------------");
	}
	
	public static void testRemoveDefaultElement() {
		createNew();
		print("Test remove element with use default method");
		testArray.insertDefault();
		start();
		testArray.removeDefaultElement();
		print("Time for insert to ArrayList: " + finish(true));
		testLinked.insertDefault();
		start();
		testLinked.removeDefaultElement();
		print("Time for insert to LinkedList: " + finish(false));
		compare();
		System.out.println("----------------------------------------------");
	}
	
	public static void testRemoveRandomElement() {
		createNew();
		print("Test remove element with use default method");
		testArray.insertDefault();
		start();
		testArray.removeRandomElement();
		print("Time for insert to ArrayList: " + finish(true));
		testLinked.insertDefault();
		start();
		testLinked.removeRandomElement();
		print("Time for insert to LinkedList: " + finish(false));
		compare();
		System.out.println("----------------------------------------------");
	}
	
	private static void createNew() {
		testArray = new TestingArray();
		testLinked = new TestingLinkedList();
	}
	
	public static void print(String str) {
		System.out.println(str);
	}
	
	private static void start() {
		start = System.currentTimeMillis();
	}
	
	private static float finish(boolean i) {
		finish = System.currentTimeMillis();
		if (i) {
			timeArray = finish - start;
			return timeArray;
		} else {
			timeLinked = finish - start;
			return timeLinked;
		}
	}
	
	private static void compare() {
		String result;
		if (timeArray ==0 | timeLinked == 0) {
			if (timeArray == 0) print("ArrayList so fast o_O");
			else print("LinkedList faster ArrayList O_o");
		}
		else if (timeArray > timeLinked) {				
			result = new DecimalFormat("#0.00").format(((timeArray/timeLinked-1)*100));
			print("LinkedList faster ArrayList on = " + result + "%");
		} else if (timeArray < timeLinked) {
			result = new DecimalFormat("#0.00").format(((timeLinked/timeArray-1)*100));
			print("ArrayList faster LinkedList on = " + result + "%");
		} else print("This is methods (LinkedList and ArrayList) equals");
	}
}
