package com.ittraining.studentmanagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ittraining.studentmanagement.entities.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
    Department findByDepartmentName(String departmentName);

}
