package com.org.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * EmployeeController This is the route controller which will controll all the
 * routes for this application, else it will throw (404- Page Not Found)
 */

@RestController
@RequestMapping("/org")
public class EmployeeController {

    // autowired means It will look for the object of tha class/interface inside
    // Spring-boot container
    // hence we don't have to create the Object of any class for this
    @Autowired
    IEmployeeService empServ;

    // @GetMapping("/employee")
    // public List<Employee> getAll() {
    // return empServ.getAllEmployees();
    // }

    // this will work as /employee?id={id}
    @GetMapping("/employee")
    public Employee getEmployeeById(@RequestParam int id) {
        return empServ.getOneEmployeeById(id);
    }

    // this will work to search for employee by emp_code
    @GetMapping("/employee")
    public Employee getEmployeeByEmployeeCode(@RequestParam String empCode) {
        return empServ.getOneEmployeeByEmployeeCode(empCode);
    }

    // this will work as to save the Employee
    @PostMapping("/addEmployee")
    public Employee saveEmployee(Employee emp) {
        return empServ.saveEmployee(emp);
    }
}