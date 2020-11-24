package com.qf.controller;

import com.qf.po.Dept;
import com.qf.service.DeptService;
import com.qf.vo.ActionResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;
    @RequestMapping("/depts")
    public ActionResult showDeptView(){
        List<Dept> deptList = deptService.findAll();
        return new ActionResult(200,"",deptList);
    }
}
