package tech.joaovitor.backend.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import tech.joaovitor.backend.model.User;
import tech.joaovitor.backend.repository.UserRepository;

@Service
public class AuthService  {
    private final UserRepository userRepository;

    public AuthService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Optional<User> findUserByEmail(String email)  {
        return userRepository.findByEmail(email);
    }
    
}
