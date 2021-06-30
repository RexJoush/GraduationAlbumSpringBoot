package com.nwu;

import com.nwu.service.GraduateUserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class GraduationAlbumSpringBootApplicationTests {

    @Resource
    private GraduateUserService graduateUserService;
    @Test
    void contextLoads() {

        System.out.println();
    }

}
