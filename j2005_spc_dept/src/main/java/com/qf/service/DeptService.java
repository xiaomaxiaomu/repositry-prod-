package com.qf.service;

import com.qf.po.Dept;

import java.util.List;

public interface DeptService {
//    查询全部部门信息的业务接口
    public List<Dept> findAll();
}
