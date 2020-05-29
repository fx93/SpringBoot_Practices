package com.fx.DBrelations.service;

import com.fx.DBrelations.model.Employee;
import com.fx.DBrelations.repository.RelationsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private RelationsRepo relationsRepo;

    public Employee addEmployee(Employee employee){
        return relationsRepo.save(employee);
    }

    public Employee getEmployee(String empId){
        return relationsRepo.findById(empId).get();
    }
}
