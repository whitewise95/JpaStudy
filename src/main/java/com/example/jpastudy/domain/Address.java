package com.example.jpastudy.domain;

import javax.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable  //TODO 공부하기
@Getter
@Setter
public class Address {

	private String city;
	private String zipcode;
	private String street;
}
