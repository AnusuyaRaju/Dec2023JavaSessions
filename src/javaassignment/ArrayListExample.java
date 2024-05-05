package javaassignment;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {

	public static void main(String[] args) {
		/*
		 * 1. Write a Java program to create a new array list, which contains all
		 * color names. --add some colors (string) ---and print out the colorslist using
		 * loops.
		 */
		ArrayList<String> colors = new ArrayList<>();
		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");
		colors.add("Yellow");
		for(String color : colors) {
			System.out.println(color);
		}
		System.out.println("----------");
//2. Write a Java program to retrieve an element at a specified index from a given array list.
		        String color = colors.get(2);
		        System.out.println(color);
		        System.out.println("----------");
//3. Write a Java program to update specific array element by given element.
		        colors.set(1, "purple");
		        System.out.println(colors);
		        System.out.println("----------");
//4. Write a Java program to remove the third element from an array list. 
		        colors.remove(2);
		        System.out.println(colors);
		        System.out.println("----------");
//5. Write a Java program to search an element in an array list using for loop. Once we find that element, break the loop.
				String searchcolor = "Red";
				for(String color1 : colors) {
					if(color1.equals(searchcolor)) {
						System.out.println("Found " + searchcolor);
						break;
					}
				}
				System.out.println("----------");
//6. Reverse this array List:

				ArrayList<String> studentNames = new ArrayList<String>();
				studentNames.add("Varun");
				studentNames.add("Reena");
				studentNames.add("Naveen");
				studentNames.add("Robin");
				studentNames.add("Peter");	
				Collections.reverse(studentNames);
				System.out.println(studentNames);
				System.out.println("----------");
//7. Write a Java program to extract a portion of an array list.
				ArrayList<String> col = new ArrayList<>();
				col.add("Red");
                col.add("Green");
                col.add("Blue");
                col.add("Yellow");
				col.add("Purple");
				ArrayList<String> portion = new ArrayList<>(col.subList(1, 4));//fromOndex inclusive and toIndex exclusive
				System.out.println(portion);
				System.out.println("----------");
//8. Write a Java program to empty an array list.	
				ArrayList<String> colo = new ArrayList<>();
				colo.add("Red");
				colo.add("Green");
				colo.add("Blue");
				colo.add("Yellow");
				colo.add("Purple");
				System.out.println(colo);
                colo.clear();
				System.out.println(colo);
				System.out.println("----------");
//9. Write a Java program to trim the virtual capacity of an array list to the current list size.
				ArrayList<String> color1 = new ArrayList<>(10);
				color1.add("Red");
				color1.add("Green");
				color1.add("Blue");
				color1.add("Yellow");
				color1.trimToSize();
				System.out.println(color1.size());
				System.out.println("----------");
//10. Write a Java program to print all the elements of an ArrayList using the position of the elements.
				ArrayList<String> colors2 = new ArrayList<>();
				colors2.add("pink");
				colors2.add("black");
				colors2.add("white");
				colors2.add("grey");
				for(int i=0;i<colors2.size();i++) {
					System.out.println("Element at index " + i + " is " + colors2.get(i));
				}
			

	}

}
