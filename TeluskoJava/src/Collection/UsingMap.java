package Collection;

import java.util.HashMap;
import java.util.Map;

public class UsingMap {

	public static void main(String[] args) {
		 // using map and hashmap can use data in keyvalue pair form
		Map<String, Integer> students = new HashMap<>();
		students.put("Hardik", 25);
		students.put("Vinod", 61);
		System.out.println(students.get("Hardik"));

	}

}
