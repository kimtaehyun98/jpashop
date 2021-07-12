package jpabook.jpashop;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity // 이 클래스를 DB의 테이블에 매핑한다고 JPA에게 알려주는 Annotation이다.
@Getter @Setter // Lombok library를 사용 -> 실제 Getter, Setter 메소드를 코드로 구현하지 않았지만 사용 가능
public class Member {

    @Id @GeneratedValue
    // @Id = Entity 클래스(Member class)의 필드를 테이블의 기본 키(Primary key)에 매핑 (식별자 필드)
    // -> 즉 "DB의 ID라는 key가 기본 키가 되기 때문"에 DB에서 해당 엔티티를 조회하고 싶으면 ID를 사용하여야 한다.
    // @GeneratedValue = 기본 키 생성을 DB에서 자동으로 하게 위임
    // -> 즉 자동으로 DB에 ID, USERNAME이란 key가 생성된다
    private Long id;
    private String username;
}
