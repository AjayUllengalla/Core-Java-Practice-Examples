package collectionFramework.list;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListMain {

	public static void main(String[] args) {

		LinkedList<Integer> linkedList = new LinkedList<>();
		//---> adding
		linkedList.add(12);
		linkedList.add(15);
		linkedList.add(11);
		linkedList.add(17);
		linkedList.add(222);
		linkedList.add(136);
		linkedList.add(1);
		linkedList.add(45);
		linkedList.add(3);
		linkedList.add(6);
		System.out.println("After Adding: "+linkedList);
		
		//sort
		Collections.sort(linkedList);
		System.out.println("AfterSorting: "+ linkedList);
		
		//Again adding
		linkedList.add(6);
		System.out.println("Re Adding: "+linkedList);
		linkedList.addFirst(1600);
		System.out.println("Added at first : "+linkedList);
		
		//----> remove()
		
		linkedList.remove(5);
		System.out.println("Removed Element at index 5 : "+linkedList);
		linkedList.removeFirst();
		System.out.println("Removed Element at First : "+linkedList);
		linkedList.removeLast();
		System.out.println("Removed Element at Last: "+linkedList);
		
		

	}

}
