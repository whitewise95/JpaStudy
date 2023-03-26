package com.example.jpastudy.jpa.base;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;

@Getter
public class BaseDomainWithId {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long id;
}
