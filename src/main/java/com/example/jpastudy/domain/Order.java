package com.example.jpastudy.domain;

import com.example.jpastudy.enums.OrderStatus;
import com.example.jpastudy.jpa.base.BaseDomainWithId;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 * 주문
 */
@Entity
@Getter
@Setter
@Table(name = "orders")
public class Order extends BaseDomainWithId {

	/**
	 * 구매 회원
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	private Member member;

	/**
	 * 구매 상품 목록
	 */
	@OneToMany(mappedBy = "order")
	private List<OrderItem> orderItems = new ArrayList<>();

	/**
	 * 배송정보
	 */
	@OneToOne(fetch = FetchType.LAZY)
	private Delivery delivery;

	/**
	 * 구매일
	 */
	private LocalDateTime orderDate;

	/**
	 * 상태
	 */
	@Enumerated(EnumType.STRING)
	private OrderStatus status;
}
