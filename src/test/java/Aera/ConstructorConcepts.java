package Aera;

import java.util.ArrayList;

public class ConstructorConcepts {
	
	String name;
	String ceo;
	String product;
	int revenue;
	int employeecount;
	static int holidaycount = 20;
	
	ArrayList<String> brancheslist;
	
	ArrayList<String> broswerlist;
	
	
	public ConstructorConcepts(String name, String ceo, String product, int revenue, int employeecount,
			ArrayList<String> brancheslist, ArrayList<String> broswerlist) {
		
		this.name = name;
		this.ceo = ceo;
		this.product = product;
		this.revenue = revenue;
		this.employeecount = employeecount;
		this.brancheslist = brancheslist;
		this.broswerlist = broswerlist;
	}
	public ConstructorConcepts(String name, String ceo, String product, int revenue, int employeecount,
			ArrayList<String> brancheslist) {
		
		this.name = name;
		this.ceo = ceo;
		this.product = product;
		this.revenue = revenue;
		this.employeecount = employeecount;
		this.brancheslist = brancheslist;
	}
	public ConstructorConcepts() {
		System.out.println("Default Constructor");
	}
	public ConstructorConcepts(String name, String ceo, String product, int revenue, int employeecount) {
		this.name = name;
		this.ceo = ceo;
		this.product = product;
		this.revenue = revenue;
		this.employeecount = employeecount;
	}

	public static void main(String[] args) {
		
		ConstructorConcepts def = new ConstructorConcepts();
		ConstructorConcepts cc = new ConstructorConcepts("Amazon", "Becoz", "AWS", 100000, 1000);
		ConstructorConcepts cc1 = new ConstructorConcepts("google", "Sundar", "Google cloud", 100000, 1000);
		System.out.println(cc.name+ " " +cc.ceo);
		System.out.println(cc1.name+ " " +cc1.ceo+ " " +cc1.revenue);
		System.out.println(ConstructorConcepts.holidaycount);
		
		ArrayList<String> branches = new ArrayList<String>();
		
		branches.add("CA");
		branches.add("BLR");
		branches.add("LONDON");
		
		ConstructorConcepts brn = new ConstructorConcepts("Amazon", "Becoz", "AWS", 100000, 1000, branches);
		
		System.out.println(brn.name+ " " +brn.ceo+ " " +brn.revenue+ " " +brn.brancheslist);
	
		System.out.println(brn.name+ " " +brn.ceo+ "  " +brn.brancheslist.get(2));
		
		ArrayList<String> browsernames = new ArrayList<String>();
		
		browsernames.add("Chrome");
		browsernames.add("Safari");
		browsernames.add("Firefox");
		browsernames.add("IE");

		ConstructorConcepts comp = new ConstructorConcepts("Apple", "Steve", "AWS", 100000, 1000, branches, browsernames);
		
		System.out.println(comp.name+ " " +comp.ceo+ "  " +comp.broswerlist);
		
		System.out.println(comp.name+ " " +comp.ceo+ "  " +comp.broswerlist.get(2));
	}

}
