package javaassignment;

import java.util.Arrays;

public class ArraysExample {
	public static void main(String args[]) {
		/*
		 * Q1: WAP to delete a specific number from the given array. int p[] =
		 * {1,4,5,2,3,22,31, 2}; --Need to remove 22 from the p[] array. --output should
		 * be: [1, 4, 5, 2, 3, 31, 2]
		 */
		int p[] = { 1, 4, 5, 2, 3, 22, 31, 2 };
		int[] a = new int[p.length - 1];

		int j = 0;
		for (int i = 0; i < p.length; i++) {
			if (p[i] != 22) {
				a[j] = p[i];
				j++;//012345
			}
		}
		System.out.println(Arrays.toString(a));//[1,4,5,2,3,31,2]
/*Q2: Write a program to create a static Array, having following cricket data:--name, age, team name, DOB, gender, Strike Rate
--Try to create multiple Object Arrays for different players 
--Try to print all the values of each player on the console	*/	
		Object cricketer[] = new Object[6];
		cricketer[0] = "Koli";
		cricketer[1] = 25;
		cricketer[2] = "CSK";
		cricketer[3] = "04/12/1998";
		cricketer[4] = 'm';
		cricketer[5] = 60;
		System.out.println(cricketer.length);
		System.out.println(Arrays.toString(cricketer));
		
		Object cricketer1[] = new Object[6];
		cricketer1[0] = "Sachin";
		cricketer1[1] = 29;
		cricketer1[2] = "MI";
		cricketer1[3] = "04/12/1994";
		cricketer1[4] = 'm';
		cricketer1[5] = 75;
		System.out.println(cricketer1.length);
		System.out.println(Arrays.toString(cricketer1));
		
		Object cricketer2[] = new Object[6];
		cricketer2[0] = "Virat";
		cricketer2[1] = 28;
		cricketer2[2] = "MI";
		cricketer2[3] = "04/12/1995";
		cricketer2[4] = 'm';
		cricketer2[5] = 70;
		System.out.println(cricketer2.length);
		System.out.println(Arrays.toString(cricketer2));
		

	}

}
