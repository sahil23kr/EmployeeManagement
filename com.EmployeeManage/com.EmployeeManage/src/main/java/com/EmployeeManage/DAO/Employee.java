package com.EmployeeManage.DAO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employeemanage")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Id")
	private int emp_Id;
	@Column(name="Name")
	private String emp_Name;
	@Column(name="Age")
	private int emp_Age;
	@Column(name="Salary")
	private double emp_Salary;
	@Column(name="Email")
	private String emp_Email;
	@Column(name="Password")
	private String emp_Password;
	public int getEmp_Id() {
		return emp_Id;
	}
	public void setEmp_Id(int emp_Id) {
		this.emp_Id = emp_Id;
	}
	public String getEmp_Name() {
		return emp_Name;
	}
	public void setEmp_Name(String emp_Name) {
		this.emp_Name = emp_Name;
	}
	public int getEmp_Age() {
		return emp_Age;
	}
	public void setEmp_Age(int emp_Age) {
		this.emp_Age = emp_Age;
	}
	public double getEmp_Salary() {
		return emp_Salary;
	}
	public void setEmp_Salary(double emp_Salary) {
		this.emp_Salary = emp_Salary;
	}
	public String getEmp_Email() {
		return emp_Email;
	}
	public void setEmp_Email(String emp_Email) {
		this.emp_Email = emp_Email;
	}
	public String getEmp_Password() {
		return emp_Password;
	}
	public void setEmp_Password(String emp_Password) {
		this.emp_Password = emp_Password;
	}
	
	

}
