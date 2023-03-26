package com.example.jpastudy.domain;

import com.example.jpastudy.jpa.base.BaseDomainWithId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

/**
 * 주문 상품
 */
@Getter
@Setter
@Entity
public class OrderItem extends BaseDomainWithId {

	/**
	 * 구매한 상품 정보
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	private Item item;

	/**
	 * 주문정보
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "order_id")
	private Order order;

	/**
	 * 주문 가격
	 */
	private Integer orderPrice;

	/**
	 * 주문 개수
	 */
	private Integer count;
}
