package study.querydsl4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import study.querydsl4.entity.Member;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long>, MemberRepositoryCustom, QuerydslPredicateExecutor {
//QuerydslPredicateExecutor 는 join 의 한계도 있고 컨트롤러에서 구현해야하기 때문에 너무 종속적이여서 실무에서는 추천하지 않는다고 함.
    List<Member> findByUsername(String username);
}
