package com.example.se2tut04.controller;


import com.example.se2tut04.model.Employee;
import com.example.se2tut04.object.EmployeeDTO;
import com.example.se2tut04.repository.EmployeeRepository;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@Controller
public class EmployeeController {
    @Autowired
    EmployeeRepository employeeRepository;

//get allList
    @RequestMapping("/employeeList")
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
    public String save(  Employee employee, BindingResult result) {
        if (result.hasErrors()) {
            return "addEmployee";
        } else {
            employeeRepository.save(employee);

            return "redirect:/";
        }
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
    @GetMapping("/registration")
    public String registration( @ModelAttribute EmployeeDTO employeeDTO, Model model){
        model.addAttribute("employeeDTO", employeeDTO);

        return "registration";
    }
    @PostMapping("/registration")
    public String saveRegistration(EmployeeDTO employeeDTO){

        return "redirect:/";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }


}
