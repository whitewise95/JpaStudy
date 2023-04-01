package com.example.jpastudy.domain;

import com.example.jpastudy.jpa.base.BaseDomainWithId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 주문 상품
 */
@Getter
@Setter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
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


	//TODO 엔티티가 비즈니스 로직을 가지고 객체 지향의 특성을 적극 활용하는 것을 도메인 모델 패턴(http://martinfowler.com/eaaCatalog/domainModel.html)이라 한다.
	// TODO 엔티티에는 비즈니스 로직이 거의 없고 서비스 계층에서 대부분의 비즈니스 로직을 처리하는 것을 트랜잭션 스크립트 패턴(http://martinfowler.com/eaaCatalog/transactionScript.html)이라 한다
	// region 생성 메소드
	public static OrderItem createOrderItem(Item item, int orderPrice, int count) {
		OrderItem orderItem = new OrderItem();
		orderItem.setOrderPrice(orderPrice);
		orderItem.setItem(item);
		orderItem.setCount(count);

		item.removeStock(count);
		return orderItem;
	}
	// endregion

	// region 비지니스 로직
	public void cancel() {
		getItem().addStock(count);
	}
	// endregion
}
