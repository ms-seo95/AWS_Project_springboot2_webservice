package springboot.web.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

// myBatis의 DAO와 같은 접근자
// Entity 클래스와 Repository 클래스는 함께 움직여야 한다.
public interface PostsRepository extends JpaRepository<Posts, Long> {

}
