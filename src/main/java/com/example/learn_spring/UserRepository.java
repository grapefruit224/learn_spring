package com.example.learn_spring;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository implements UserRepositoryInterface {

    @Override
    public void save(User user) {
        System.out.println("User saved");
    }

    @Override
    public void delete(User user) {
        System.out.println("User deleted");
    }
}