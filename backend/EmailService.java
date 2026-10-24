package com.srimeenakshi.construction.service;

import com.srimeenakshi.construction.entity.Contact;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    private static final Logger log =
            LoggerFactory.getLogger(EmailService.class);

    private final JavaMailSender mailSender;

    public EmailService(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    public void sendContactEmail(Contact contact) {

        SimpleMailMessage message = new SimpleMailMessage();

        message.setTo("thulasidharanmoorthy42@gmail.com");

        message.setSubject("New Contact Enquiry - Sri Meenakshi Construction");

        message.setText(
                "New contact enquiry received.\n\n" +
                "Name: " + contact.getName() + "\n" +
                "Email: " + contact.getEmail() + "\n" +
                "Phone: " + contact.getPhone() + "\n" +
                "Message: " + contact.getMessage()
        );

        // The contact is already saved in the database at this point,
        // so a mail failure must not turn the request into an HTTP 500.
        try {
            mailSender.send(message);
        } catch (Exception ex) {
            log.warn("Contact saved, but notification email could not be sent: {}",
                    ex.getMessage());
        }
    }
}