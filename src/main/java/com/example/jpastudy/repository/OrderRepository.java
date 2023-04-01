package com.example.jpastudy.repository;

import com.example.jpastudy.domain.Order;
import javax.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class OrderRepository {

	private final EntityManager em;

	public void save(Order order) {
		em.persist(order);
	}

	public Order findById(Long id) {
		return em.find(Order.class, id);
	}

	// public List<Order> findAll() {
	//
	// }
}
