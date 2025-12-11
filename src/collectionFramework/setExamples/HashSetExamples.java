package collectionFramework.setExamples;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class HashSetExamples {

	public static void main(String[] args) {
		
		Set<Integer> hashSet = new HashSet<>();
		hashSet.add(5);
		hashSet.add(6);
		hashSet.add(8);
		hashSet.add(5);
		System.out.println("hashSet: "+hashSet);
		
		//LinkedList
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
		linkedList.add(12);
		linkedList.add(15);
		linkedList.add(11);
		linkedList.add(17);
		System.out.println("After Adding: "+linkedList);
		
		//adding linkedList to set
		
		hashSet.addAll(linkedList);
		System.out.println("hashSet: "+hashSet);
		
		// ---> Converting LinkedList to Set ---->
		Set<Integer> hashSet1 = new HashSet<>(linkedList);
		System.out.println("hashSet1: "+hashSet1);
		

	}

}
