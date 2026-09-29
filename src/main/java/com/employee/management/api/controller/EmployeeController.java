package com.employee.management.api.controller;

import com.employee.management.api.dto.EmployeeRequestDto;
import com.employee.management.api.dto.EmployeeResponseDto;
import com.employee.management.api.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    // CREATE
    @PostMapping
    public ResponseEntity<EmployeeResponseDto> createEmployee(
            @Valid @RequestBody EmployeeRequestDto request) {

        EmployeeResponseDto response =
                employeeService.createEmployee(request);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(response);
    }

    // GET ALL
    @GetMapping
    public ResponseEntity<List<EmployeeResponseDto>> getAllEmployees() {

        return ResponseEntity.ok(
                employeeService.getAllEmployees()
        );
    }

    // GET BY ID
    @GetMapping("/{id}")
    public ResponseEntity<EmployeeResponseDto> getEmployeeById(
            @PathVariable Long id) {

        return ResponseEntity.ok(
                employeeService.getEmployeeById(id)
        );
    }

    // UPDATE
    @PutMapping("/{id}")
    public ResponseEntity<EmployeeResponseDto> updateEmployee(
            @PathVariable Long id,
            @Valid @RequestBody EmployeeRequestDto request) {

        return ResponseEntity.ok(
                employeeService.updateEmployee(id, request)
        );
    }

    // DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmployee(
            @PathVariable Long id) {

        employeeService.deleteEmployee(id);

        return ResponseEntity.noContent().build();
    }

    // SEARCH BY DEPARTMENT
    @GetMapping("/search/department")
    public ResponseEntity<List<EmployeeResponseDto>> searchByDepartment(
            @RequestParam String department) {

        return ResponseEntity.ok(
                employeeService.searchByDepartment(department)
        );
    }

    // SEARCH BY NAME
    @GetMapping("/search/name")
    public ResponseEntity<List<EmployeeResponseDto>> searchByName(
            @RequestParam String name) {

        return ResponseEntity.ok(
                employeeService.searchByName(name)
        );
    }

    // PAGINATION + SORTING + CUSTOM QUERY
    @GetMapping("/search/salary")
    public ResponseEntity<Page<EmployeeResponseDto>> searchBySalary(
            @RequestParam Double salary,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "5") int size,
            @RequestParam(defaultValue = "salary") String sortBy,
            @RequestParam(defaultValue = "asc") String direction) {

        return ResponseEntity.ok(
                employeeService.findByMinimumSalary(
                        salary,
                        page,
                        size,
                        sortBy,
                        direction
                )
        );
    }
}
