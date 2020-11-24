package com.qf.service.impl;

import com.qf.mapper.DeptMapper;
import com.qf.po.Dept;
import com.qf.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired(required = false)
    private DeptMapper deptMapper;
    /**
     * 查询全部业务接口实现层
     * @return
     */
    @Override
    public List<Dept> findAll() {
        return deptMapper.findAll();
    }
}
