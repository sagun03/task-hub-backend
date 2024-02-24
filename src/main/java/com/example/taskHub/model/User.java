package com.example.taskHub.model;
//import javax.persistence.*; 
//package com.example.demo.entity;

import jakarta.persistence.Column;

//import jakarta.persistence.*;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
//import jakarta.persistence.Table;

@Entity 
@Table(name = "user")
public class User {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id")
  private Integer custID;
@Column(name = "cust_name")
  private String custName;
@Column(name = "cust_email")
  private String custEmail;
@Column(name = "cust_password")
  private String custPassword;
public Integer getCustID() {
	return custID;
}
public void setCustID(Integer custID) {
	this.custID = custID;
}
public String getCustName() {
	return custName;
}
public void setCustName(String custName) {
	this.custName = custName;
}
public String getCustEmail() {
	return custEmail;
}
public void setCustEmail(String custEmail) {
	this.custEmail = custEmail;
}
public String getCustPassword() {
	return custPassword;
}
public void setCustPassword(String custPassword) {
	this.custPassword = custPassword;
}

}