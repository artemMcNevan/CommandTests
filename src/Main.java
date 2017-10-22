import MyQueue.MyQueue;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		System.out.println("----ARRAYLIST----");
		System.out.println("----add----");
		System.out.println("Вызов 1: " + String.format("%,12d",addFun()) + " ns");
		System.out.println("Вызов 2: " + String.format("%,12d",addFun()) + " ns");
		System.out.println("----add with constructorr----");
		System.out.println("Вызов 1: " + String.format("%,12d",addConstrFun()) + " ns");
		System.out.println("Вызов 2: " + String.format("%,12d",addConstrFun()) + " ns");
		System.out.println("----get----");
		System.out.println("Вызов 1: " + String.format("%,12d",getFun()) + " ns");
		System.out.println("Вызов 2: " + String.format("%,12d",getFun()) + " ns");
		System.out.println("----del----");
		System.out.println("Вызов 1: " + String.format("%,12d",delFun()) + " ns");
		System.out.println("Вызов 2: " + String.format("%,12d",delFun()) + " ns");
		System.out.println("----LINKEDLIST----");
		System.out.println("----add----");
		System.out.println("Вызов 1: " + String.format("%,12d",addLinkFun()) + " ns");
		System.out.println("Вызов 2: " + String.format("%,12d",addLinkFun()) + " ns");
		System.out.println("----add with constructorr----");
		System.out.println("Вызов 1: " + String.format("%,12d",addLinkConstrFun()) + " ns");
		System.out.println("Вызов 2: " + String.format("%,12d",addLinkConstrFun()) + " ns");
		System.out.println("----get----");
		System.out.println("Вызов 1: " + String.format("%,12d",getLinkFun()) + " ns");
		System.out.println("Вызов 2: " + String.format("%,12d",getLinkFun()) + " ns");
		System.out.println("----del----");
		System.out.println("Вызов 1: " + String.format("%,12d",delLinkFun()) + " ns");
		System.out.println("Вызов 2: " + String.format("%,12d",delLinkFun()) + " ns");


	}
	// добавление
	public static long addFun(){
		ArrayList<Integer> list = new ArrayList<Integer>();
		long d1, d2, dRes;
		d1 = System.nanoTime();
		for(Integer i = 0; i < 10000; i++){
			list.add(i);
		}
		d2 = System.nanoTime();
		return d2 - d1;
	}
	//добавление с конструктором
	public static long addConstrFun(){
		ArrayList<Integer> list = new ArrayList<Integer>();
		long d1, d2, dRes;

		for(Integer i = 0; i < 10000; i++){
			list.add(i);
		}
		d1 = System.nanoTime();
		ArrayList<Integer> list2 = new ArrayList<Integer>(list);
		d2 = System.nanoTime();
		return d2 - d1;
	}

	public static long getFun(){
		ArrayList<Integer> list = new ArrayList<Integer>();
		long d1, d2, dRes;
		for(Integer i = 0; i < 10000; i++){
			list.add(i);
		}
		d1 = System.nanoTime();
		for(Integer i = 0; i < 10000; i++){
			list.get(i);
		}
		d2 = System.nanoTime();
		return d2 - d1;
	}

	public static long delFun(){
		ArrayList<Integer> list = new ArrayList<Integer>();
		long d1, d2, dRes;
		for(Integer i = 0; i < 10000; i++){
			list.add(i);
		}
		d1 = System.nanoTime();
		for(Integer i = 0; i < 10000; i++){
			list.remove(i);
		}
		d2 = System.nanoTime();
		return d2 - d1;
	}

	// добавление
	public static long addLinkFun(){
		LinkedList<Integer> list = new LinkedList<Integer>();
		long d1, d2, dRes;
		d1 = System.nanoTime();
		for(Integer i = 0; i < 10000; i++){
			list.add(i);
		}
		d2 = System.nanoTime();
		return d2 - d1;
	}
	//добавление с конструктором
	public static long addLinkConstrFun(){
		LinkedList<Integer> list = new LinkedList<Integer>();
		long d1, d2, dRes;

		for(Integer i = 0; i < 10000; i++){
			list.add(i);
		}
		d1 = System.nanoTime();
		LinkedList<Integer> list2 = new LinkedList<Integer>(list);
		d2 = System.nanoTime();
		return d2 - d1;
	}

	public static long getLinkFun(){
		LinkedList<Integer> list = new LinkedList<Integer>();
		long d1, d2, dRes;
		for(Integer i = 0; i < 10000; i++){
			list.add(i);
		}
		d1 = System.nanoTime();
		for(Integer i = 0; i < 10000; i++){
			list.get(i);
		}
		d2 = System.nanoTime();
		return d2 - d1;
	}

	public static long delLinkFun(){
		LinkedList<Integer> list = new LinkedList<Integer>();
		long d1, d2, dRes;
		for(Integer i = 0; i < 10000; i++){
			list.add(i);
		}
		d1 = System.nanoTime();
		for(Integer i = 0; i < 10000; i++){
			list.remove(i);
		}
		d2 = System.nanoTime();
		return d2 - d1;
	}

}
