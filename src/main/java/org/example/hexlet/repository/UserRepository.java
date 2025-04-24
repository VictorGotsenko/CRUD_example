package org.example.hexlet.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.example.hexlet.model.User;

public class UserRepository {
    private static List<User> entitiesUsers = new ArrayList<User>();

    public static void save(User user) {
        user.setId((long) entitiesUsers.size() + 1);
        entitiesUsers.add(user);
    }

    public static Optional<User> find(Long id) {
        var maybeUser = entitiesUsers.stream()
                .filter(entity -> entity.getId() == id)
                .findAny();
        return maybeUser;
    }

    public static void delete(Long id) {
        entitiesUsers.removeIf(user -> user.getId() == id);
    }

    public static void removeAll() {

        entitiesUsers = new ArrayList<User>();
    }

    public static List<User> getEntities() {
        return entitiesUsers;
    }
}