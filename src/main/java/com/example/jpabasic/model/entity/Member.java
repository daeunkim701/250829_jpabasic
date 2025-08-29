package com.example.jpabasic.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

// 일단 초반에는 @Entity랑 @Data만 달아서 사용해도 ㄱㅊ대
@Entity // 얘를 감지해서 테이브링 있는지 체크하고 객체와 연결하게 해주는 애너테이션
//@Getter // .get~
//@Setter // .set~
//@ToString // sout -> 구성요소
//@NoArgsConstructor // 기본 생성자
//@RequiredArgsConstructor // final로 되어있는 것들을 만들어주는 생성자 entity용 아님
//@AllArgsConstructor // 모든 프로퍼티
@Data // 위에 있는 애들 다 불러올 수 있는 것. @Getter, @Setter, @RequiredArgsConstuctor, @ToString, @EqualsAndHashCode
@NoArgsConstructor // new Member() 가 필요할 때
@AllArgsConstructor // new Member(...필드들을 직접 만들어서 넣을 때)
// 생성자는 뭔가 직접 정의를 하면 기본 생성자는 비활성화된다 -> 직접 추가해줘야 함
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // 헷갈리면 알아서 해주세요
    // IDENTITY - SEQUENCE => 결과적인 작동형태가 같음
    // @GeneratedValue(strategy = GenerationType.IDENTITY) - 교안에는 이걸로 (가장 많이 쓰는 타입)
    // @GeneratedValue(strategy = GenerationType.SEQUENCE) - sequence라는 걸 별도로 만들어서 그걸 추적하게 하는 것
    // @GeneratedValue(strategy = GenerationType.UUID) - 가장 많이 쓰는 타입
    private Long id;
    private String name;
}
