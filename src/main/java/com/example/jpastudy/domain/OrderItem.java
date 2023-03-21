package com.example.jpastudy.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
import org.aspectj.weaver.ast.Or;

@Getter
@Setter
@Entity
public class OrderItem {

	@Id
	@GeneratedValue
	private Long id;

	@ManyToOne
	private Item item;

	@ManyToOne
	@JoinColumn(name = "order_id")
	private Order order;
}
