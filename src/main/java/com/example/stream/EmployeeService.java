package com.example.stream;

import java.util.Collection;

public interface EmployeeService {

    Employee addEmploee(String name, String lastName, String patronomic, int departament, int salary);
    void removeEmploee(String name, String lastName);
    Employee foundEmployee(String name, String lastName);
    Collection<Employee> findAll();

}
