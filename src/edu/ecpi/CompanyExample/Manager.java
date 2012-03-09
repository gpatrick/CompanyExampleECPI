package edu.ecpi.CompanyExample;

public class Manager extends Employee {
	protected int numberOfEmployees;
	protected float budget;
	
	public void setNumberOfEmployees(int numberOfEmployees){
		this.numberOfEmployees = numberOfEmployees;
	}
	
	public int getNumberOfEmployees(){
		return numberOfEmployees;
	}
	
	public void setBudget(float budget){
		this.budget = budget;
	}
	
	public float getBudget(){
		return budget;
	}
	
	public String toString(){
		return "Manager LastName: " + lastName + ". Budget: " + budget;
	}
}
