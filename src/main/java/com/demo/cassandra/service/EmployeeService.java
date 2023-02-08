package com.demo.cassandra.service;

import com.demo.cassandra.model.Employee;
import com.demo.cassandra.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Flux<Employee> getAllEmployee(){
        return employeeRepository.findAll();
    }

    public Mono<Employee> getEmployee(int id){
        return employeeRepository.findById(id);
    }

    public Mono<Employee> saveEmployee(Employee emp){
        return employeeRepository.save(emp);
    }

}