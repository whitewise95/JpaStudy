package com.example.jpastudy.domain;

import javax.persistence.Embeddable;
import lombok.Getter;

@Embeddable  //TODO 공부하기
@Getter
public class Address {

	private String city;
	private String zipcode;
	private String street;

	protected Address() {
	}

	public Address(String city, String zipcode, String street) {
		this.city = city;
		this.zipcode = zipcode;
		this.street = street;
	}
}
