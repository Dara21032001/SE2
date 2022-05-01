package com.example.se2tut06_2.controller;

import com.example.se2tut06_2.entity.Company;
import com.example.se2tut06_2.repository.CompanyRepository;
import com.example.se2tut06_2.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
public class CompanyController {
    @Autowired
    CompanyRepository companyRepository;
    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping("/company/list")
    public List<Company> getAllCompany() {
        return companyRepository.findAll();
    }

    @GetMapping("/company/{id}")
    public Company getCompanyById(
            @PathVariable(value="id") Long id){
        return  companyRepository.findById(id).get();

    }
    @PostMapping("/company/add")
    public Company addCompany(@Valid @RequestBody Company company){

        return  companyRepository.save(company);
    }
    @PutMapping("/company/{id}")
    public void updateCompany(
            @PathVariable(value = "id") Long id, @Valid @RequestBody Company company){
        if(companyRepository.existsById(id)){
            company.setId(id);
            companyRepository.save(company);
        }
    }
    @DeleteMapping("/company/{id}")
    public void deleteCompany(
            @PathVariable(value = "id") Long id
    ) {
        if (companyRepository.existsById(id)) {
            Company company = companyRepository.getById(id);
            companyRepository.delete(company);
        }
    }

}
