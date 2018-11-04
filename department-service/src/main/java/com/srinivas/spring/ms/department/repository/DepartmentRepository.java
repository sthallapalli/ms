package com.srinivas.spring.ms.department.repository;

import com.srinivas.spring.ms.department.model.Department;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface DepartmentRepository extends ReactiveCrudRepository<Department, Long> {

}
