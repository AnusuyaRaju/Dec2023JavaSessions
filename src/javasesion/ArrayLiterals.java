package javasesion;

import java.util.Arrays;

//import java.util.Arrays;

public class ArrayLiterals {

	public static void main(String[] args) {
		//Array Literals: If u already aware of the values then we can use Array literals if ur not aware of the all the values
		//then you can use with new keyword rest of the things will remains the same.
		int i[] = {10,20,30,40,10,1};
		System.out.println(i[0]);
		System.out.println(i.length);//6
		System.out.println(i[5]);
		//System.out.println(i[i.length]);//i[6] AIOB
		System.out.println(i[i.length-1]);
		
		//Char array:
		char ch[] = {'a','e','i','o','u'};
		System.out.println(ch[0]);
		for(int k=0;k<ch.length;k++) {
			//System.out.print(ch[k]);//aeiou
			System.out.println(ch[k]);
			
		}
		
	  //String array:
		String product[] = {"macbook","imac","canon"};
		System.out.println(Arrays.toString(product));
		
		//Object array:
		Object data[] = {"nakul",30,12.33,'m',true};
		System.out.println(data.length);
		System.out.println(Arrays.toString(data));
		

	}

}
