package jpabook.jpashop.repository;

import jpabook.jpashop.domain.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository // Component Scan을 통해 자동으로 Spring Bean으로 등록
@RequiredArgsConstructor // Memberservice에 관련 내용 적어놓음
public class MemberRepository {

    // @PersistenceContext // JPA의 EntityManager를 주입해줌
    // -> 원래는 사용해야 하는데 RequiredArgsConstructor Annotation 때문에 사용 안해도 됨
    private final EntityManager em;

    public void save(Member member){
        em.persist(member);
    }

    public Member findOne(Long id){
        return em.find(Member.class, id);
    }

    public List<Member> findAll(){
        return em.createQuery("select m from Member m", Member.class)
                .getResultList();
    }

    public List<Member> findByName(String name) {
        return em.createQuery("select m from Member m where m.name = :name", Member.class)
                .setParameter("name", name)
                .getResultList();
    }
}
