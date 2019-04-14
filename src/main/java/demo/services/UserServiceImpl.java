package demo.services;

import demo.persistence.User;
import demo.repositories.UserRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;

@Service
public class UserServiceImpl implements UserService {
    private static final Logger logger = LogManager.getLogger(UserServiceImpl.class);


    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(@NotNull User user) {
        logger.info("User with username:" +user.getUsername()+" is being saved");
        return this.userRepository.save(user);
    }

    @Override
    public User retrieveUserByUsername(@NotNull String username) {
        return this.userRepository.findByUsername(username);
    }
}
