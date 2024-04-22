package tech.joaovitor.backend;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import tech.joaovitor.backend.model.User;
import tech.joaovitor.backend.repository.UserRepository;

@SpringBootApplication
public class BackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

	@Bean
	CommandLineRunner initDataBase(UserRepository userRepository, PasswordEncoder passwordEncoder) {
		return args -> {
			userRepository.deleteAll();

			User user = new User();
			user.setName("John");
			user.setEmail("john@email.com");
			user.setPassword(passwordEncoder.encode("123"));

			userRepository.save(user);
		};
	}
}
