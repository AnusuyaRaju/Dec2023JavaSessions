package javasesion;

public class ConditionalStatements {

	public static void main(String[] args) {
/*		Q1.a : Find out the greatest number out of three different given numbers:
            Input the 1st number: 25 
            Input the 2nd number: 78 
            Input the 3rd number: 87*/
		int a = 25;
		int b = 78;
		int c = 87;
		if(a>=b&&a>=c) {
				System.out.println(a+ " is greatest number");
				}
		else if(b>=a&&b>=c) {
			System.out.println(b+ " is greatest number");
			
		}
		else {
			System.out.println(c+ " is greatest number");
		}
		
		/*
		 * 1.b : Find out the greatest number out of four different given numbers:
		 * 
		 * Input the 1st number: 25  Input the 2nd number: 78  Input the 3rd number: 87
		 * Input the 4th number: 97
		 */
		int d = 25;
		int e = 78;
		int f = 87;
		int g = 97;
		if(d>=e&&d>=f&&d>=g) {
				System.out.println(d+ " is greatest number");
				}
		else if(e>=d&&e>=f&&d>=g) {
			System.out.println(e+ " is greatest number");
			
		}
		else if(f>=d&&f>=e&&f>=g) {
			System.out.println(f+ " is greatest number");
			
		}
		else {
			System.out.println(g+ " is greatest number");
		}
		/*
		 * 2. Write a Java program to test a number is positive or negative. Test Data
		 * Input number: 35 -- positive number Input number: -11 -- negative number
		 */
         int n1 = 35;
         int n2 = -11;
         if(n1>0) {
        	 System.out.println(35+ " is positive");
         }
         else if(n2<0) {
        	 System.out.println(-11+ " is negative");
        	 
         }
         else {
        	 System.out.println("the number is zero");
         }
//3.WAP to check number is odd or even using If - Else
         int n = 2;
         int m = 3;
         if(m%2==0) {
        	 System.out.println("given number is even number");
        	 
        	 }
         else {
        	 System.out.println("given number is odd number");
         }
//4.WAP to check given alphabet character is Vowel or Consonant using Switch - Case
         char c1 = 'e';
         switch (c1) {
		case 'a':
			System.out.println(c1+ " is a vowel");
			break;
		case 'e':
			System.out.println(c1+ " is a vowel");
			break;
		case 'i':
			System.out.println(c1+ " is a vowel");
			break;
		case 'o':
			System.out.println(c1+ " is a vowel");
			break;
		case 'u':
			System.out.println(c1+ " is a vowel");
			break;

		default:
			System.out.println(c1+ " is a constant");
			break;
		}
//5.WAP to run your test cases in a specific environment like: QA, Stage, Dev, UAT, Prod using using Switch - Case
         String env = "Dev";
         switch (env) {
		case "QA":
			System.out.println(env+ " is a test env");
			break;
		case "Stage":
			System.out.println(env+ " is a test env");
			break;
		case "Dev":
			System.out.println(env+ " is a test env");
			break;
		case "UAT":
			System.out.println(env+ " is a test env");
			break;
		case "Prod":
			System.out.println(env+ " is a test env");
			break;

		default:
			System.out.println(env+ " is not a test env");
			break;
		}
		/*
		 * 6.WAP to book the specific type of car from the Uber app using Switch - Case.
		 * Car Type: Mini, Sedan, SUV, Premium If user passes wrong car type, print
		 * please select the right car type
		 */
         String car = "Nexa";
         switch (car) {
		case "Mini":
			System.out.println("Mini is uber car type");
			break;
		case "Sedan":
			System.out.println("Sedan is uber car type");
			break;
		case "SUV":
			System.out.println("SUV is uber car type");
			break;
		case "Premium":
			System.out.println("Premium is uber car type");
			break;

		default:
			System.out.println("Please select the right car type");
			break;
		}
		/*
		 * 8.WAP to launch browsers using If-ElseIf and Switch Case. Browser:
		 * Chrome/Firefox/IE/Safari If user passes wrong browser, print please pass the
		 * right browser name
		 */
         String browser = "Opera";
         switch (browser) {
		case "Chrome":
			System.out.println("launch chrome browser");
			break;
		case "Firefox":
			System.out.println("launch Firefox browser");
			break;
		case "IE":
			System.out.println("launch IE browser");
			break;
		case "Safari":
			System.out.println("launch Safari browser");
			break;

		default:
			System.out.println("Please pass right browser");
			break;
		}
         String browser1 = "Opera";
         
         if(browser1.equals("Chrome")) {
        	 System.out.println("launch chrome browser");
         }
         else if(browser1.equals("Firefox")) {
        	 System.out.println("launch Firefox browser");
         }
         else if(browser1.equals("IE")) {
        	 System.out.println("launch IE browser");
         }
         else if(browser1.equals("Safari")) {
        	 System.out.println("launch Safari browser");
         }
         else {
        	 System.out.println("Please pass right browser");
         }
			/*
			 * 8.WAP to define the interest rate on the basis of Loan type using Switch Case
			 * Loan Type: Car Loan, Housing Loan, Personal Loan, Education Loan For Housing
			 * Loan, if user’s salary is less than 35000 USD - print : NOT APPLICABLE FOR
			 * Housing Loan
			 */
         
         String loanType = "Education Loan";
         double salary = 20000;
         double interestRate = 0;

         switch (loanType) {
             case "Car Loan":
                 interestRate = 6.5;
                 break;
             case "Housing Loan":
                 if (salary < 35000) {
                     System.out.println("NOT APPLICABLE FOR Housing Loan");
                     break;
                 }
                 interestRate = 7.5;
                 break;
             case "Personal Loan":
                 interestRate = 10.0;
                 break;
             case "Education Loan":
                 interestRate = 8.0;
                 break;
             default:
                 System.out.println("Invalid loan type");
                 return;
         }

         System.out.println("Interest rate for " + loanType + " is " + interestRate + "%");	
         

	}

}
