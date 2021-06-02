package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.UserDAO;
import web.model.User;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserDAO userDAO;

    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }

    public void save(User user) {
        userDAO.save(user);
    }

    public User findByEmail(String email) {
        return userDAO.findByEmail(email);
    }

    public User findById(Long id) {
        return userDAO.findById(id);
    }
}
