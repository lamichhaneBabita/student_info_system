package com.consultadd.studentInfoSystem.Repos;

import com.consultadd.studentInfoSystem.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepos extends JpaRepository<Student, Long> {
    @Query(value = "SELECT * FROM student WHERE student_name LIKE 'r%' ", nativeQuery = true)
    List<Student> getQuery();

}
