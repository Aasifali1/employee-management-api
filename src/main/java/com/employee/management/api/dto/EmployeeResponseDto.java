package com.employee.management.api.dto;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeResponseDto {

    private Long id;

    private String name;

    private String email;

    private String department;

    private Double salary;

    private int age;
}