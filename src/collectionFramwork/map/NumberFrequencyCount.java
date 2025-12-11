package collectionFramwork.map;

import java.util.HashMap;
import java.util.Map;

public class NumberFrequencyCount {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5,6,7,8,9,1,2,5,4,6,2};
		
		HashMap<Integer,Integer> numberFrequency = new HashMap<>();
		
		for(Integer element:arr) {
			if(numberFrequency.containsKey(element)) {
				int value = numberFrequency.get(element);
				numberFrequency.put(element, value+1);
			} else {
				numberFrequency.put(element, 1);
			}
			
		}
		System.out.println(numberFrequency);

		for(Map.Entry<Integer,Integer> value:numberFrequency.entrySet()) {
			if(value.getValue() == 1) {
				System.out.println("Unique Values: "+ value.getKey());
			}
			else {
				System.out.println("Most Repeated:"+ value.getKey()+" ");
			}
			
		}
		
		Integer mostRepeated = 0;
		Integer highest =0;
		for(Map.Entry<Integer, Integer> value:numberFrequency.entrySet()) {
			if(value.getValue() > mostRepeated) {
				mostRepeated = value.getValue();
				highest = value.getKey();
			}
		}
		System.out.println("Most Repated Value :"+highest);
		System.out.println("Frequency of Number : "+mostRepeated);
	}

}
