package com.example.demo.controller;

import com.example.demo.dao.model.Resident;
import com.example.demo.service.ResidentService;
import com.mysql.cj.util.StringUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@Api(value = "/residents", tags="测试接口")
@RestController
public class ResidentController {
    @Autowired
    ResidentService residentService;

    @ApiOperation(value = "展示首页信息", notes = "展示首页信息")
    @GetMapping("")
    public List<Resident> all(){
        return residentService.selectAll();
    }

    @ApiOperation(value = "插入新的住户", notes = "插入新的住户")
    @PostMapping("")
    public void insert(@RequestBody Resident resident){
        if(StringUtils.isNullOrEmpty(resident.getResidentId())){
            resident.setResidentId(UUID.randomUUID().toString());
        }

        residentService.insert(resident);
    }
}
