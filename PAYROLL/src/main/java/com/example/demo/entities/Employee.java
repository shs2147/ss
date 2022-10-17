package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity

public class Employee {
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private int id;
	private int emp_Id;
	private String fiist_Name;
	private String last_Name;
	private String middle_Name;
	private int dep_Id;
	private int  position_Id;
	private double salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getEmpId() {
		return emp_Id;
	}
	public void setEmpId(int empId) {
		this.emp_Id = empId;
	}
	public String getFiistName() {
		return fiist_Name;
	}
	public void setFiistName(String fiistName) {
		this.fiist_Name = fiistName;
	}
	public String getLastName() {
		return last_Name;
	}
	public void setLastName(String lastName) {
		this.last_Name = lastName;
	}
	public String getMiddleName() {
		return middle_Name;
	}
	public void setMiddleName(String middleName) {
		this.middle_Name = middleName;
	}
	public int getDepId() {
		return dep_Id;
	}
	public void setDepId(int depId) {
		this.dep_Id = depId;
	}
	public int getPositionId() {
		return position_Id;
	}
	public void setPositionId(int positionId) {
		this.position_Id = positionId;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", empId=" + emp_Id + ", fiistName=" + fiist_Name + ", lastName=" + last_Name
				+ ", middleName=" + middle_Name + ", depId=" + dep_Id + ", positionId=" + position_Id + ", salary="
				+ salary + "]";
	}
	
	

}
