package com.czh.demo.entity;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Date;

public class Employee {
    private Integer id;
    @Min(value = 0 ,message = "工资必须大于0")
    private BigDecimal salary;
    private Date hiredate;
    private String gender;
    @NotNull
    @Size(max = 10, min = 2, message = "员工姓名长度为2-10")
    private String username;
    private Integer deptid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", salary=" + salary +
                ", hiredate=" + hiredate +
                ", gender='" + gender + '\'' +
                ", username='" + username + '\'' +
                ", deptid=" + deptid +
                '}';
    }
}
