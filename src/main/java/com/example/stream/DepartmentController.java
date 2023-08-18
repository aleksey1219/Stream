package com.example.stream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/departments")
public class DepartmentController  {
    private DepartmentService service;

    public DepartmentController(DepartmentService service) {
        this.service = service;
    }

    @GetMapping("/max-salary")
    public double maxSalary(@RequestParam int departId) {
        return service.maxSalary(departId);
    }
    @GetMapping("/min-salary")
    public double minSalary(@RequestParam int departId) {
        return service.minSalary(departId);
    }
    @GetMapping("/full")
    public Map<Integer, List<Employee>> groupByDept() {
        return service.groupByDept();
    }
    @GetMapping("/ful")
    public List<Employee> findAllByDept(@RequestParam int departId) {
        return service.findAllByDept(departId);
    }
}
