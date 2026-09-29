package com.employee.management.api.service;

import com.employee.management.api.dto.EmployeeRequestDto;
import com.employee.management.api.dto.EmployeeResponseDto;
import org.springframework.data.domain.Page;

import java.util.List;

public interface EmployeeService {

    EmployeeResponseDto createEmployee(EmployeeRequestDto request);

    List<EmployeeResponseDto> getAllEmployees();

    EmployeeResponseDto getEmployeeById(Long id);

    EmployeeResponseDto updateEmployee(Long id, EmployeeRequestDto request);

    void deleteEmployee(Long id);

    List<EmployeeResponseDto> searchByDepartment(String department);

    List<EmployeeResponseDto> searchByName(String name);

    Page<EmployeeResponseDto> findByMinimumSalary(
            Double salary,
            int page,
            int size,
            String sortBy,
            String direction
    );
}