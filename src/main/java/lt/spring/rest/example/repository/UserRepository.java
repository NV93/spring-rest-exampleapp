package lt.spring.rest.example.repository;

import lt.spring.rest.example.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by nevyt on 10/4/2017.
 */

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
}
