package com.user.test;

public class Employee 
{
	private int number;
	private String name;
	private int salary;
	public Employee(int number, String name, int salary) {
		super();
		this.number = number;
		this.name = name;
		this.salary = salary;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getEmpo() {
		
		return 0;
	}
	@Override
	public String toString() {
		return "Employee [number=" + number + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
	