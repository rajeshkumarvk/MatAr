package Aera;

public class Employee {
	
	String name;
	String role;
	String dept;
	int age;
	int empid;
	boolean isPermanent;

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.name = "Tom";
		e1.age = 25;
		e1.role ="Test Engineer";
		e1.dept = " Product Development";
		e1.empid = 1001;
		e1.isPermanent = true;
		
		Employee e2 = new Employee();
		
		e2.name = "Adler";
		e2.age = 26;
		e2.role ="Senior Test Engineer";
		e2.dept = " Product Development";
		
		System.out.println(e1.name + " " + e1.age + " " +e1.role+ " " +e1.empid+ " " +e1.dept+ " " +e1.isPermanent);
		
		System.out.println(e2.name + " " + e2.age + " " +e2.role+ " " +e2.empid+ " " +e2.dept+ " " +e2.isPermanent);
		
		ConstructorConcepts comp = new ConstructorConcepts("Apple", "Cook"," apple cloud", 100000, 100);

		System.out.println(comp.name+ " " +comp.ceo+ " " +comp.product);
	}

}
