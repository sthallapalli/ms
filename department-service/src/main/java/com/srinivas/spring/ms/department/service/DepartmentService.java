package com.srinivas.spring.ms.department.service;

import com.srinivas.spring.ms.department.model.Department;
import com.srinivas.spring.ms.department.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Mono<Department> create(Department department) {
        return this.departmentRepository.save(department);
    }

    public Flux<Department> getAll() {
        return this.departmentRepository.findAll();
    }

    public Mono<Department> get(Long id) {
       return this.departmentRepository.findById(id);
    }

    public Mono<Void> delete(Long id) {
        return this.departmentRepository.deleteById(id);
    }

}
