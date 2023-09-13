package me.dio.santanderbootcamp.repository;

import me.dio.santanderbootcamp.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
