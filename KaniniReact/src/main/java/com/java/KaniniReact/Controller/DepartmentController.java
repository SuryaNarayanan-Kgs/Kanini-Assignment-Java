package com.java.KaniniReact.Controller;

import com.java.KaniniReact.Entity.Department;
import com.java.KaniniReact.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentservice;

    @GetMapping("/getDepartment")
    public List<Department> getDepartment() {
        return departmentservice.getAllDepartment();
    }

    @PutMapping("/updateDepartment/{departmentId}")
    public Department updateDepartment(@RequestBody Department department, @PathVariable int departmentId) {
        return departmentservice.updateDepartment(department, departmentId);
    }

    @PostMapping("/AddDepartment")
    public Department addDepartment(@RequestBody Department department) {
       return departmentservice.createDepartment(department);
    }
    @DeleteMapping("/deleteDepartment/{departmentId}")
    public void deleteDepartment(@PathVariable int departmentId){
        departmentservice.DeleteDepartment(departmentId);
    }
}
