package com.nwu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nwu.entities.User;
import com.nwu.mapper.UserMapper;
import com.nwu.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author Rex Joush
 * @time 2021.06.05 16:00
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService{
}
