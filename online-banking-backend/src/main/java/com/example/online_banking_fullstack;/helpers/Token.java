package com.example.online_banking_fullstack.helpers;

import java.util.UUID;

public class Token {
    public static String generateToken(){
        String token = UUID.randomUUID().toString();
        return token;
    }
}
