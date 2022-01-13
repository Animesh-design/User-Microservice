package com.user.services;

import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class userServiceImpl implements userService{

    List<User> list = List.of(
            new User(1311L, "Animesh Kr Singh", "9023822"),
            new User(1312L, "AKshat Chordia", "6879846"),
            new User(1313L, "Dewansh Mehta", "4687887")
    );
    @Override
    public User getUser(long id) {

        for( User user: list){
            if(user.getUserId() == id)
                return user;
        }

        return null;
    }
}
