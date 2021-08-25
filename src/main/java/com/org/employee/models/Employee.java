package com.org.employee.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

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

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "salary")
    private int salary;

    @Column(name = "employee_code")
    private String empCode;

    @Column(name = "doj")
    private Date doj;

    @Column(name = "status")
    private String status; // ACTIVE, IN_ACTIVE

    @CreatedDate
    private Date createdAt;

    @UpdateTimestamp
    private Date updatedAt;

}