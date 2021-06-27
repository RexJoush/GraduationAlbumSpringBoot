package com.nwu.service.impl;

import com.nwu.mapper.BookExceedMapper;
import com.nwu.service.BookExceedService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Rex Joush
 * @time 2021.06.26 20:24
 */

@Service
public class BookExceedServiceImpl implements BookExceedService {

    @Resource
    private BookExceedMapper bookExceedMapper;

    @Override
    public int getRank(String number){
        int rank = 0;
        try {
            return bookExceedMapper.getRank(number);
        } catch (Exception e){
            return rank;
        }
    }

    @Override
    public int getTotal(){
        return bookExceedMapper.getTotal();
    }

    @Override
    public int getExceed(String number) {

        int rank = getRank(number);  // 在数据库中的排名
        int total = getTotal();      // 数据库总人数

        // 将此放前面是防止库中只有一条记录
        if (rank == 1){     // 排名第一
            return 100;
        }

        /*
            防止出现 /0 异常
            或者排名等于总记录数，即打败 0 人
         */
        if (total == 0 || rank == total){
            return 0;
        }

        // 计算排名
        return (total - rank) * 100 / total;
    }


}
