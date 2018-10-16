package com.srinivas.spring.ms.department.controller;


import com.srinivas.spring.ms.department.model.Department;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public void create(@RequestBody Department department) {
        System.out.println("Creating an department" + department);
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Department get(@PathVariable("id") Long id) {

        System.out.println("Getting department" + id);

        Department dept = new Department();
        dept.setId(1L);
        dept.setName("Accounts");

        return dept;
    }

}
