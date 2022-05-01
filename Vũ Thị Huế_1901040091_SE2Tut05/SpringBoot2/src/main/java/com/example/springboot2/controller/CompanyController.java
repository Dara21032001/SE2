package com.example.springboot2.controller;

import com.example.springboot2.model.Employee;
import com.example.springboot2.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/company")
public class CompanyController {
    @Autowired
    CompanyRepository companyRepository;
    @Autowired
    EmployeeRepository employeeRepository;

    @RequestMapping(value = "/{id}")
    public String getCompanyById(
            @PathVariable(value = "id") Long id, Model model
    ) {
        Company company = companyRepository.getById(id);
        List<Employee> employees = employeeRepository.findAll();
        model.addAttribute("employees", employees);
        model.addAttribute("company", company);
        return "companyDetail";
    }
}