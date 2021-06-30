package com.nwu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nwu.entities.vo.ResultVo;
import com.nwu.mapper.ResultVoMapper;
import com.nwu.service.ResultVoService;
import org.springframework.stereotype.Service;

/**
 * @author Rex Joush
 * @time 2021.06.30 18:49
 */
@Service
public class ResultVoServiceImpl extends ServiceImpl<ResultVoMapper, ResultVo> implements ResultVoService {
}
