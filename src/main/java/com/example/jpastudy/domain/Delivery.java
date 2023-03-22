package com.example.jpastudy.domain;

import com.example.jpastudy.domain.enums.DeliveryStatus;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Delivery {

	@Id
	@GeneratedValue
	private Long id;

	@OneToOne(mappedBy = "delivery")
	private Order order;

	@Embedded
	private Address address;

	@Enumerated(EnumType.STRING)
	private DeliveryStatus status;

}
