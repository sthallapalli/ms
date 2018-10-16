package com.srinivas.spring.ms.employee.controller;


import com.srinivas.spring.ms.employee.model.Employee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
@Slf4j
public class EmployeeController {

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public void create(@RequestBody Employee employee) {
        System.out.println("Creating an employee" + employee);
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Employee get(@PathVariable("id") Long id) {

        log.info("Request recieved to retrieve the employee with id [{}]", id);

        System.out.println("Getting employee" + id);

        Employee emp = new Employee();
        emp.setId(1L);
        emp.setFirstName("John");
        emp.setLastName("Papa");
        emp.setDeptId(2);

        log.info("Successfully returned employee details for id [{}]", id);
        return emp;
    }

}
