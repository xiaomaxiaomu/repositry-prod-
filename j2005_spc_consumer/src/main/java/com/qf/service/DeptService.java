package com.qf.service;

import com.qf.vo.ActionResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "dept-producerservice")
public interface DeptService {
    @RequestMapping("/depts")
    public ActionResult showDeptView();
}
