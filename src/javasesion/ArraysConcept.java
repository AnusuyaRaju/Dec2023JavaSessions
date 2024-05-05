package javasesion;

import java.util.Arrays;

public class ArraysConcept {

	public static void main(String[] args) {
		//Similar kind of data type it can store and it's non primitive data type
		//Using new keyword
		//2 major limitations: 
		  //1.Size is fixed: Static Array
		  //2.It can store only similar kind of data but we can solve this problem with object Array but Object Array is also 
		//kind of Static Array. The solution is that we have to use some Dynamic Array(means ArrayList. collections.)
		
		
		int i[] = new int[4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		//i[4]=50;//AIOB exp as it's range is still 0-3 only
		//System.out.println(i[4]);//AIOB exp
		//System.out.println(i[-1]);//AIOB exp
		//System.out.println(i);//give address of array random string like i@43.. etc
		System.out.println(i.length);
		System.out.println(Arrays.toString(i));
//want to print array values one by one where we can use for loop
		for(int k=0;k<=3;k++) {
			System.out.println(i[k]);//10 20 30 40
			if(i[k]==20) {
				System.out.println("hi");
			    break;
			}
			System.out.println("bye");
		}
			//
			short sh[] = new short[3];//0 to 2
			System.out.println("length=" + sh.length);
			System.out.println("Li=" + 0);
			System.out.println("Hi=" + (sh.length-1));
			
			System.out.println(Arrays.toString(sh));// 0 0 0
			sh[0]=10;
			System.out.println(Arrays.toString(sh));
			sh[2]=30;
			System.out.println(Arrays.toString(sh));
			sh[1]=40;
			System.out.println(Arrays.toString(sh));
		
		    for(int p=0;p<sh.length;p++) {
		    	System.out.println(sh[p]);
		    	
		    }
//Char Array
		    char ch[] = new char[4];
		    System.out.println(ch[0]);//default value of char is space
		    ch[0] = 'a';
		    ch[1] = '1';
		    ch[2] = '$';
		    ch[3] = 98;
		    System.out.println(ch[3]);//ASCII value b
		    System.out.println(Arrays.toString(ch));
//Float Array
		    float fh[] = new float[2];
		    fh[0] = 12.33f;
		    fh[1] = 100;
		    System.out.println(Arrays.toString(fh));
//emp data: name(string),age(int),sal(double),gender(char),ispermanent(boolean)
//Object Array: It can store any kind of data types. Object is a class it's kind of Non primitive data type.
		    Object empData[] = new Object[5];
		    //empData[0] = "shiva";
		    //empData[1] = 30;
		    //empData[2] = 25.55;
		    //empData[3] = 'm';
		    //empData[4] = true;	    
		    System.out.println(Arrays.toString(empData));//default value of object is null	
		    System.out.println(empData.length);
		    
		    Object empData1[] = new Object[5];
		    empData1[0] = "kir";
		    empData1[1] = 32;
		    empData1[2] = 35.55;
		    empData1[3] = 'f';
		    empData1[4] = false;	    
		    System.out.println(Arrays.toString(empData1));

//String Array:
		    String product[] = new String[3];
		    product[0] = "Macbook pro";
		    product[1] = "Macbook Air";
		    product[2] = "ipad";
		    
		    for(int x=0;x<=product.length-1;x++) {//always index start with int only even if it's char or string
		    	System.out.println(product[x]);
		    	if(product[x].equals("Macbook Air")) {
		    		System.out.println("Out of stock");
		    		//break;// it will break entire loop after out of stock
		    	}
		    }
		    System.out.println("------------");
		    //Reverse loop
		    for(int y=product.length-1;y>=0;y--) {
		    	System.out.println(product[y]);
		    }
//Static Array eg:
		    //bookmyshow.com --> Annapoorani movie --> 200 seats
		    //Flight booking --> 300 seats
		    //Month Array --> 0 to 11 --> 12 months
		    
//Dynamic Array eg:		    
//Booking Uber: 100 cab[100] --> dynamic
//ecom --> user reg --> New customers --> dynamic
//emp dropdown --> emp selection/fires happens then it will require dynamic Array
		    
		    
		    
		    
		    
		    
	}

}
