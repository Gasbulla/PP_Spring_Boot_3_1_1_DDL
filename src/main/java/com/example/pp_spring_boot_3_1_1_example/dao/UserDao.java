package com.example.pp_spring_boot_3_1_1_example.dao;


import com.example.pp_spring_boot_3_1_1_example.model.User;

import java.util.List;

public interface UserDao {
    List<User> index();
    User show(Long id);
    void save(User user);
    void update(User updatedUser);
    void deleteById(Long id);
}
