package edu.ecpi.CompanyExample;

public class Person {
	protected String firstName;
	protected String lastName;
	protected String dateOfBirth;
	protected String ssn;
	protected String address;
	protected String gender;
	protected String phone;
	
	public Person(String firstName, String lastName, String dateOfBirth, String ssn,
				String address, String gender, String phone){
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.ssn = ssn;
		this.address = address;
		this.gender = gender;
		this.phone = phone;
	}
	
	public Person(String firstName, String lastName){
		this(firstName, lastName, null, null, null, null, null);
	}
	
	public Person(){
		this(null, null, null, null, null, null, null);
	}
	
	public String getName(){
		return firstName + " " + lastName;
	}
	
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	
	public String getFirstName(){
		return firstName;
	}
	
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public void setDateOfBirth(String dateOfBirth){
		this.dateOfBirth = dateOfBirth;
	}
	
	public String getDateOfBirth(){
		return dateOfBirth;
	}
	
	public void setSSN(String ssn){
		this.ssn = ssn;
	}
	
	public String getSSN(){
		return ssn;
	}
	
	public void setAddress(String address){
		this.address = address;
	}
	
	public String getAddress(){
		return address;
	}
	
	public void setGender(String gender){
		this.gender = gender;
	}
	
	public String getGender(){
		return gender;
	}
	
	public void setPhone(String phone){
		this.phone = phone;
	}
	
	public String getPhone(){
		return phone;
	}
	
	public String toString(){
		return getName();
	}
}
