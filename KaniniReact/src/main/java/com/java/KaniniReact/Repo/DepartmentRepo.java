package com.java.KaniniReact.Repo;

import com.java.KaniniReact.Entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepo extends JpaRepository<Department,Integer> {

}
