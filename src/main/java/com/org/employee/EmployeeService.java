package com.org.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * EmployeeService, this is the implimentation class for
 * IEmployeeService(Interface).
 */
public class EmployeeService implements IEmployeeService {

    @Autowired
    EmployeeRepository empRepo;

    @Autowired
    Employee employee;

    @Override
    public List<Employee> getAllEmployees() {
        return empRepo.findAll();
    }

    @Override
    public Employee getOneEmployeeById(int id) {
        return empRepo.getOne(id);
    }

    // implimentation of saving an employee
    @Override
    public Employee saveEmployee(Employee emp) {
        employee.setId(emp.getId());
        employee.setName(emp.getName());
        employee.setSalary(emp.getSalary());
        employee.setEmployeeCode(emp.getEmployeeCode());
        return empRepo.save(employee);
    }

    @Override
    public Employee getOneEmployeeByEmployeeCode(String empCode) {
        return empRepo.findOneByEmployeeCode(empCode);
    }

    @Override
    public boolean existsById(int id) {
        return empRepo.existsById(id);
    }
}