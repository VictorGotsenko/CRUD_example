package org.example.hexlet.dto.users;


import java.util.List;

import org.example.hexlet.model.User;

public class UsersPage {
    public List<User> users;

    public UsersPage(List<User> users) {
        this.users = users;
    }

    public List<User> getUsers() {
        return users;
    }

}

