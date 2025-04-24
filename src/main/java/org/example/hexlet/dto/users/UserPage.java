package org.example.hexlet.dto.users;

import org.example.hexlet.model.User;

public class UserPage {
    public User user;

    public UserPage(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }
}