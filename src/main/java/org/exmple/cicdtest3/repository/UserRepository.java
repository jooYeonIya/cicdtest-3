package org.exmple.cicdtest3.repository;

import org.exmple.cicdtest3.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
