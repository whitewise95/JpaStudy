package com.example.jpastudy.repository;

import com.example.jpastudy.domain.Member;
import com.sun.xml.bind.v2.TODO;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberRepository {

	@PersistenceContext
	private EntityManager em; //TODO @Autowired 로도 가능 하지만 스프링부트가 지원해주기 때문에

	public void save(Member member) {
		em.persist(member);
	}

	public Member findOne(Long id) {
		return em.find(Member.class, id);
	}

	public List<Member> findAll() {
		return em.createQuery("SELECT m FROM Member m ", Member.class)
				 .getResultList();
	}

	public Member findByName(String name) {
		return em.createQuery("SELECT m FROM Member m WHERE m.name = :name", Member.class)
				 .setParameter("name", name)
				 .getSingleResult();
	}
}
