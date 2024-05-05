package javasesion;

import java.util.ArrayList;

public class ArrayListTraversing {

	public static void main(String[] args) {
		ArrayList<String> footerLinksList = new ArrayList<String>(30);
		//vc=30,pc=0
		
		footerLinksList.add("Login");//0
		footerLinksList.add("Register");//1
		footerLinksList.add("Forgot pwd");//2
		footerLinksList.add("Wish list");//3
		//pc=4,vc=26
		//pc=30,vc=0
		//vc=30/2=15
		
		System.out.println(footerLinksList.size());//4
		System.out.println(footerLinksList);
		System.out.println(footerLinksList.get(0));
		System.out.println(footerLinksList.get(3));
		//System.out.println(footerLinksList.get(4));// IndexOutOfBoundException - IOB
		//System.out.println(footerLinksList.get(-1));// IndexOutOfBoundException - IOB
		
//To print all values of ArrayList: for loop
		System.out.println("-----------");
		//Index loop:
		for(int i=0;i<=footerLinksList.size()-1;i++) {
			System.out.println(footerLinksList.get(i));
		}
		System.out.println("-----------");
		//for each:
		for(String e:footerLinksList) {
			System.out.println(e);
		}
		
		//
		ArrayList<String> pageList = new ArrayList<String>();//vc=10
		//maintains order: order based ArrayList
		pageList.add("Login");//0
		pageList.add("Register");//1
		pageList.add("Forgot pwd");//2
		pageList.add("Wish list");//3--->pc=4,vc=6
		System.out.println(pageList.size());//4
		//pageList.add(5, "Contact us");//IOB
		pageList.add(0, "Naveen");
		pageList.set(2, "Naveen");
		pageList.remove(1);//pc=3,vc=7
		System.out.println(pageList.get(1));
		System.out.println(pageList.size());//3
		System.out.println(pageList);
		
		//vc=1,pc=1....vc=pc/2=0----->10
		
		
		ArrayList<String> v1 = new ArrayList<String>(10);
		
		
		
		
		
		

	}

}
