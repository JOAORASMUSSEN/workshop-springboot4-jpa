package br.com.joaorasmussen.course.repositories;

import br.com.joaorasmussen.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
