package com.org.employee;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * Employee, This will be the entity class with Pojo facility.
 * 
 * @Entity will declair this class as an enity
 * @Table(name = "table_name") this will define the entity with the table name
 *             inside your database.
 * @Data using this only if the lombok library is added. We can use this to
 *       automatically include the getter and setter if needed.
 * 
 */

@Entity
@Table(name = "sb_emp")
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "salary")
    private int salary;

    @Column(name = "employee_code")
    private String employeeCode;
}