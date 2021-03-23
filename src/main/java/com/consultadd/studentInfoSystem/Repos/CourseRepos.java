package com.consultadd.studentInfoSystem.Repos;

import com.consultadd.studentInfoSystem.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepos extends JpaRepository<Course, Long> {
}
