# 실전! 스프링 부트와 JPA 활용1 - 웹 애플리케이션 개발
## 목적
- JPA 기술을 더 잘 활용하고 싶어서 또는 내가 기술이 잘 사용하고 있는게 맞는지 체크하고 싶어서

## 스펙
- java 11
- spring boot 2.7.0
- h2
- thymeleaf
- JUnit4

## 어플리케이션 간단한 소개
### 기능 목록
- 회원 기능
> 회원 등록  
> 회원 조회     

- 상품 기능
> 상품 등록  
> 상품 수정  
> 상품 조회    

- 주문 기능
> 상품 주문  
> 주문 내역 조회  
> 주문 취소    

- 기타 요구사항
> 상품은 재고 관리가 필요하다.   
> 상품의 종류는 도서, 음반, 영화가 있다.  
> 상품을 카테고리로 구분할 수 있다.  
> 상품 주문시 배송 정보를 입력할 수 있다  


## 계층형 구조 사용
- controller, web: 웹 계층
- service: 비즈니스 로직, 트랜잭션 처리
- repository: JPA를 직접 사용하는 계층, 엔티티 매니저 사용
- domain: 엔티티가 모여 있는 계층, 모든 계층에서 사용


## 패키지 구조
- com.example.jpastudy
  - domain
  - exception
  - repository
  - service
  - web

## 개발 순서
- 서비스, 리포지토리 계층을 개발하고, 테스트 케이스를 작성해서 검증, 마지막에 웹 계층 적용