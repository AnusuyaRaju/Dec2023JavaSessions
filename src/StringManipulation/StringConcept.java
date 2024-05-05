package StringManipulation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javasesion.User;

public class StringConcept {

	public static void main(String[] args) {
		
		String str = "hello This is my java code and i am so happy i am expert";
		System.out.println(str.length());
		//li = 0
		//hi = 37
		//length = hi + 1 = 38
		//hi = length - 1 = 37
		
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(37));
		//System.out.println(str.charAt(38));//STringIndexoutOfBoundExp - SIOB
		//System.out.println(str.charAt(-1));//SIOB
		
		System.out.println(str.indexOf("T"));
		System.out.println(str.indexOf("i"));//1st occurrence of i = 8
		
		System.out.println(str.indexOf("i", str.indexOf("i")+1));//2nd occurrence of i = 11
		System.out.println(str.indexOf("i", str.indexOf("i", str.indexOf("i")+1)+1));
		System.out.println(str.indexOf("i", str.indexOf("i", str.indexOf("i", str.indexOf("i")+1)+1)+1));
		
		String mesg = "this is my java code";
		System.out.println(mesg.indexOf("java"));
		System.out.println(mesg.indexOf("python"));//if something is not there then by default it will give -1
		System.out.println(mesg.indexOf("Java"));
		
		
		String m = "Welcome null";
		if(m.indexOf("admin") == 8) {
			System.out.println("correct mesg");
		}else {
			System.out.println("incorrect mesg");
		}
		if(m.indexOf("admin") == -1) {
			System.out.println("incorrect mesg - FAIL");
		}
		
		//
		String test = "      hello world  ";
		System.out.println(test.trim());//used to remove space from corners b4 & after
		
		//
		String dob = "01-01-1990";//want o/p will be 01/01/1990
		System.out.println(dob.replace("-", "/"));
		
		//
		String top = "        hello  world   ";//want o/p will be helloworld
		//System.out.println(top.replace(" ", ""));//one by one it will replace
		System.out.println(top.replaceAll(" ", ""));//immediately collect all the spaces together and remove it better than replace
		
		//
		String mg = "Java Python Ruby";
		System.out.println(mg.replace(" ", "||"));
		System.out.println(mg.replace("Java", "JS"));
		
		
		//Split: split the string on basis of something
		String pop = "javascript;java;python;ruby";
		String p[] = pop.split(";");
		System.out.println(p[0]);
		System.out.println(p.length);
		
		String rest = " xXHelloSeleniumxxXPythonXxXxAutomationXxXLabs";
		String rs[] = rest.split("xX");
		System.out.println(rs[1]);
		System.out.println(rs[0].length());//if there is a space then o/p will be 1 no space then it will be 0
		
		//
		String empData = "pallavi;sharma;30;pune;india;9809876967";
		String empData1 = empData.replace(";", ".");
		System.out.println(empData1);
		String ed[] = empData1.split("\\.");//.,||,| it should give correct o/p for that case we should use backward slash \\
		System.out.println(ed[0]);
		
		//**************************************************//
		
		String name = "Test Automation Labs";
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		
		String domain = "    hello    selenium    ";
		String dom = domain.replaceAll("\\s+", "");//S means space + means more than 1 space so we can use this or replaceAll(" ", "")
		System.out.println(dom);
		
		String t1 = "your order id is 12345";
		String ordreId = t1.replaceAll("\\D+", "");//D means non numeric digits + means more than 1
		System.out.println(ordreId);
		
		
		String t2 = "your user id is 9090 and order id is 12345";
//		String userId = t2.replaceAll("\\D+", "");
//		System.out.println(userId);
		
		Pattern pattern =  Pattern.compile("\\d+");//d means numeric digits + means more than 1
		Matcher matcher =  pattern.matcher(t2);
		
//		while(matcher.find()) {
//			System.out.println(matcher.group());
//		}
		
		String userId = null;
		String ordId = null;
		if(matcher.find()) {
			userId = matcher.group();
			System.out.println(userId);
		}
		if(matcher.find()) {
			ordId = matcher.group();
			System.out.println(ordId);
		}
		
		System.out.println(userId);
		System.out.println(ordId);
		
		//
		String tr = "Hello!! this is my value .$123333*";
		String finalValue = tr.replaceAll("[^a-zA-Z0-9]", "");//^ means other than that including space. space also spl character if u want o/p with space then add \\s
		System.out.println(finalValue);
		
		

	}

}
