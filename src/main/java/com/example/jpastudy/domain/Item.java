package com.example.jpastudy.domain;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@DiscriminatorColumn(name = "dtype")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE) //TODO 공부하기
public abstract class Item {

	@Id
	@GeneratedValue
	private Long id;

	private String name;
	private Integer price;
	private Integer stockQuantity;
}
