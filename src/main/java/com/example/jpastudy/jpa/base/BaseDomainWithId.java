package com.example.jpastudy.jpa.base;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import lombok.Getter;

@Getter
@MappedSuperclass  //TODO 공부하기
public class BaseDomainWithId {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long id;
}
