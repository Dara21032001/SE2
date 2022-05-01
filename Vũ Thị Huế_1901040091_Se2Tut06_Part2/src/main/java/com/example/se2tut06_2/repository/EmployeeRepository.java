package com.example.se2tut06_2.repository;

import com.example.se2tut06_2.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository <Employee,Long>{
    List<Employee> findByNameContaining(String name);
}
