package com.example.se2tut06_2.controller;


import com.example.se2tut06_2.entity.Employee;
import com.example.se2tut06_2.repository.CompanyRepository;
import com.example.se2tut06_2.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@RestController
public class EmployeeController {
        @Autowired
        CompanyRepository companyRepository;
        @Autowired
        EmployeeRepository employeeRepository;

        @GetMapping("/employee/list")
        public List<Employee> getEmployee() {
            return employeeRepository.findAll();
        }

        @GetMapping("/employee/{id}")
        public Employee getEmployeeById(
                @PathVariable(value = "id") Long id) {
            return employeeRepository.findById(id).get();

        }

        @PostMapping("/employee/add")
        public Employee addEmployee(@Valid @RequestBody Employee employee) {

            return employeeRepository.save(employee);
        }

        @PutMapping("/employee/{id}")
        public void updateEmployee(
                @PathVariable(value = "id") Long id, @Valid @RequestBody Employee employee) {
            if (employeeRepository.existsById(id)) {
                employee.setId(id);
                employeeRepository.save(employee);
            }
        }

        @DeleteMapping("/employee/{id}")
        public void deleteEmployee(
                @PathVariable(value = "id") Long id
        ) {
            if (employeeRepository.existsById(id)) {
                Employee employee = employeeRepository.getById(id);
                employeeRepository.delete(employee);
            }
        }

    }

