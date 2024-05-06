package com.quantumflo.Webapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthService {

    public boolean authenticate(String username, String password) {
    String regex = ".*\\d.*";
        boolean isValidUserName = !username.matches(regex);
        boolean isValidPassword = password.matches(regex);

        return isValidUserName && isValidPassword;
    }
}