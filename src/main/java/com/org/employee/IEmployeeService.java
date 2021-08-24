package com.org.employee;

import java.util.List;

import org.springframework.stereotype.Service;

/**
 * IEmployeeService
 * Declairing @Service for the this class will tell the spring Application where to look for the Application services.
 */
@Service
public interface IEmployeeService {

    // save an Employee to the DnB
    Employee saveEmployee(Employee emp);

    // fetch all employee available in the DB as List
    List<Employee> getAllEmployees();

    // get one employee by employee id if exist
    Employee getOneEmployeeById(int id);

    // get one employee by employee code if exist
    Employee getOneEmployeeByEmployeeCode(String empCode);

    // validate if the employee already exists.
    boolean existsById(int id);
}