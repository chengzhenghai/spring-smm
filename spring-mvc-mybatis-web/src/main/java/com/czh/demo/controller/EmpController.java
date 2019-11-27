package com.czh.demo.controller;

import com.czh.demo.entity.Employee;
import com.czh.demo.service.EmployeeService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@Controller
public class EmpController {

    @Autowired
    public EmployeeService employeeService;

    @RequestMapping("/list")
    public String list(@RequestParam(value = "pageNum", required = false, defaultValue = "1") int pageNum,
                       @RequestParam(value = "pageSize", required = false, defaultValue = "3") int pageSize, Model model) {

        List<Employee> employees = employeeService.getAll(pageNum, pageSize);
        PageInfo pageInfo = new PageInfo(employees);
        model.addAttribute("list", pageInfo);
        return "/employee/list";

    }

    @GetMapping("/add")
    public String empAdd() {
        return "/employee/add";
    }

    @PostMapping("/add")
    public String empAdd(@Valid Employee employee, BindingResult bindingResult) {
        ModelAndView mav = new ModelAndView();
        if(bindingResult.hasErrors()) {
            List<FieldError> errors = bindingResult.getFieldErrors();
            for (FieldError error : errors) {
                mav.addObject(error.getField(), error.getDefaultMessage());
            }
            return "/employee/add";
        }else {
            employeeService.empAdd(employee);
            return "redirect:/list";
        }
    }

}
