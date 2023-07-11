package com.java.KaniniReact.Service;

import com.java.KaniniReact.Entity.Department;
import com.java.KaniniReact.Repo.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService {

    @Autowired
    DepartmentRepo departmentrepo ;

    public List<Department> getAllDepartment() {
       return departmentrepo.findAll();
    }

    public Department createDepartment(Department department){
         return departmentrepo.save(department);
    }

    public Department updateDepartment(Department department, int departmentId){
        Optional<Department> existDepartment = Optional.ofNullable(departmentrepo.findById(departmentId).orElse(null));
        department.setDepartmentId(departmentId);
      return  departmentrepo.save(department);
    }

    public void DeleteDepartment(int departmentId){
        Department department=departmentrepo.findById(departmentId).orElse(null);
        departmentrepo.delete(department);
    }
}
