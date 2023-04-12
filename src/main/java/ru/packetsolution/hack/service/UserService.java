package ru.packetsolution.hack.service;

import ru.packetsolution.hack.domain.User;

import java.util.List;

public interface UserService {
    // add user in DB
    User add(User user);

    // get all users from DB
    List<User> getAll();

    // get user's info from DB by id
    User getById(long id);

    // update info about user
    User update(User user);

    // delete user by id
    void deleteById(long id);
}
