package com.java.KaniniReact.Config;

public class AppConstant {
    public static final String Find_All_Students ="select s.Student_ID, s.student_name, s.course, s.specialization, s.percentage,d.department_Id, d.department_name from student s join department d where s.department_Id = d.department_Id";
}
