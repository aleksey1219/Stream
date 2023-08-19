package com.example.stream;

import org.apache.commons.lang3.StringUtils;

import java.util.Objects;

import static org.apache.commons.lang3.StringUtils.*;

public class Employee {
    private String name;
    private String surname;
    private String patronymic;
    private int id;
    private int department;
    private int salary;
    private static int idCounter;

    public Employee(String name, String surname, String patronymic, int department, int salary) {
        this.name = capitalize(name.toLowerCase());
        this.surname = capitalize(surname.toLowerCase());
        this.patronymic = patronymic;
        this.department = department;
        if (salary >= 0) {
            this.salary = salary;
        }
        id = idCounter++;
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getId() {
        return id;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setDepartment(int department) {
        if (department > 0 && department <= 5) {

            this.department = department;
        }
        throw new IllegalArgumentException("в компании всего пять отделов начиная с 1");
    }

    public void setSalary(int salary) {
        if (salary >= 0) {
            this.salary = salary;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && department == employee.department && salary == employee.salary && Objects.equals(name, employee.name) && Objects.equals(surname, employee.surname) && Objects.equals(patronymic, employee.patronymic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, patronymic, id, department, salary);
    }

    @Override
    public String toString() {
        return "Employee{" + " id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                '}';
    }
}
