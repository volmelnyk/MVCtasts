package ua.com.owu.service;

import org.springframework.stereotype.Service;
import ua.com.owu.entity.User;

import java.util.List;

public interface UserService {

    public  void save(User user);
    public  void delete(int id);
    public  User findOne(int id);
    public List<User> findAll();

}
