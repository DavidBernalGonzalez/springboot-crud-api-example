package com.eco.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "CUSTOMERS")
@Getter
@Setter
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	Long id;
	@Column(name = "NAME")
	String name;
	@Column(name = "SURNAME")
	String surname;
	@Column(name = "BIRTDATE")
	String birtdate;
	@Column(name = "PHONE")
	String phone;
	@Column(name = "COUNTRY")
	String country;
	@Column(name = "CITY")
	String city;
	@Column(name = "DIRECTION")
	String direction;
	@Column(name = "POST_CODE")
	String postcode;
}
