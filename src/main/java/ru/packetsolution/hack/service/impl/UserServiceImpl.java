package ru.packetsolution.hack.service.impl;

import com.sun.xml.bind.v2.TODO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.packetsolution.hack.domain.User;
import ru.packetsolution.hack.repository.UserRepository;
import ru.packetsolution.hack.service.UserService;
import ru.packetsolution.hack.service.UserServiceTest;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository repository;
    private UserServiceTest test;
    @Override
    public User add(User user) {
        // TODO посмотреть что не так с этими методами
        /*if (repository.findByPhoneNumber(user.getPhone()) != null) {
            throw new IllegalArgumentException("Number already exists");
        }
        if(!test.phoneNumIsStd(user.getPhone())){
            throw new IllegalArgumentException("Number isn't standard");
        }
        if(!test.emailIsStd(user.getEmail())){
            throw new IllegalArgumentException("Email isn't standard");
        }*/
        return repository.save(user);
    }

    @Override
    public List<User> getAll() {
        return repository.findAll();
    }

    @Override
    public User getById(long id) {
        User user = repository.findById(id).get();
        if(user != null){
            return user;
        } else{
            throw new IllegalArgumentException("User not found");
        }
    }

    @Override
    public User update(User user) {
        /*if (repository.findByPhoneNumber(user.getPhone()) != null) {
            throw new IllegalArgumentException("Number already exists");
        }

        if(!test.phoneNumIsStd(user.getPhone())){
            throw new IllegalArgumentException("Number isn't standard");
        }
        if(!test.emailIsStd(user.getEmail())){
            throw new IllegalArgumentException("Email isn't standard");
        }*/
        return repository.save(user);
    }

    @Override
    public void deleteById(long id) {
        repository.deleteById(id);
    }
}

