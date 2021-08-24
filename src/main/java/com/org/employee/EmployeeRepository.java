package com.org.employee;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * EmployeeRepository
 */
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    Employee findOneByEmployeeCode(String empCode);
}