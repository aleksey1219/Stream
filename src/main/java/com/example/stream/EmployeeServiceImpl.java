package com.example.stream;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class EmployeeServiceImpl implements EmployeeService {
private List<Employee> employees;

    public EmployeeServiceImpl() {
        this.employees = new ArrayList<>();
    }

    @Override
    public Employee maxDepartment(int department) {
        Optional<Employee> maxSalary = employees.stream()
                .filter(employee -> employee.getDepartment().equals(department))
                        .max(Comparator.comparingInt(employee -> employee.getSalary()));
        return maxSalary.orElse(null);
    }
}
