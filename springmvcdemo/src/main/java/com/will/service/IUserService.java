package com.will.service;

import com.will.pojo.User;

/**
 * Created by gao.guangcai on 2017-10-27.
 */
public interface IUserService {
    public User getUserById(int userId);

    public int insert(User  user);
}
