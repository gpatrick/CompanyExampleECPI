package edu.ecpi.CompanyExample;

public class Employee extends Person {
	protected String employeeID;
	protected String department;
	protected String startDate;
	protected Manager manager;
	
	public void setEmployeeID(String employeeID){
		this.employeeID = employeeID;
	}
	
	public String getEmployeeID(){
		return employeeID;
	}
	
	public void setDepartment(String department){
		this.department = department;
	}
	
	public String getDepartment(){
		return department;
	}
	
	public void setStartDate(String startDate){
		this.startDate = startDate;
	}
	
	public String getStartDate(){
		return startDate;
	}
	
	public void setManager(Manager manager){
		this.manager = manager;
	}
	
	public Manager getManager(){
		return manager;
	}
	
	public String toString(){
		return "Employee LastName: " + lastName + ". EmployeeID: " + employeeID;
	}
}
