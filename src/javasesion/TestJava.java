package javasesion;

public class TestJava {
	public static void main(String[] Args){
		//java: Strict data type concepts
		//data types:
		//1.Primitive data types:
		   //no need to create objects & class
		//2.Non primitive data types: string,class,interface,Arrays,object
		
		//Primitive data types:
		//Boolean type: true/false
		//Numeric type:
		   //Integral value:
		      //1.Integer: byte,short,int,long
		      //2.Floating-point: Float,double
		   //Character type: char
		
		//Integer value:
		//1.byte:
		//size: 1 byte = 8 bits
		//range: -128 to 127 = -2^7 to 2^7-1
		
		byte b = 10;
		byte b1 = 20;
		byte age = 30;
		System.out.println(b);
		//age,months,no of days in a week
		
		//2.Short:
		//size: 2 bytes = 2*8 = 16 bits
		//range: -32768 to 32767 = -2^15 to 2^15-1
		short s1 = 1000;
		short s2 = 1;
		System.out.println(s1+s2);
		
		//3.int:
		//size: 4 bytes = 4*8 = 32 bits
		//range: -2147483648 to 2147483647 = -2^31 to 2^31-1
		int i = 10;
		//bill amount,price,salary
		
		//4.long:
		//size: 8 bytes = 8*8 = 64 bits
		//range: -2^63 to 2^63-1
		long l = 1098976821;
		long l1 = 87648445597l;//even though it's long number l will not be printed
		System.out.println(l1);//we can add long numbers for world population,distance b/w 2 countries.medical ranges etc..
		//we shouln't store ph number,ssn number,debit card no into long
		//String is the right data type for below:
		long phone = 987645654l;
		long ssn = 7685638367l;
		long debit = 635472648374l;
		
		
		//Floating point:
		//1.float:
		//size: 4 byte = 4*8 = 32 bits
		//range: after ., can take upto 7 digits
		float f = 10.33f;
		System.out.println(f);
		float f1 = (float) 45.66;// we can declare lyk this also
		float f2 = 100;// we can store integer value as float but we can't store decimal value in integer
		System.out.println(f2);
		
		//2.Double:
		//size: 8 bytes = 8** = 64 bits
		//range: after ., can take upto 15 digits
		double d = 12.33333;
		double buildNumber = 1.1;
		System.out.println(d);
		//price,temp,weight,tax
		
		//Character type: Only single digit value
		//char:
		//size:2 bytes = 2*8 = 16 bits
		//a-z = 97 to 122
		//A-Z = 65 to 90
		//0-9 = 48 to 57
		//range: a-z and A-Z
		char c = 'a';
		char c1 = '1';//allow 0-9 but -1 not allowed becoz allow only single digit
		char c2 = '*';
		
		char n1 = 'a';
		char n2 = 'b';
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n1+n2);//97+98=195
		System.out.println(n1-n2);//97-98=-1
		
		
		//Unicode --> ASCII values:
		System.out.println('1'+'2');//49+50=99
		System.out.println('1');//char
		System.out.println(1);//integer value
		System.out.println("1");//string value
		System.out.println(c);
		System.out.println((byte) c);//97 y we r using byte data type means all ASCII values are lying under byte range -128 to 127
		System.out.println((byte) '$');
		System.out.println(100+'a');
		System.out.println('a' + 'b');//97+98=195
		System.out.println('a'+""+'b');//concatenating with " double quotes = ab
		
		
		//Boolean: true/false
		//size: ~(approximately) 1 bit 
		//range: no range
		boolean flag = true;
		boolean pop = false;//if variable is single world then should be start with small letter
		boolean isUserActive = true;//if it's multiple word then should be camel case
		
		//default value of char is ""
		//default value of integer is 0
		
		 int k;
		  k = 100;
		 System.out.println(k);
		 
		 String pc = "12%";
		 float pec1 = 12.33f;
		
		
		
		
		
		
		
			
		
		
		
		
		
		
		
		
		
	}
			

}
