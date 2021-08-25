package com.org.employee.controllers;

import com.org.employee.models.Employee;
import com.org.employee.services.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

/**
 * EmployeeController This is the route controller which will controll all the
 * routes for this application, else it will throw (404- Page Not Found)
 */
@RestController
@RequestMapping("api/v1/emp")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    /**
     * Get Employee By Id
     * 
     * @param id
     * @return
     */
    @GetMapping("/employee_by_id")
    @ApiOperation(value = "Employee by id", response = String.class, produces = MediaType.APPLICATION_JSON_VALUE, tags = {
            "Emp API" })
    public Employee getEmployeeById(@RequestParam int id) {
        return employeeService.getOneEmployeeById(id);
    }

    /**
     * Get Employee By Code
     * 
     * @param empCode
     * @return
     */
    @GetMapping("/employee_by_code")
    @ApiOperation(value = "Employee by code", response = String.class, produces = MediaType.APPLICATION_JSON_VALUE, tags = {
            "Emp API" })
    public Employee getEmployeeByEmpCode(@RequestParam String empCode) {
        return employeeService.getOneEmployeeByEmpCode(empCode);
    }

    /**
     * Save new Employee info.
     * 
     * @param emp
     * @return
     */
    @PostMapping("/addEmployee")
    @ApiOperation(value = "On Add New Employee", response = String.class, produces = MediaType.APPLICATION_JSON_VALUE, tags = {
            "Emp API" })
    public Employee saveEmployee(Employee emp) {
        return employeeService.saveEmployee(emp);
    }
}