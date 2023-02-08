package com.demo.cassandra.controller;

import com.demo.cassandra.model.Employee;
import com.demo.cassandra.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public Flux<Employee> readAllEmployee(){
        return employeeService.getAllEmployee();
    }

    @GetMapping("/employee/{id}")
    public Mono<Employee> readEmployee(@PathVariable int id){
        return employeeService.getEmployee(id);
    }

    @PostMapping("/employee")
    public Mono<Employee> writeEmployee(@RequestBody Employee emp){
        return employeeService.saveEmployee(emp);
    }

}
