package az.company.springsecurity6jwt.repositories;

import az.company.springsecurity6jwt.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer>{

    Optional<User> findByEmail(String email);

}
