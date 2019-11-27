package com.czh.demo.service.impl;

import com.czh.demo.dao.EmployeeDao;
import com.czh.demo.entity.Employee;
import com.czh.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    public EmployeeDao dao;

    @Override
    public List<Employee> getAll(int pageNum, int pageSize) {
        return dao.getAll(pageNum,pageSize);
    }

    @Override
    public void empAdd(Employee employee) {
        dao.empAdd(employee);
    }

}
