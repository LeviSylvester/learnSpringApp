package learnSpringApp.service;

import dto.UserRegistrationDTO;
import learnSpringApp.model.LocalUser;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

public interface UserService extends UserDetailsService {

    LocalUser findByEmail(String email);

    LocalUser save(UserRegistrationDTO userDTO);
}
