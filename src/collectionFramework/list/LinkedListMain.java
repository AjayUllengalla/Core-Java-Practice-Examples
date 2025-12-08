package collectionFramework.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

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
		
		//sort
		Collections.sort(linkedList);
		System.out.println("AfterSorting: "+ linkedList);
		
		// ---> Index
		System.out.println("Highest  : "+Collections.max(linkedList));
		System.out.println("Peek Element : "+linkedList.peek());
		System.out.println("Lowest: "+Collections.min(linkedList));
		
		//-----> get()
		
		System.out.println("value at index 5 "+linkedList.get(5));
		
		ArrayList<Integer> numbersList = new ArrayList<>();
		int[] nums = {5, 12, 27, 33, 48, 59, 72, 90, 40, 12, 5, 27};

		numbersList.add(nums[1]);
		System.out.println(numbersList);
		for(int i=0;i<nums.length;i++) {
			numbersList.add(nums[i]);
		}
		
		linkedList.addAll(numbersList);
		System.out.println("After Adding ArrayList: "+linkedList);

		Collections.sort(linkedList);
		System.out.println("AfterSorting: "+ linkedList);
		
		List<String> listExample = new ArrayList<>();
		listExample = new LinkedList();
		listExample.add("Hello");
		System.out.println(listExample);
	}

}
