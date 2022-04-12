package com.spgbt.controller;

import com.spgbt.model.Employee;
import com.spgbt.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/{employeeId}")
    public Employee create(@PathVariable Long employeeId){
        return employeeService.create(employeeId);
    }

}
