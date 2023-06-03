package com.ty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Pan {
     @Id
     @GeneratedValue
	 private int id;
	 private long pannumber;
     private String address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getPannumber() {
		return pannumber;
	}
	public void setPannumber(long pannumber) {
		this.pannumber = pannumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
     
}
