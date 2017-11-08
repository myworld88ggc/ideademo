package com.will.service.impl;

import com.will.dao.UserMapper;
import com.will.pojo.User;
import com.will.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by gao.guangcai on 2017-10-27.
 */
@Service("userService")
public class UserServiceImpl implements IUserService {

    @Resource
    private UserMapper userDao;

    public User getUserById(int userId) {
        return this.userDao.selectByPrimaryKey(userId);
    }

    public int insert(User  user){
        return this.userDao.insert(user);
    }

}