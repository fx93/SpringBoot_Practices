package com.fx.DBrelations.controller;

import com.fx.DBrelations.model.Employee;
import com.fx.DBrelations.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController(value = "o2o")
public class OneToOneCtrlr {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "addEmp", method = RequestMethod.POST)
    public Employee addEmployee(@RequestBody Employee employee){
        return employeeService.addEmployee(employee);
    }

    @RequestMapping(value = "/employee/{id}", method = RequestMethod.GET)
    public Employee getEmployee(@PathVariable String id) {
            return employeeService.getEmployee(id);
    }

}
