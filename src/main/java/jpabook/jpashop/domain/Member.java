package jpabook.jpashop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Member {

    @Id @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    private String name;

    @Embedded // JPA 내장타입
    private Address address;

    // 하나의 멤버가 여러개의 order를 가짐 - 일대다 관계
    @OneToMany(mappedBy = "member") // Order 테이블에 있는 member 필드에 의해서 매핑 된것이다.
    private List<Order> orders = new ArrayList<>();
}
