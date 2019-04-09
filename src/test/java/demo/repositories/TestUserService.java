package demo.repositories;

import demo.persistence.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class TestUserService {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testRepository(){
        User user = new User("George",30);
        userRepository.save(user);
        User retrievedUser = userRepository.findByName("George");
    }

}
