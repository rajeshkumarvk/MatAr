package Aera;

public class FunctionsinJava {
	
	//can not create a function inside function
	//data members of class: class variables and class methods
	
	//1. simple function no input no return:
	
	public void test() {
		System.out.println("test method");
	}
	
	//2. no input some output
	
	public int getNumbers() {
		System.out.println("get Numbers");
		int a=10;
		int b=20;
		int c = a+b;
		
		return c;
		
	
	}

	//3. some input and some output
	
	public int sum(int a , int b) {
		
		System.out.println("sum of numbers");
		
		int z = a+b;
		
		return z;
	}
		
	//4. some input and output
	
	public int getMarks(String studentName) {
		
		System.out.println("get Marks: " +studentName);
		int marks = -1;
		
		if(studentName.equals("Rajesh")) {
			marks = 80;
			
		}
		
		else if (studentName.equals("Veeresh")) {
			marks = 90;
		
		}
		
		else if(studentName.equals("Gopi")) {
			marks = 95;
			
	}
		else{
			System.out.println("the student is not present: "  +studentName);
			return marks;
		}
		
			return marks;
	}
	
	public String launchApp(String browserName) {
		
		String Name = null;
		
		 if(browserName.equals("Chrome")) {
			 Name ="Chrome";
			 System.out.println("launch chrome");
		 }
		 else if(browserName.equals("firefox")) {
			 Name ="firefox";
			 System.out.println("launch firefox");
		 }
		 else if(browserName.equals("IE")) {
			 Name ="IE";
			 System.out.println("launch IE");
		 }
		 
		 return Name;
	}
	
	public static void main(String[] args) {
		
		FunctionsinJava obj = new FunctionsinJava();
		obj.test();
		
		int num = obj.getNumbers();
		System.out.println(num);
		
	int sum1 = obj.sum(30, 40);
	System.out.println(sum1);
	
	int sum2 = obj.sum(80, 50);
	System.out.println(sum2);
		
		int mark = obj.getMarks("Rajesh");
		System.out.println(mark);
		
		int mark1 = obj.getMarks("Ramesh");
		System.out.println(mark1);
		
		String bname = obj.launchApp("Chrome");
		System.out.println(bname);
		
		String bname1 = obj.launchApp("Opera");
		System.out.println(bname1);
		
	}

}
