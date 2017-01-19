package com.classes.pojo;

public class Person {

	private String firstName;
	private String lastName;
	private int age;
	private int srNo;
	
	public Person(){
		
	}
	
	public Person(int srNo,String firstName,String lastName,int age){
		this.srNo = srNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the srNo
	 */
	public int getSrNo() {
		return srNo;
	}
	/**
	 * @param srNo the srNo to set
	 */
	public void setSrNo(int srNo) {
		this.srNo = srNo;
	}
	
	public String toString(){
		return "[Sr. No.: "+srNo+", First Name: "+firstName+", Last Name: "+lastName+", Age: "+age+"]";
	}
}
