package com.example.jpastudy;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MemberRepositoryTest {

	@Autowired
	MemberRepository memberRepository;


	@Test
	@Transactional
	@Rollback(value = false)
	public void testMember() {
		//givem
		Member member = new Member();
		member.setUsername("memberA");

		//when
		Long memberId = memberRepository.save(member);
		Member findMember = memberRepository.find(memberId);

		//then
		Assertions.assertThat(findMember.getId()).isEqualTo(member.getId());
		Assertions.assertThat(findMember.getUsername()).isEqualTo(member.getUsername());
	}
}