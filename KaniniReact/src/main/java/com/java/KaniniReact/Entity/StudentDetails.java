package com.java.KaniniReact.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "student")
public class StudentDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "mySeqGen")
    @SequenceGenerator(name = "mySeqGen", sequenceName = "mySeq", initialValue = 11, allocationSize = 1)
    @Column(name = "Student_ID")
    private int studentID;
    @Column(name = "student_name")
    private String studentName;
    @Column(name = "course")
    private String course;
    @Column(name = "specialization")
    private String specialization;
    @Column(name = "percentage")
    private String Percentage;
    @Column(name = "department_Id")
    private int departmentId;
}
