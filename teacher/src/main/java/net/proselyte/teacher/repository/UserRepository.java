package net.proselyte.teacher.repository;

import net.proselyte.teacher.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User,Long> {

}
