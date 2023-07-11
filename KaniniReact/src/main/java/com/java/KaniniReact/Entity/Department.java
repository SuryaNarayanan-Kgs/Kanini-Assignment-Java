package com.java.KaniniReact.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name="Department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "depSeq")
    @SequenceGenerator(name = "depSeq", sequenceName = "depSeq", initialValue = 1, allocationSize = 1)
    @Column(name = "department_Id")
    private int departmentId ;
    @Column(name = "department_name")
    private String departmentName;
}
