package MapConcept;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapConcept {

	public static void main(String[] args) {
		
		
		//It maintains sorted order  
		//null key is not allowed
		//if we want reverse order then use (collections.reverseOrder())
		
		TreeMap<String, String> empData = new TreeMap<String, String>(Collections.reverseOrder());
		empData.put("Tom", "SDET1");//k,v - pair - entryset
		empData.put("Peter", "SDET2");
		empData.put("Ravi", "SDET3");
		empData.put("Lisa", "SDET4");
		empData.put("Naveen", "SDET4");
		empData.put("Amit", "SDET5");
//		empData.put("arpit", "SDET6");
//		empData.put("ravi", "SDET7");
//		empData.put("1", "SDET8");
//		empData.put("2", "SDET9");
//		empData.put("$", "SDET9");
//		empData.put(null, "SDET Manager");
		empData.put("selenium", null);
	
		//System.out.println(empData);
		
		for(Map.Entry<String, String> entry : empData.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
			}
		System.out.println("--------------");
		
	    empData.forEach((k,v) -> System.out.println(k + ":" + v));


	}

}
