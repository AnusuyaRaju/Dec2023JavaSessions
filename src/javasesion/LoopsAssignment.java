package javasesion;

public class LoopsAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 1. WAP to print following output: I am Batman﻿ I am Batman﻿ I am Batman﻿ I am
		 * Batman I am Batman
		 */
		for (int i = 1; i <= 5; i++) {
			System.out.println("I am Batman");
		}
		System.out.println("-------------");
		int j = 1;
		while (j <= 5) {
			System.out.println("I am Batman");
			j++;

		}
		System.out.println("-------------");
		/*
		 * 2. WAP to print following output:
		 * 
		 * I am Batman 1
		 * 
		 * I am Batman 2
		 * 
		 * I am Batman 3
		 * 
		 * I am Batman 4
		 * 
		 * I am Batman 5
		 * 
		 * I am Batman 6
		 * 
		 * I am Batman 7
		 * 
		 * I am Batman 8
		 * 
		 * I am Batman 9
		 */
		for (int p = 1; p <= 9; p++) {
			System.out.println("I am Batman " + p);
		}
		System.out.println("-------------");
//3. WAP to print 10 to 1 using for, while and do-while loop	
		int p1 = 10;
		while (p1 >= 1) {
			System.out.println(p1);
			p1--;
		}
		System.out.println("-------------");
		int l = 10;
		do {
			System.out.println(l);
			l--;
		} while (l >= 1);
		System.out.println("-------------");
//4. Write a program in Java to print "Hello World" ten times using while loop
		int h = 1;
		while (h <= 10) {
			System.out.println("Hello World");
			h++;
		}
		System.out.println("-------------");
//5. Write a program in Java to print all the multiplication of 5 from 1 to 100 using while /for/do-while loop
		int q = 1;
		while (q <= 100) {
			System.out.println(q);
			if (q % 5 == 0) {
				System.out.println("hi");
				q++;
			}
			q++;

		}
		System.out.println("-------------");
//For loop:		
		for (h = 1; h <= 100; h++) {
			System.out.println(h);
			if (h % 5 == 0) {
				System.out.println("HI");
				h++;
			}
			h++;
		}
		System.out.println("-------------");
//Do while loop:
//6. Print all odd and even numbers between 1 to 100
		// odd
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);// 135..9
			i++;
		}
		System.out.println("-------------");
		// even
		for (int i = 0; i <= 100; i += 2) {
			System.out.println(i);// 024..10

		}
		System.out.println("-------------");
//7. What will be the output of this program:

		/*
		 * int i = 1; while (i <= 1) { //System.out.println("Hi Java");//inifinity loop
		 * 
		 * } System.out.println("-------------");
		 */
//8. Print A-Z , a-z, 0-9 with  the respective ASCII numbers the console one using while and for loop.	
		for(char ch='A';ch<='Z';ch++) {
			System.out.println(ch +"=" + (byte)ch);
		}
		System.out.println("-------------");
		for(char ch='a';ch<='z';ch++) {
			System.out.println(ch +"=" + (byte)ch);
		}
		System.out.println("-------------");
		for(char ch='0';ch<='9';ch++) {
			System.out.println(ch +"=" + (byte)ch);
		}
		System.out.println("-------------");
		char ch = '0';
		while(ch<='9') {
			System.out.println(ch +"=" + (byte)ch);
			ch++;
		}
		System.out.println("-------------");
//9. Print the following series: 
//1.0 2.0 3.0  ...... 10.0 
//0 9 18 27 36 …99	
		for(float f=1.0f;f<=10.0;f++) {
			System.out.println(f);
			
		}
		System.out.println("-------------");
		for(int i=0;i<=99;i+=9) {
			System.out.println(i);
			
		}
		System.out.println("-------------");
//10.Print only vowels (aeiou) using for and while loop. Start the loop from ‘a‘ to ‘z‘.
		for(char c='a';c<='z';c++) {
			if(c=='a' && c=='e' && c=='i' && c=='o' && c=='u') {
				System.out.println("vowels");
			}
			else {
				System.out.println("constant");
			}
			
		}

		

	}

}
