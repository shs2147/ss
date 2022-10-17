package com.example.demo.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EmployeeAllowances {
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private int id;
	private int employee_id;
	private String type;
	private double ammount;
	private int effective_date;
	private int date_created;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
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
	public int getEffective_date() {
		return effective_date;
	}
	public void setEffective_date(int effective_date) {
		this.effective_date = effective_date;
	}
	public int getDate_created() {
		return date_created;
	}
	public void setDate_created(int date_created) {
		this.date_created = date_created;
	}
	@Override
	public String toString() {
		return "EmployeeAllowances [id=" + id + ", employee_id=" + employee_id + ", type=" + type + ", ammount="
				+ ammount + ", effective_date=" + effective_date + ", date_created=" + date_created + "]";
	}
	
	

}
