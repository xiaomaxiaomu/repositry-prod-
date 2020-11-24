package com.qf.controller;

import com.qf.service.DeptService;
import com.qf.vo.ActionResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;
    @RequestMapping("/depts")
    public ActionResult showDept(){
        ActionResult result = deptService.showDeptView();
        return result;
    }
}
