package com.example.jpastudy.domain;

import com.example.jpastudy.jpa.base.BaseDomainWithId;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Member extends BaseDomainWithId {

	/**
	 * 아이디
	 */
	private String username;

	/**
	 * 주소
	 */
	@Embedded
	private Address address;

	/**
	 * 구매목록
	 */
	@OneToMany(mappedBy = "member")
	private List<Order> orders = new ArrayList<>();
}
