package com.org.employee.services;

import java.util.List;

import com.org.employee.models.Employee;
import com.org.employee.repositories.EmployeeRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * EmployeeService, this is the implimentation class for
 * IEmployeeService(Interface).
 */
@Service
public class EmployeeService {

    private Logger logger = LoggerFactory.getLogger(EmployeeService.class);

    @Autowired
    EmployeeRepository empRepo;

    public List<Employee> getAllEmployees() {
        return empRepo.findAll();
    }

    public Employee getOneEmployeeById(int id) {
        return empRepo.getOne(id);
    }

    public Employee saveEmployee(Employee emp) {
        Employee employee = new Employee();
        employee.setId(emp.getId());
        employee.setFullName(emp.getFullName());
        employee.setSalary(emp.getSalary());
        employee.setEmpCode(emp.getEmpCode());

        logger.info("\nSaving EMP: " + employee);

        return empRepo.save(employee);
    }

    public Employee getOneEmployeeByEmpCode(String empCode) {
        return empRepo.findOneByEmpCode(empCode);
    }

    public boolean existsById(int id) {
        return empRepo.existsById(id);
    }
}