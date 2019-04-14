package demo.services;

import demo.persistence.User;
import org.junit.Assert;
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

    private final String TESTNAME = "TESTNAME";
    private final String TESTPASS = "TESTPASS";

    @Autowired
    private UserService userService;

    @Test
    public void testSaveAndRetrieveUserByUsername(){
        User user = new User();
        user.setUsername(TESTNAME);
        user.setPassword(TESTPASS);
        userService.saveUser(user);
        User retrievedUser = userService.retrieveUserByUsername(TESTNAME);
        Assert.assertEquals("User was not retrieved", TESTNAME, retrievedUser.getUsername());
        Assert.assertEquals("User was not retrieved", TESTNAME, retrievedUser.getUsername());
    }

}
