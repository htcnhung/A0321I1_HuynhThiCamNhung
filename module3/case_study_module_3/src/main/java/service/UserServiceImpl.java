package service;

import bean.User;
import repository.UserRepository;
import service.impl.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    @Override
    public User selectUserByName(String name) {
        return new UserRepository().selectUserByName(name);
    }

    @Override
    public List<User> getAllUser() {
        return new UserRepository().getAllUser();
    }

    @Override
    public void addUser(String user) {
        new UserRepository().addUser(user);
    }

    @Override
    public boolean deleteUser(String userName) {
        return new UserRepository().deleteUser(userName);
    }
}
