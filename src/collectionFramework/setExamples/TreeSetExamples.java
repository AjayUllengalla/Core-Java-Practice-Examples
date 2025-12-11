package collectionFramework.setExamples;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExamples {

	public static void main(String[] args) {
		
		Set<Integer> treeSet = new TreeSet<>();
		treeSet.add(15);
		treeSet.add(5);
		treeSet.add(6);
		treeSet.add(8);
		treeSet.add(5);
		System.out.println(treeSet);
		
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
				System.out.println("After Adding into List: "+linkedList);
				
			//Adding to treeSet<>
				
			treeSet.addAll(linkedList);
			System.out.println(treeSet);
		
			Set<ArrayList<Integer>> treeSet2 = new TreeSet<>();
			
			List<Integer> arrayList = new ArrayList<>();
			arrayList.add(12);
			arrayList.add(15);
			arrayList.add(11);
			arrayList.add(17);
			arrayList.add(222);
			arrayList.add(136);
			arrayList.add(1);
			arrayList.add(45);
			arrayList.add(3);
			arrayList.add(6);
			
			System.out.println(treeSet);
		
	}

}
