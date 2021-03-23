package com.consultadd.studentInfoSystem.model;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "user1")
public class User {
    @Id
    String userName;
    @NotNull
    String password;
}
