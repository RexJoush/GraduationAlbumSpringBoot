package com.nwu.entities.page;

/**
 * @author Rex Joush
 * @time 2021.06.09 09:51
 */

import com.nwu.entities.Reward;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 第 11 页
 */
@Data
public class Page11 implements Serializable {

    private String educationalSystem;       // 学制，两年，三年，四年等
    private List<Reward> rewards;           // 获得的奖项

}
