package com.qf.mapper;

import com.qf.po.Dept;

import java.util.List;

public interface DeptMapper {
    /**
     * 查询全部业务接口实现层
     * @return
     */
    List<Dept> findAll();
}
