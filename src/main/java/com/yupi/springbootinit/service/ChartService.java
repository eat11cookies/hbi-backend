package com.yupi.springbootinit.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yupi.springbootinit.model.entity.Chart;

import java.util.List;

/**
* @author 惠普
* @description 针对表【chart(图表信息表)】的数据库操作Service
* @createDate 2023-06-27 21:29:27
*/
public interface ChartService extends IService<Chart> {
    List viewDataById(Long id);
}
