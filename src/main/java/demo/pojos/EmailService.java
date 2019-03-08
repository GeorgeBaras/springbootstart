package demo.pojos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

@Service
public class EmailService {

    @Qualifier("getJavaMailSender")
    @Autowired
    private JavaMailSender javaMailSender;

    public void sendEmail(String body) throws MessagingException {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom("georgebaras@gmail.com");
        simpleMailMessage.setTo("georgebaras@gmail.com");
        simpleMailMessage.setSubject("just a subject");
        simpleMailMessage.setText(body);
        javaMailSender.send(simpleMailMessage);
    }
}
