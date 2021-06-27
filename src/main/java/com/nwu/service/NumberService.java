package com.nwu.service;

/**
 * @author Rex Joush
 * @time 2021.06.26 14:22
 */

import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * 获取审核人员的学号列表
 */
public interface NumberService {

    /**
     * 获取审核人员的学号集合, 学号配置项在 application.yml 中
     * @return 集合
     */
    Set<String> getCheckNumbers();

}
