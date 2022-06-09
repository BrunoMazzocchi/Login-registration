package com.example.demo.email;

import org.springframework.context.annotation.*;

public interface EmailSender {
    void send(String to, String email);
}