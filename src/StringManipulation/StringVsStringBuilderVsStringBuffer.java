package StringManipulation;

public class StringVsStringBuilderVsStringBuffer {

	public static void main(String[] args) {
		
		//String:Immutable
		String tr = "Hello";
		tr.concat("selenium");
		tr.concat("testing");
		System.out.println(tr);
		
		//StringBuffer:Mutable
		StringBuilder sb = new StringBuilder("Hello");
		sb.append("selenium");
		sb.append("testing");
		System.out.println(sb);
		
		

	}

}
