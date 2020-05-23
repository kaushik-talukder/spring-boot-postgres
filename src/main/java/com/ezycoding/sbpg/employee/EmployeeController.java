package com.ezycoding.sbpg.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository repo;

    @RequestMapping(value = "employees")
    public ResponseEntity<Object> getAll(){
        List<Employee> employees = repo.findAll();
        return ResponseEntity.ok(employees);
    }
}
