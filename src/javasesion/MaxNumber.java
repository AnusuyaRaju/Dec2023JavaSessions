package javasesion;

public class MaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ShortCircuitOperator_AND_OR_Operators_Loops_While loop
		/*
		 * && call it as short circuit which means 1st it will check LHS condition if
		 * it's fail then short circuit should happen even it will not check RHS
		 * Condition. If it's & operator then it will check both LHS and RHS condition
		 * even LHS is getting failed.
		 */

		// find out max number from 3 diff numbers
		int a = 2000;
		int b = 1500;
		int c = 2100;
		if (a > b && a > c) {
			System.out.println("a is greater");
		} else if (b > c) {
			System.out.println("b is greater");
		} else {
			System.out.println("c is greater");
		}

		// find out max number from 4 diff numbers
		int d = 600;
		int e = 500;
		int f = 600;
		int g = 600;
		if (d >= e && d >= f && d >= g) {
			System.out.println("d is greater");
		} else if (e >= f && e >= g) {
			System.out.println("e is greater");
		} else if (f >= g) {
			System.out.println("f is greater");
		} else {
			System.out.println("g is greater");
		}
		/*|| means either or should be satisfied eg: a>b || a>c if LHS is true then it will print the o/p it shouldn't go to check RHS as 
		it's following either or option satisfied.If it's | operator then it will keep checking all the conditions from LHS to RHS with 
		either or option satisfied.*/
		
		/*when we should use & for considering all should be mandatory then we can use & 
		 //button on the page:
		// 1. isVisible
		// 2. isEnabled
		// 3. isClickable
		//if(isVisible & isEnabled & isClickable)
		// if(isVisible & isEnabled & isClickable)//T&T&F
		// ---print/log -- useful for logging purpose
		// if(isVisible && isEnabled && isClickable)//F

		// if(isVisible | isEnabled | isClickable)
		// if(isVisible || isEnabled || isClickable)
		 */
		
		/*Number grading system with Nested if y we r using else if here y not use only else what if tomorrow you want to add some more range
		if 1st range not satisfied then you have to cover all ranges by using else if this is called Nested If. no limit for that we can use 
		any n no of else if conditions to solve it.*/
		
		int marks = 109;
		if (marks <= 100) {

			if (marks >= 80 && marks <= 90) {//true && false=false
				System.out.println("Grade A");

			} else {
				
				if (marks >= 95) {
					System.out.println("Grade A++");
					if (marks == 100) {
						System.out.println("eligible for schorlship");
					}
				} else {

					if (marks >= 0 && marks <= 10) {// true && false
						System.out.println("FAILed");
					} else if (marks >= 11 && marks <= 30) {// true && true
						System.out.println("Grade C");
					}

				}
			}
		} else {
			System.out.println("plz pass the right marks");
		}
		
//Assignments:
//Q1: Run the code and observe the output. Change the values of x and y to see how the combined conditions affect the result.
		int x = 10;
        int y = 9;

        if (x > 0 && y > 0 && x < y && x * 2 < y) {//t&t&f
            System.out.println("Hi");
        }
        
        if (x > 0 & y > 0 & x < y & x * 2 < y) {//f&t&t&t=
            System.out.println("Hello");
        }
        
/*Q2: Run the code and note the output. Then, change the values of a and b to all possible combinations of true and false and observe 
the results.*/
        boolean a1 = false;
        boolean b1 = true;
        
        boolean result = a1 && b1;
        System.out.println(result);
        
        boolean resultVal = a1 & b1;
        System.out.println(resultVal);
 

	}

}
