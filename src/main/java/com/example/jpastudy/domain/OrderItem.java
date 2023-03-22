package com.example.jpastudy.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

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

	private Integer orderPrice;

	private Integer count;
}
