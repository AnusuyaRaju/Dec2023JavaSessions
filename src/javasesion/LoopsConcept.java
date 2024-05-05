package javasesion;

public class LoopsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1.While loop: start->condition checking->if it's true->print o/p->if it's fail then it won't print anything come out of loop
		int i = 10;//reverse order from 10 to 1
		while (i>=1) {
			System.out.println(i);//1234...10
			i--; //we can use ++i,i=i+1 also
			//break;
			
		}
		System.out.println("------------");
		while(true) {
			System.out.println("welcome to Hotel Taj");
			break;
		}
		int p = 1;
		while (p<=100) {
			System.out.println(p);
			//break;
			if(p%5==0) {//1%5=1... 5%5 =0
				System.out.println("hi");
				p++;
				//break;
			}
			p++;
			
		}
		boolean flag = true;
		while(!flag) {//false
			System.out.println("Hello");
		}
		
		int total = 60;
		while(total>=50 && total<=100) {//T && F
			System.out.println("Testing");
			total++;//61 62 63 .......100...101
		}
	
		System.out.println("--------------");
		
		//use cases while loop:
		//when number of iterations are not fixed
		//ex:
		//1. wait for the webelement on the page: 5, 10, 15, 3, 30
		//2. wait for page loading: 1, 5, 10, 15, 4 -- 
		//3. drop down: dynamic: 5, 10, 20, 15 ---> 
		//4. webtable pagination: 
		//5. carousel
		//6. calendar handling: 
		//7. page scrolling: Infitnite
		
//2.For loop: 1 to 10
		for(int j=1;j<=10;j++) {
			System.out.println(j);
		}
		for(; ;) {//here if u don't writ anything then it will print infinitely automatically it takes as true if we give it as false getting unreachable code
			System.out.println("bye");
			break;
		}
		for(byte b=10;b<=50;b++) {
			System.out.println(b);
		}
		for(float h=1.0f;h<=5.5;) {
			System.out.println(h);
			h=h+0.1f;
			
			
		}
		for(char ch='a';ch<='z';ch++) {
			//System.out.println(ch);//a to z
			System.out.println(ch +"="+ (byte)ch);//
		}
		for(char cha='A';cha<='Z';cha++) {
			System.out.println(cha +"="+(byte)cha);
		}
		for(char cg=97;cg<=122;cg++) {
			System.out.println(cg +"="+(byte)cg);
			//System.out.println(cg);
		}
		//use cases for loop:
				//when number of iterations are fixed
				//ex:
				//static drop down: month - 1 to 12
				//Arrays -- fixed size
				//excel sheets: 10 
		for(int p1=0; p1<=10; p1++) {
			System.out.println("Hello World " + p1);
		}
		for(int as=10; as>=1; as--) {
			System.out.println(as);//10987654321
		}
		
		System.out.println("------------------");
//3.do while loop:
		int d = 1;
		do {
			d++;//246
			System.out.println(d);//246..10
			d++;//357..10
		}
		while(d<=10);
		System.out.println("------------------");
		
		do {
			//d++;//246
			System.out.println(d);
			d++; 
			break;
		}
		while(d<=10);
		System.out.println("------------------");
		//use cases:
	    //element: is already present on the page -- click on it and break
		
//1 to 10: odd no's
		for(int num=1;num<=10;num++) {//357911
			System.out.println(num);//13579
			num++;//246810
		
		}
		System.out.println("------------------");
		for(int nun=2;nun<=100;nun+=2) {//
			System.out.println(nun);//246810...100
//0 is not a odd or even number o is o only
			//num%2==0 assignment
			
		
		}
		
		

	}

}
