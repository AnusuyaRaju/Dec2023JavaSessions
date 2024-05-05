package javasesion;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListConcept {

	public static void main(String[] args) {
		//ArrayList--class: default: Dynamic Array
		//create the object of ArrayList: new keyword
		
		ArrayList ar = new ArrayList();//pc=0,vc=10
		System.out.println(ar.size());//pc=0
		ar.add(100);//0 pc=1,vc=9
		ar.add(200);//1 pc=2,vc=8
		System.out.println(ar);
		System.out.println(ar.size());
		ar.add(300);//2
		ar.add(400);//3
		System.out.println(ar.size());//4
		ar.add(500);
		ar.add(600);
		System.out.println(ar.size());//6
		System.out.println(ar);
		ar.remove(5);
		System.out.println(ar.size());//5
		System.out.println(ar);
		ar.add(300);
		System.out.println(ar);
		ar.add(12.33);
		ar.add(true);
		ar.add('c');
		ar.add("Naveen");
		System.out.println(ar);
		
        //markList--> generic: int ->Integer
		ArrayList<Integer> markList = new ArrayList<Integer>() ;
		markList.add(100);
		markList.add(1200);
		
		//empNames --> generic: String
		ArrayList<String> empNamesList = new ArrayList<String>();
		empNamesList.add("Anu");
		empNamesList.add("Tom");
		empNamesList.add("kiru");
		System.out.println(empNamesList);
		System.out.println(empNamesList.size());//3
		
		//emp info: name,age,salary,isActive,gender
		ArrayList<Object> empDataList = new ArrayList<Object>();
		empDataList.add("Rahul");//0
		empDataList.add(30);//1
		empDataList.add(50.33);//2
		empDataList.add(true);//3
		empDataList.add('m');//4
		empDataList.add(null);//5
		System.out.println(empDataList);
		System.out.println(empDataList.size());
		
		ArrayList list = new ArrayList(5);//vc=5,pc=0
		//0 1 2 3 4
		//vc=0,pc=5
		//pc/2=5/2=2
		//vc=2
		
		ArrayList<String> browserList = new ArrayList<String>(Arrays.asList("chrome","firefox","edge"));
		System.out.println(browserList.size());//3
		
		browserList.add("IE");
		System.out.println(browserList.size());
		System.out.println(browserList.get(0));
		System.out.println(browserList.indexOf("naveen"));//-1
		System.out.println(browserList.indexOf("firefox"));//1
		
		if(browserList.indexOf("naveen")==-1) {
			System.out.println("Pls pass the right browser name......");
		}
		System.out.println(browserList);
		//browserList.removeAll(browserList);
		System.out.println(browserList);//empty list
		System.out.println(browserList.size());//0
		
		ArrayList<String> osList = new ArrayList<String>(Arrays.asList("windows","mac","linux"));
		browserList.addAll(osList);
		System.out.println(browserList);//browser+os
		System.out.println(osList);
		browserList.removeAll(osList);//browser
		System.out.println(browserList);//browser
		
		osList.add(0, "unix");
		System.out.println(osList);
		osList.add(0, "Naveen");
		System.out.println(osList);
		osList.add("testing");
		System.out.println(osList);
		
		if(osList.contains("mac")) {
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test Failed");
		}
		
		ArrayList<String> subList = new ArrayList<String>(Arrays.asList("mac","windows"));
		System.out.println(osList.containsAll(subList));
		
		ArrayList<Integer> numList = new ArrayList<Integer>(Arrays.asList(10,20,11,45,60,89));
		System.out.println(numList);
		//Collections.sort(numList);//sort the numbers
		//System.out.println(numList);
		
		Collections.swap(numList, 0, 1);
		System.out.println(numList);
		
		List<Object> testList = Collections.emptyList();//empty list-->immutable list
		System.out.println(testList.size());//0
		//testList.add("cypress");//UnsupportedOperationExp
		System.out.println(testList.size());//
		
		Collections.sort(osList);
		System.out.println(osList);
		
		ArrayList<String> footArrayList = new ArrayList<String>();//mutable list
		footArrayList.add("help");
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

