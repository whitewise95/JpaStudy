package com.example.jpastudy.domain;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Member {

	@Id
	@GeneratedValue
	private Long id;

	private String username;

	@Embedded //TODO 공부하기
	private Address adress;

	@OneToMany(mappedBy = "member")
	private List<Order> orders = new ArrayList<>();
}
