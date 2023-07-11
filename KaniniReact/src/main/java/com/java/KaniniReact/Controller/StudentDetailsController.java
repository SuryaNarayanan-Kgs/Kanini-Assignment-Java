package com.java.KaniniReact.Controller;

import com.java.KaniniReact.Entity.StudentDetails;
import com.java.KaniniReact.Service.Details;
import com.java.KaniniReact.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentDetailsController {

    @Autowired
    public StudentService studentService;

    @GetMapping("/GetAllStudents")
    public List<Details> StudentsDetails(){
        return studentService.GetAllStudents();
    }
    @PostMapping("/CreateStudent")
    public StudentDetails CreateStudents(@RequestBody StudentDetails studentDetails){
        return studentService.createStudent(studentDetails);
    }
    @PutMapping("/updateStudent/{studentID}")
    public StudentDetails updateStudentDetails(@RequestBody StudentDetails studentDetails,@PathVariable int studentID ){
         return studentService.updateStudent(studentDetails,studentID);
    }
    @DeleteMapping("/deleteStudent/{studentID}")
    public void DeleteStudentsDetails(@PathVariable int studentID){
        studentService.deleteStudent(studentID);
    }
}
