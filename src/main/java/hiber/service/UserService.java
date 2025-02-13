package hiber.service;

import hiber.model.User;

import java.util.List;

public interface UserService {
    void add(User user);
    List<User> listUsers();
    public List<User> getUsersListByCarModelSeries(String model, int series);
    public User getUserByCarModelSeries(String model, int series);
}
