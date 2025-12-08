package collectionFramework.list;

import java.util.ArrayList;

public class ArrayListMain {

	public static void main(String[] args) {

		int arr[] = {12,33,4,5,66,7};
		
		//List --> ArrayList
		ArrayList arrayList = new ArrayList();
		arrayList.add("Ajju");
		arrayList.add(23);
		arrayList.add(arr[4]);
		arrayList.add(arr[5]);
		arrayList.add("HEllo");
		arrayList.add(15.6645f);
		arrayList.add("manogo");
		arrayList.add("HEllo");
		arrayList.add(123);
		
		System.out.println(arrayList);
		//remove
		arrayList.remove(0);
		arrayList.remove("Ajju"); //specific value or Eelement Removal
		System.out.println(arrayList);
		
		//clone
		ArrayList arrayListClone = new ArrayList();
		arrayListClone.addAll(arrayList);
		arrayListClone.add(456);
		arrayListClone.add(4);
		arrayListClone.add("Ajay");
		arrayListClone.add("Java");
		System.out.println(arrayListClone);
		
		//clear
		arrayList.clear();
		System.out.println(arrayList);
		
		System.out.println();
		//---> ArrayList with Generic Type -->
		
		ArrayList<String> names = new ArrayList();
		names.add("Ajay");
		names.add("Jay");
		System.out.println(names);
		
		String[] names1 = {"Arun", "Deepak", "Sanjay", "Priya", "Kavya", "Rahul"};
		names.add(names1[0]);
		names.add(names1[1]);
		names.add(names1[2]);
		names.add(names1[3]);
		names.add(names1[4]);
		System.out.println(names);
		names.add(0, "Justin");
		System.out.println(names);
		//---- contains -----
		System.out.println("Value is present or not : "+names.contains("Ajay"));
		
		//----- get() -----
		System.out.println("The Element at Given Index: "+names.get(2));
		System.out.println("The Element at Given Index: "+names.get(0));
		System.out.println("The Element at Given Index: "+names.get(6));
		
		//----- remove() -----
		names.remove(0);
		System.out.println("After Removal: "+names);
		names.remove("Ajay");
		System.out.println("After Removal: "+names);
		//------- clear  ------
		names.clear();
		System.out.println(names);
		System.out.println("Checking it is empty or not : "+names.isEmpty()); //isEmpty()
		
		System.out.println(" ");
		//integer
		
		ArrayList<Integer> numbersList = new ArrayList<>();
		int[] nums = {5, 12, 27, 33, 48, 59, 72, 90, 40, 12, 5, 27};

		numbersList.add(nums[1]);
		System.out.println(numbersList);
		for(int i=0;i<nums.length;i++) {
			numbersList.add(nums[i]);
		}
		System.out.println("After Adding"+numbersList);
		//---------- indexof
		System.out.println("Last Index of :"+numbersList.lastIndexOf(12));
		System.out.println("first Index of :"+numbersList.indexOf(27));
		
		System.out.println(numbersList.contains(33));
	}

}
