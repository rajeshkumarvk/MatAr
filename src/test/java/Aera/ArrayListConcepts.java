package Aera;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListConcepts {

	public static void main(String[] args) {
	
		ArrayList <String> StudentNames = new ArrayList<String>();
		
		StudentNames.add("Rama");
		StudentNames.add("Shiva");
		StudentNames.add("Vishnu");
		StudentNames.add("Ganesha");
		StudentNames.add("Hanumanatha");
		StudentNames.add("Bharatha");
		StudentNames.add("Laxmana");
	
		//To trim the Virtual Size
		StudentNames.trimToSize();

		System.out.println(StudentNames);
		
		//To reverse the String
		for(int i= StudentNames.size()-1; i>=0; i--) {
			System.out.println(StudentNames.get(i));
		}
		
		//To reverse the String using collections
		Collections.reverse(StudentNames);
		
		System.out.println(StudentNames);
		
			}
			
			
	//portion of an arraylist
			
	
		

	}

