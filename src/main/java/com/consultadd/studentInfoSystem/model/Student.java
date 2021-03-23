package com.consultadd.studentInfoSystem.model;

import com.sun.istack.NotNull;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long studentId;
    @Column(name = "student_name")
    private String name;
    @Column(name = "student_dob")
    @Basic
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    @Temporal(TemporalType.DATE)
    private Date dob;
    @Column(unique = true)
    @NotNull
    private String email;

    private long mobileNum;
    @Column(name = "student_gender")
    private String gender;

    private String department;
    @Embedded
    @OneToOne(mappedBy = "student" , cascade = CascadeType.ALL)
    private Address address;
 //   @OneToMany(mappedBy = "student", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @Embedded
    @OneToMany(mappedBy = "student", fetch = FetchType.LAZY, cascade = CascadeType.ALL)

    private List<Course> courseList = new ArrayList<Course>();
}
