package demo.repositories;

import demo.persistence.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.List;

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
        User user2 = new User("John",30);
        userRepository.save(user2);
        User retrievedUser = userRepository.findByName("George");
        List<User> users = userRepository.findAllByAge(30);
        Assert.assertEquals("Not all users were retrieved",2, users.size());
    }

}
