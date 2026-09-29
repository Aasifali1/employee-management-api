package com.employee.management.api.repository;

import com.employee.management.api.entity.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    // Feature 1: Derived query
    List<Employee> findByDepartmentIgnoreCase(String department);

    // Feature 2: Another derived query
    List<Employee> findByNameContainingIgnoreCase(String name);

    // Feature 3: Custom JPQL query
    @Query("SELECT e FROM Employee e WHERE e.salary >= :salary")
    Page<Employee> findEmployeesWithMinimumSalary(
            @Param("salary") Double salary,
            Pageable pageable
    );
}
