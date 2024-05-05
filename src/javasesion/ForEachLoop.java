package javasesion;

public class ForEachLoop {

	public static void main(String[] args) {
		int i[] = {10,20,30,40,10,1};
		//Index based loop: is always faster when compared to for each loop
		for(int k=0;k<=i.length-1;k++) {
			System.out.println(i[k]);
		}
		System.out.println("-------------");
		//for each:
		for(int e : i) {//e will go to i one by one n print all the values of the i
			System.out.println(e);
		}
		System.out.println("-------------");
	//double array:
		double d[] = {1.1,2.2,3.3,4.4,51.55};
		for(double e : d) {
			System.out.println(e);
		}
		System.out.println("-------------");
	//String array:	
		String product[] = {"macbook","imac","canon"};
		for(String s : product) {
			System.out.println(s);
			//break;
		}
		System.out.println("-------------");
	//Object array:
		Object data[] = {"nakul",30,12.33,'m',true};
		for(Object o : data) {
			System.out.println(o);
		}
		System.out.println("-------------");
		int num[] = {10,20,30,40,10,1};
		int count = num.length-1;//5
		for(int e : num) {
			e=count;
			//System.out.println(count + "-" + e);
			System.out.println(num[e]);
			//System.out.println(e);
			count--;
		}
		System.out.println("-------------");
//drawback:we don't use for each loop reverse order we generally use index based loop for reverse order
		
		short sh[] = {100,200,444,343,560};
		for(short s : sh) {
			System.out.println(s);
		}
//Assignment:a-z, A-Z,0-9 ASCII values in array literals with the help of foreach loop
		

	}

}
