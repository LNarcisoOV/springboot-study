package com.spgbt.service;

import com.spgbt.model.Employee;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    public Employee create(Long employeeId){
        return new Employee(employeeId, "John Doe",33 ,"IT");
    }

}
