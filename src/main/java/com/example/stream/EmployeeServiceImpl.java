package com.example.stream;

import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;
import java.util.Collection;
import java.util.*;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    public final Map<String, Employee> employess;

    public EmployeeServiceImpl() {
        this.employess = new HashMap<>();
    }

@Override
    public Employee addEmploee(String name, String lastName, String patronomic, int departament, int salary) {
    Employee employee = new Employee(name, lastName, patronomic, departament, salary);
        String key = name + lastName;
        if ( employess.containsKey(key)) {
            throw new RuntimeException();
        } else {
            employess.put(key, employee);
        }
    return employee;
}
@Override
    public void removeEmploee(String name, String lastName) {
        String key = name + " " + lastName;
        if (employess.containsKey(key)) {
            employess.remove(key);
            System.out.println("Сотрудник удален: " + key);
        } else {
            System.out.println("Сотрудник не найден" + key);
        }
    }
@Override
    public Employee foundEmployee(String name, String lastName) {
        String key = name + " " + lastName;
        return employess.get(key);
    }

@Override
    public Collection<Employee> findAll() {
        return Collections.unmodifiableCollection(employess.values());
    }

    Employee employee = new Employee("asffasc", "fasca", "vasc", 1, 51261);
    Employee employe = new Employee("uyyviu", "fasca", "vasc", 1, 21516);
    }


