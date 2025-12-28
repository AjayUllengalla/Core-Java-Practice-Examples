package collectionFramwork.map;

import java.util.HashMap;
import java.util.Map;

import collectionFramwork.studentManagement.Student;

public class MapDemo {

	public static void main(String[] args) {

		HashMap<Integer,String> months= new HashMap<>();
		months.put(1, "Jan");
		months.put(2,"Feb");
		months.put(3, "Mar");
		months.put(4, "Apri");
		months.put(5, "May");
		months.put(6,"June");
		months.put(7, "July");
		months.put(8, "August");
		months.put(9, "Spetember");
		months.put(10,"October");
		months.put(11, "November");
		months.put(12, "December");
		System.out.println(months.get(1));
		System.out.println(months.get(8));
		System.out.println("All Months:"+months);
		months.put(10, "Ajay");
		System.out.println("All Months after Updated:"+months);
		
		
		Map<Integer,Student> studentMap = new HashMap<>();
		Student stud = new Student();
		stud.setStudentName("Ajay");
		stud.setStudentId(1);
		
//		
		studentMap.put(stud.getStudentId(),stud);
		stud.setStudentId(2);
		System.out.println(studentMap);
		stud.setStudentName("Anu");
		studentMap.put(stud.getStudentId(),stud);
		System.out.println(studentMap);
		System.out.print(studentMap.get(2));
		
		

	}

}
