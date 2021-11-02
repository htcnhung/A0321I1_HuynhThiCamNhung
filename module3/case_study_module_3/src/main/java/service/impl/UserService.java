package service.impl;

import bean.User;

import java.util.List;

public interface UserService {
    public User selectUserByName(String name);
    public List<User> getAllUser();
    public void addUser(String user);
    public boolean deleteUser(String userName);
}
