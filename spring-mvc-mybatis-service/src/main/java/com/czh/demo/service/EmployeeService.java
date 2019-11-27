package com.czh.demo.service;

import com.czh.demo.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAll(int pageNum, int pageSize);

    void empAdd(Employee employee);
}
