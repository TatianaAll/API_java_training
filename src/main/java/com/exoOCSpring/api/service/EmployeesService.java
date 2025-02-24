package com.exoOCSpring.api.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.exoOCSpring.api.model.Employees;
import com.exoOCSpring.api.repository.EmployeesRepository;

import lombok.Data;

@Data
@Service //specialisation of Component = it's a bean with speciality
public class EmployeesService {

    @Autowired
    private EmployeesRepository employeesRepository;

    public Optional<Employees> getEmployee(final Long id) {
        return employeesRepository.findById(id);
    }

    public Iterable<Employees> getEmployees() {
        return employeesRepository.findAll();
    }

    public void deleteEmployee(final Long id) {
        employeesRepository.deleteById(id);
    }

    public Employees saveEmployees(Employees employee) {
        Employees savedEmployee = employeesRepository.save(employee);
        return savedEmployee;
    }
    
}
