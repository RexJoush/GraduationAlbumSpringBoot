package com.nwu.service.impl;

import com.nwu.service.NumberService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @author Rex Joush
 * @time 2021.06.26 14:23
 */
@Service
public class NumberServiceImpl implements NumberService {

    @Value("${bullet.numbers}")
    public String[] numbers;

    @Override
    public Set<String> getCheckNumbers() {
        return Set.of(this.numbers);
    }
}
