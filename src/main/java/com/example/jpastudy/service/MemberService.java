package com.example.jpastudy.service;

import com.example.jpastudy.domain.Member;
import com.example.jpastudy.repository.MemberRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class MemberService {

	private final MemberRepository memberRepository;

	/**
	 * 회원가입
	 */
	@Transactional
	public Long join(Member member) {
		validateDuplicateMember(member);
		memberRepository.save(member);
		return member.getId();
	}

	/**
	 *  회원 목록 조회
	 * */
	public List<Member> findAllMembers(){
		return memberRepository.findAll();
	}

	/**
	 * 회원 상세 조회
	 * */
	public Member findMember(Long id){
		return memberRepository.findOne(id);
	}

	/**
	 * 이름 중복 체크
	 */
	private void validateDuplicateMember(Member member) {
		Member findMember = memberRepository.findByName(member.getName());
		if(findMember == null){
			throw new IllegalArgumentException("이미 존재하는 회원 이름입니다.");
		}
	}
}
