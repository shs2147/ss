package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity

public class Allowances {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private int id;
	private String allowancesDescription;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAllowancesDescription() {
		return allowancesDescription;
	}
	public void setAllowancesDescription(String allowancesDescription) {
		this.allowancesDescription = allowancesDescription;
	}
	@Override
	public String toString() {
		return "Allowances [id=" + id + ", allowancesDescription=" + allowancesDescription + "]";
	}

	
	
}
