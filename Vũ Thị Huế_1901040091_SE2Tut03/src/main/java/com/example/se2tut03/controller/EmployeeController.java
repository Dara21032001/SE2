package com.example.se2tut03.controller;

import com.example.se2tut03.model.Employee;
import com.example.se2tut03.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
public class EmployeeController {
    @Autowired
    EmployeeRepository employeeRepository;

//get allList
    @RequestMapping("/")
    public String employeeList(Model model){
        //get data
        List<Employee> employeeList = employeeRepository.findAll();
        //send data
        model.addAttribute("employees",employeeList);
        //render view
        return "employeeList";
    }

    //get Employee detail
    @RequestMapping("/{id}")
    public String findEmployeeById(
            @PathVariable(value = "id") Long id, Model model){
        Employee employee = employeeRepository.getById(id);
        model.addAttribute("employee",employee);
        return "employeeDetail";
    }
    //delete employee
    @RequestMapping("/delete/{id}")
    public String deleteEmployeeById(
            @PathVariable(value="id") Long id, Model model){
        employeeRepository.deleteById(id);
        return "redirect:/";
    }
    //add Employee
    @RequestMapping("/addEmployee")
    public String addEmployee(Model model) {
        model.addAttribute("employee",new Employee());
        return "addEmployee" ;
    }
    @PostMapping("/saveEmployee")
    public String save(Employee employee){
        employeeRepository.save(employee);

        return "redirect:/";
    }
    //show edit form
    @GetMapping("/edit/{id}")
    public String showEdit(@PathVariable(value = "id") long id, Model model) {
       Employee employee = employeeRepository.getById(id);
        model.addAttribute("employee",employee);
        return "editEmployee";
    }
    @PostMapping("/update/{id}")
    public String updateUser(@PathVariable(value = "id") long id, Employee employee, Model model) {

        employeeRepository.save(employee);
        return "redirect:/";
    }


}
