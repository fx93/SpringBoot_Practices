package com.fx.DBrelations.repository;

import com.fx.DBrelations.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RelationsRepo extends JpaRepository<Employee, String> {
}
