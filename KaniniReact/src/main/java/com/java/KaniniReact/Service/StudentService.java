package com.java.KaniniReact.Service;

import com.java.KaniniReact.Entity.StudentDetails;
import com.java.KaniniReact.Repo.DepartmentRepo;
import com.java.KaniniReact.Repo.StudentsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    public StudentsRepo studentsrepo;
    public DepartmentRepo departmentRepo;

    public List<Details> GetAllStudents() {
        return studentsrepo.findAllStudents();
    }
    public StudentDetails createStudent(StudentDetails studentDetails) {

        return studentsrepo.save(studentDetails);
    }
    public StudentDetails updateStudent( StudentDetails studentDetails ,int studentId ){
        Optional<StudentDetails> existStudentDetails=Optional.ofNullable(studentsrepo.findById(studentId)).orElse(null);
        studentDetails.setStudentID(studentId);
        return studentsrepo.save(studentDetails);
    }
    public void deleteStudent(int studentId){
        StudentDetails studentDetails=studentsrepo.findById(studentId).orElse(null);
        studentsrepo.delete(studentDetails);
    }
}




