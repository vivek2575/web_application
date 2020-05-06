package com.vivek.Service;


import com.vivek.Persistence.model.User;
import com.vivek.Web.dto.UserDto;

public interface UserService {
    User findUserByEmail(String email);

    void createUserAccount(UserDto user);
}
