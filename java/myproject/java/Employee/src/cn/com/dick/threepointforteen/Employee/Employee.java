//exam 3.14
//object obtain information of employee
package cn.com.dick.threepointforteen.Employee;
public class Employee {
	private String name;//instance variable that stores the name
	private String surName;//instance variable that stores the surname
	private double salary;//instance variable that stores the salary
	
	public  Employee(String name, String surname, double salary) {
		this.name = name;
		this.surName = surname;
		this.salary = salary;
	}
	
	//method get or set the instance variables
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surName;
	}
	public void setSurname(String surname) {
		this.surName = surname;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		if (salary<0)
			salary = 0.0;
		this.salary = salary;
	}
	
	public void addSalary(double points){
		if (points<0)
			points = 1;
	this.salary = (1+points)*this.salary;	
	}

}
