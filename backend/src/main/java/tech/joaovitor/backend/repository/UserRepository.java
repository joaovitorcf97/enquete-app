package tech.joaovitor.backend.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import tech.joaovitor.backend.model.User;

public interface UserRepository extends JpaRepository<User, String> {
    Optional<User> findByEmail(String email);
}
