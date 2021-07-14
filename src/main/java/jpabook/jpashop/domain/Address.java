package jpabook.jpashop.domain;

import lombok.Getter;

import javax.persistence.Embeddable;

@Embeddable // 여러 개의 데이터를 하나로 표현하기 위함 -> 즉 주소에 대한 데이터중 "도시", "거리", "우편번호"에 대한 정보를 하나로 묶어줌
// 내가 이해한 바로는 c계열 언어에서 Struct 같은 느낌임
@Getter
public class Address {

    private String city;

    private String street;

    private String zipcode; // 우편번호

    protected Address () {

    }

    public Address(String city, String street, String zipcode) {
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }
}
