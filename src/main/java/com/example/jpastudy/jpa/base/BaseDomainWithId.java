package com.example.jpastudy.jpa.base;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import lombok.Getter;

@Getter
@MappedSuperclass  //TODO 공부하기
public class BaseDomainWithId {

	@Id
	@GeneratedValue
	protected Long id;
}
