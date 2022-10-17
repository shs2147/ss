package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity

public class EmployeeDeduction {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private int emp_Id;
	private int deduction_Id;
	private String type;
	private double ammount;
	private int effective_Date;
	private int date_created;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getEmp_Id() {
		return emp_Id;
	}
	public void setEmp_Id(int emp_Id) {
		this.emp_Id = emp_Id;
	}
	public int getDeduction_Id() {
		return deduction_Id;
	}
	public void setDeduction_Id(int deduction_Id) {
		this.deduction_Id = deduction_Id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getAmmount() {
		return ammount;
	}
	public void setAmmount(double ammount) {
		this.ammount = ammount;
	}
	public int getEffective_Date() {
		return effective_Date;
	}
	public void setEffective_Date(int effective_Date) {
		this.effective_Date = effective_Date;
	}
	public int getDate_created() {
		return date_created;
	}
	public void setDate_created(int date_created) {
		this.date_created = date_created;
	}
	@Override
	public String toString() {
		return "EmployeeDeduction [id=" + id + ", emp_Id=" + emp_Id + ", deduction_Id=" + deduction_Id + ", type="
				+ type + ", ammount=" + ammount + ", effective_Date=" + effective_Date + ", date_created="
				+ date_created + "]";
	}
	
	
	
	
	
}
