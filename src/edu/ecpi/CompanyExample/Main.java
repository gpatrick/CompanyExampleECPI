package edu.ecpi.CompanyExample;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(int i = 0; i < args.length; i++){
			System.out.println("args[" + i + "] = " + args[i]);	
		}
		
		Person p1 = new Person("Greg", "Patrick");
		Person p2 = new Person();
		p2.setFirstName("Joe");
		p2.setLastName("Blow");
		p2.setAddress("123 Anywhere St");
		p2.setPhone("555-1212");

		System.out.println("P1 = " + p1);
		System.out.println("P2 = " + p2);
				
		Manager m1 = new Manager();
		m1.setLastName("Scrooge");
		m1.setBudget(1.00f);
		System.out.println("Manager = " + m1);
		
		Employee e1 = new Employee();
		e1.setFirstName("Jane");
		e1.setLastName("Doe");
		e1.setEmployeeID("123456789");
		e1.setManager(m1);
		System.out.println("Employee = " + e1);
		
		/*Initialize employee array*/
		Employee[] employees = new Employee[10];
		for(int i = 0; i < employees.length; i++){
			employees[i] = new Employee();
		}
		
		/*Use employee array here*/
		for(int i = 0; i < employees.length; i++){
			employees[i].setEmployeeID(""+i);
		}
			
		for(Employee i : employees){
			System.out.println("Employee = " + i);
		}
	}

}
