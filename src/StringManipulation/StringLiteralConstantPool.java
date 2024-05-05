package StringManipulation;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class StringLiteralConstantPool {

	public static void main(String[] args) {
		
//		String tr = "Hello";//Strings r Immutable, value of particular obj or variable can't be changed/updated
//		tr.concat("selenium");
//		System.out.println(tr);
		
		// from JDK1.8 scp is the part of heap b4 that it's not a part of it anyways whatever heap conditions are getting applied here lyk Garbage collector n everything it will be applied on these guys also 
		
		//String literals:
		String s1 = "Hello";//1 - String constant pool it won't create duplicates unique one if variable is same won't create start pointing to new ref vara
		String s2 = "Hello";
		
		String s3 = new String("world");//1-heap, 1-scp
		String s4 = "world";//scp
		String s5 = "Hello";
		
		String s6 = new String("selenium");//1-heap,1-scp
		String s7 = "selenium";
		String s8 = new String("selenium");//1-heap obj can be duplicate inside heap
		
		System.out.println(s1==s2);//scp==scp - true always compare exact//1-heap,1-scp values not ref variable
		System.out.println(s4==s3);//scp==heap so it always compares ref variable not values
		
		System.out.println(s6==s8);//heap==heap -- false again compare ref variable respective memory address not values
		
		System.out.println(s6.equals(s8));//always compares the values so true
		System.out.println(s4.equals(s3));//true
		
		//
		String obj = new String("testing");//1-heap, 1-scp = 2
		String ob = new String("testing");//1-heap
		System.out.println(obj==ob);//false
		System.out.println(obj.equals(ob));//true
		
		String o = "Testing";
		String p = "testing";
		String q = "testing";
		System.out.println(obj==o);//false
		System.out.println(obj==ob);
		System.out.println(o==p);
		System.out.println(p==q);
		System.out.println(obj.equals(p));
		System.out.println(obj.equals(o));//false
		System.out.println(obj.equalsIgnoreCase(o));//true
		
		
		
		
		
		
		
		
		
		

	}

}
