package demo.services;

import demo.persistence.User;
import demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(@NotNull User user) {
        return this.userRepository.save(user);
    }

    @Override
    public User retrieveUserByUsername(@NotNull String username) {
        return this.userRepository.findByUsername(username);
    }
}
