package com.nwu.mapper;

import org.apache.ibatis.annotations.Mapper;

/**
 * @author Rex Joush
 * @time 2021.06.26 19:47
 */

/**
 * 计算图书借阅所超越的人数
 */
@Mapper
public interface BookExceedMapper {

    int getRank(String number);

    int getTotal();

}
