package com.exoOCSpring.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.exoOCSpring.api.model.Employees;
import com.exoOCSpring.api.service.EmployeesService;

@RestController //Like Component but specialized
public class EmployeesController {

    @Autowired
    private EmployeesService employeesService;

    @GetMapping("/employees")
    public Iterable<Employees> getEmployees() {
        return employeesService.getEmployees();
    }
    

}
