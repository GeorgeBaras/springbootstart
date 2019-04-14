package demo.services;

import demo.persistence.User;

public interface UserService {

    User saveUser(User user);

    User retrieveUserByUsername(String username);
}
