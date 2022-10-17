package com.example.demo.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="Pay_Roll")
@Entity

public class PayRoll {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private int ref_No;
	private int date_From;
	private int date_To;
	private String type;
	private String status;
	private int dateCerated;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRef_No() {
		return ref_No;
	}
	public void setRef_No(int ref_No) {
		this.ref_No = ref_No;
	}
	public int getDate_From() {
		return date_From;
	}
	public void setDate_From(int date_From) {
		this.date_From = date_From;
	}
	public int getDate_To() {
		return date_To;
	}
	public void setDate_To(int date_To) {
		this.date_To = date_To;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getDateCerated() {
		return dateCerated;
	}
	public void setDateCerated(int dateCerated) {
		this.dateCerated = dateCerated;
	}
	@Override
	public String toString() {
		return "PayRoll [id=" + id + ", ref_No=" + ref_No + ", date_From=" + date_From + ", date_To=" + date_To
				+ ", type=" + type + ", status=" + status + ", dateCerated=" + dateCerated + "]";
	}
	
	
	
	
	
}
