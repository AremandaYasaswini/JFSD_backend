package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender mailSender;

    public void sendSignupEmail(String toEmail) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(toEmail);
        message.setSubject("Welcome to Harvest Haven!");
        message.setText(
                "Dear Valued Customer,\n\n" +
                "We are thrilled to welcome you to the Harvest Haven family! 🌱\n\n" +
                "Thank you for signing up with us. You are now part of a community that cares about fresh, sustainable, and healthy food. We can’t wait for you to explore our wide range of products grown with love and care, just for you.\n\n" +
                "At Harvest Haven, we believe in the power of nature to bring nourishment and joy. We’re here to support your healthy lifestyle by offering farm-fresh produce, organic items, and handmade goods that are sure to delight your senses.\n\n" +
                "We’re excited to have you on this journey with us, and we look forward to serving you with the best nature has to offer.\n\n" +
                "Warm regards,\n" +
                "The Harvest Haven Team 🌾\n\n" +
                "P.S. Visit our website to discover more and stay tuned for exciting updates!\n\n" 
        );
        message.setFrom("harvesthaven@gmail.com");

        mailSender.send(message);
    }
    public void sendLoginNotification(String toEmail) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(toEmail);
        message.setSubject("Login Notification");
        message.setText(
            "Hello there,\n\n" +
            "We’re happy to inform you that you’ve successfully logged into your Harvest Haven account! 🌿\n\n" +
            "Your trust and support mean the world to us, and we’re excited to have you as part of our community. If you need any assistance or have any questions, we’re here for you every step of the way. Your healthy lifestyle journey with Harvest Haven is just beginning!\n\n" +
            "If you didn’t initiate this login, please reach out to us immediately so we can ensure your account remains secure.\n\n" +
            "Thank you for choosing Harvest Haven! We’re here to support you.\n\n" +
            "Warm regards,\n" +
            "The Harvest Haven Team 🌾\n\n" +
            "P.S. Don’t forget to check out the latest updates and products we have in store just for you!"
        );
        message.setFrom("harvesthaven@gmail.com");

        mailSender.send(message);
    }

}
