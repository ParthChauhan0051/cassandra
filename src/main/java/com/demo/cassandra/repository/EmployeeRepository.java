package com.demo.cassandra.repository;

import com.demo.cassandra.model.Employee;
import org.springframework.data.cassandra.repository.ReactiveCassandraRepository;

public interface EmployeeRepository extends ReactiveCassandraRepository<Employee, Integer> {



}
