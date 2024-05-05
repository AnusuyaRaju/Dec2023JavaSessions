package MapConcept;

import java.util.HashMap;
import java.util.Map;

public class HashMapConcept {

	public static void main(String[] args) {
		
		//key,value - can't accept primitive data types like int,double,float it should be Interger,Double,Float(wrapper class)
		
		HashMap<String, Integer> empMap = new HashMap<String, Integer>();
		
		empMap.put("Tom", 101);
		empMap.put("lisa", 200);
		System.out.println(empMap.size());
		System.out.println(empMap.get("Tom"));
		empMap.put("lisa", 300);
		System.out.println(empMap.get("lisa"));
		
		//HashMap is always Non order based collection means it doesn't maintain the order but Array & ArrayList maintain index order
		//HashMap - Java is calculating index internally like below
//		put(key,value){
//		key = Tom, value = SDET1
//		hashing -- hascode("Tom") --> 67896
//		Index = mod(67896) -> 2
//		
//		key = Peter, value = SDET2
//		hashing -- hashcode("Peter") --> 90909
//		Index = mod(90909) -> 5
//		
//		key = null, value = SDET Manager
//		hashing -- hashcode(null) 
//		Index = 0 // null keys allows only once
//		
//		JDK 1.7: LinkedList incase of Collision Time Complexity - O(n) - quite expensive
//		From JDK 1.8: Collision: upto 8 segments - LL Threshold value = 8 LL-->Binary Tree Time Complexity - O(log n) - 
//		
//		Binary Tree: Balanced tree split the tree like Left side(lower value) & Right side(higher value) - less no of iteration n very faster than normal search algorithm  
		
		
		HashMap<String, String> empData = new HashMap<String, String>();
		empData.put("Tom", "SDET1");//k,v - pair - entryset
		empData.put("Peter", "SDET2");
		empData.put("Ravi", "SDET3");
		empData.put("Lisa", "SDET4");
		empData.put("Naveen", "SDET4");
		empData.put(null, "SDET Manager");
		empData.put(null, "SDET Director");
//		empData.put(null, null);
//		empData.put("Prateek", null);
//		empData.put("Usha", null);
		empData.put("Tom", "SDET1");//not allowed duplicates
		
		empData.remove("Naveen");
		empData.remove("Lisa", "SDET4");
		boolean flag = empData.containsKey("Naveen");
		System.out.println(flag);
		
		
	
//		System.out.println(empData.get(null));
//		System.out.println(empData.get("test"));
		System.out.println(empData);
		
		//null keys = 1
		//null values = multiple
		
//		for(Map.Entry<String, String> entry : empData.entrySet()) {
//		System.out.println(entry.getKey() + ":" + entry.getValue());
//		}
//		System.out.println("-----------------");
//		
//		//foreach method:
//		empData.forEach((k,v) -> System.out.println(k + ":" + v));//-> means lambda expression
		
		
	}

}
