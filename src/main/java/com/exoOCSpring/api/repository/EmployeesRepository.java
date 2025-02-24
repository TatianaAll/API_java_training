package com.exoOCSpring.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.exoOCSpring.api.model.Employees;

@Repository //the class is a bean, and this role is to communique with the DataBase
public interface EmployeesRepository extends CrudRepository<Employees, Long> {

}
