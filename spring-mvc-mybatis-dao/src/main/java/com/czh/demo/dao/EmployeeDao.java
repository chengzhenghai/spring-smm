package com.czh.demo.dao;

import com.czh.demo.entity.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeDao {

    List<Employee> getAll(@Param("pageNum")int pageNum, @Param("pageSize")int pageSize);

    void empAdd(Employee employee);

}
