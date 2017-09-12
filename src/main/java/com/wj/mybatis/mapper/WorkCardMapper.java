package com.wj.mybatis.mapper;

import com.wj.mybatis.pojo.WorkCard;

public interface WorkCardMapper {
    WorkCard getWorkCardByEmpId(Long id);
}
