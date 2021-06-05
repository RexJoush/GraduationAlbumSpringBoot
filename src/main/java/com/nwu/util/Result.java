package com.nwu.util;

import com.alibaba.fastjson.JSON;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Rex Joush
 * @time 2021.06.05 16:06
 */

/**
 * 请求结果的封装类，用于格式化返回结果
 */
public class Result {

    /**
     * 请求成功的接口，仅返回提示信息
     * @param message 提示信息
     * @return 结果集合
     */
    public static String ok(String message){
        Map<String, Object> result = new HashMap<>();
        result.put("code", 1200);
        result.put("message", message);
        return JSON.toJSONString(result);
    }

    /**
     * 请求成功的接口，返回数据和提示信息
     * @param message 提示信息
     * @param data 携带的数据
     * @return 结果集合
     */
    public static String ok(String message, Object data){
        Map<String, Object> result = new HashMap<>();
        result.put("code", 1200);
        result.put("message", message);
        result.put("data", data);
        return JSON.toJSONString(result);
    }

    /**
     * 请求失败的接口，返回失败信息
     * @param message 失败信息
     * @return 结果集合
     */
    public static String error(String message) {
        Map<String, Object> result = new HashMap<>();
        result.put("code", 1400);
        result.put("message", message);
        return JSON.toJSONString(result);
    }
}
