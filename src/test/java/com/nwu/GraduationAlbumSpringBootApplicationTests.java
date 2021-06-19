package com.nwu;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.nwu.entities.Reward;
import com.nwu.service.RewardService;
import com.nwu.service.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class GraduationAlbumSpringBootApplicationTests {

    @Resource
    private StudentService studentService;

    @Resource
    private RewardService rewardService;

    @Test
    void contextLoads() {
        QueryWrapper<Reward> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("number", "202032978");
        List<Reward> list = rewardService.list(queryWrapper);
        System.out.println(list);
    }

}
