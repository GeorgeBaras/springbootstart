package demo.services;

import demo.controllers.HomeController;
import demo.persistence.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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
public class TestEmailService {

    @Autowired
    private EmailService emailService;

    @Test
    public void testSendEmail(){
        boolean emailSent = emailService.sendEmail("sender@me.com","test@me.com","subject","sample body");
        Assert.assertTrue("Email was not successfully sent", emailSent);
    }

}
