package com.fx.DBrelations.service;

import com.fx.DBrelations.model.Employee;

public interface EmployeeService {

    Employee addEmployee(Employee employee);
    Employee getEmployee(String empId);

}
