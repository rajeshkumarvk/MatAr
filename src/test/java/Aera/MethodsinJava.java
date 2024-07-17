package Aera;

import java.util.ArrayList;

public class MethodsinJava {
	
	/**
	 * 
	 * @return marks
	 */
	
	public int[] getstudentMarks() {
		
		System.out.println("get student marks");
		int marks[] = new int[4];
		marks[0] = 60;
		marks[1] = 70;
		marks[2] = 80;
		marks[3] = 90;
		
		return marks;
	}
	
	/**
	 * this method returns an ArrayList of String- Employeelist on the basis of company Name
	 * @param companyname
	 * @return this method returns an ArrayList of String- Employeelist on the basis of company Name
	 */
	public ArrayList<String> getEmployeelist(String companyname) {
		
		ArrayList<String> complist = new ArrayList<String>();
		
		if(companyname.equals("IBM")) {
			complist.add("Rajesh");
			complist.add("Veeresh");
			complist.add("Gopinath");
			
		}
		else if (companyname.equals("MS")) {
			complist.add("Ramesh");
			complist.add("Kiran");
		}
		else if (companyname.equals("Google")) {
			complist.add("Ravi");
		}
		else {
			System.out.println("company name not present:" +companyname);
		}
		return complist;
	}

	public static void main(String[] args) {
		
		MethodsinJava obj = new MethodsinJava();
		
		int [] m= obj.getstudentMarks();
		
		System.out.println(m.length);
		System.out.println(m[3]);
		
		for(int i=0; i<m.length ; i++) {
			
			System.out.println(m[i]);
			
		}
	 ArrayList<String> empnames = obj.getEmployeelist("IBM");
	 	System.out.println(empnames);
	 
	 ArrayList<String> empnames1 = obj.getEmployeelist("MS");
	 	System.out.println(empnames1);
	 
	 ArrayList<String> empnames2 = obj.getEmployeelist("Uber");
	 	System.out.println(empnames2);
	}

}
