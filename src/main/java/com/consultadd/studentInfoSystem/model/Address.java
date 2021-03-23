package com.consultadd.studentInfoSystem.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Embeddable
@Getter
@Setter
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long addressId;
    private String street;
    @Column(name = "city_name")
    private String city;
    private String state;
    private String country;
    @OneToOne
    @JoinColumn(name = "student_id")
    @JsonIgnore
    private Student student;
}
