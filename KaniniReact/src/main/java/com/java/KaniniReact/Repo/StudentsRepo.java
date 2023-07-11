package com.java.KaniniReact.Repo;

import com.java.KaniniReact.Config.AppConstant;
import com.java.KaniniReact.Entity.StudentDetails;
import com.java.KaniniReact.Service.Details;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentsRepo extends JpaRepository<StudentDetails,Integer> {
@Query(value = AppConstant.Find_All_Students,nativeQuery = true)
List<Details> findAllStudents();
}
