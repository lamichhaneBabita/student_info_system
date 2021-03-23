package com.consultadd.studentInfoSystem.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Embeddable
@Getter
@Setter
@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long courseId;

    @Column(name = "course_name")
    private String courseName;

    private long isbn;
    @ManyToOne
    @JoinColumn(name = "student_id", nullable = false )
    @JsonIgnore
    private Student student;

}
