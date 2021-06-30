package com.nwu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nwu.entities.GraduateUser;
import com.nwu.mapper.GraduateUserMapper;
import com.nwu.service.GraduateUserService;
import org.springframework.stereotype.Service;

/**
 * @author Rex Joush
 * @time 2021.06.29 17:05
 */
@Service
public class GraduateUserImpl extends ServiceImpl<GraduateUserMapper, GraduateUser> implements GraduateUserService {
}
