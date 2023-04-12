package ru.packetsolution.hack.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.packetsolution.hack.domain.User;
import ru.packetsolution.hack.repository.UserRepository;
import ru.packetsolution.hack.service.UserService;
import ru.packetsolution.hack.service.UserServiceTest;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository repository;
    private UserServiceTest test;

    // TODO сделать проверку входящих данных
    @Override
    public User add(User user) {
        if (user.getPhone().matches("\\+7\\d{10}")) {
            throw new IllegalArgumentException("Number isn't standard");
        }
        return repository.save(user);
    }

    @Override
    public List<User> getAll() {
        return repository.findAll();
    }

    // TODO оценить проверку
    @Override
    public User getById(long id) {

        return repository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("User not found"));
    }

    // TODO сделать проверку входящих данных
    @Override
    public User update(User user) {
        return repository.save(user);
    }

    @Override
    public void deleteById(long id) {
        repository.deleteById(id);
    }
}


