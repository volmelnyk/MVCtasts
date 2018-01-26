package ua.com.owu.service.impl;

import org.omg.CORBA.DATA_CONVERSION;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.owu.dao.UserDao;
import ua.com.owu.entity.User;
import ua.com.owu.service.UserService;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserServiceIml implements UserService {

    @Autowired
    UserDao dao;

    @Override
    public void save(User user) {
        dao.save(user);
    }

    @Override
    public void delete(int id) {
        dao.delete(id);
    }

    @Override
    public User findOne(int id) {
        return dao.findOne(id);
    }

    @Override
    public List<User> findAll() {
        return dao.findAll();
    }
}
