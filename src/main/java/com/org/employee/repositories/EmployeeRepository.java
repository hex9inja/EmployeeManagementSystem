package com.org.employee.repositories;

import com.org.employee.models.Employee;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * EmployeeRepository
 */
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    Employee findOneByEmpCode(String empCode);

}