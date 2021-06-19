package com.nwu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nwu.entities.Reward;
import com.nwu.mapper.RewardMapper;
import com.nwu.service.RewardService;
import org.springframework.stereotype.Service;

/**
 * @author Rex Joush
 * @time 2021.06.18 12:59
 */

@Service
public class RewardServiceImpl extends ServiceImpl<RewardMapper, Reward> implements RewardService {
}
