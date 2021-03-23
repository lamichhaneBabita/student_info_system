package com.consultadd.studentInfoSystem.RestController;

import com.consultadd.studentInfoSystem.Repos.StudentRepos;
import com.consultadd.studentInfoSystem.ResourceNotFound;
import com.consultadd.studentInfoSystem.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentRepos studentRepos;

    @GetMapping("/get")
    public List<Student> getStudentList() {

        return studentRepos.findAll();
    }

    @PostMapping("/post")
    public Student postStudentInfo(@RequestBody Student student){
        return studentRepos.save(student);
    }

    @PutMapping("/update/{id}")
    public Student updateStudent(@PathVariable(name = "id") Long id, @RequestBody Student student) throws ResourceNotFound {
        Student st = studentRepos.findById(id).orElseThrow(()->new ResourceNotFound("Not Found", id, "Not Found"));
        st.setName(student.getName());
        st.setDob(student.getDob());
        st.setEmail(student.getEmail());
        st.setMobileNum(student.getMobileNum());
        st.setGender(student.getGender());
        st.setDepartment(student.getDepartment());
        return studentRepos.save(st);
    }

    @DeleteMapping("/delete/{id}")
    ResponseEntity<?>delete(@PathVariable (value = "id")Long id)throws ResourceNotFound{
        Student student = studentRepos.findById(id).orElseThrow(()->new ResourceNotFound("Not Found",id,"Not Found"));
        studentRepos.delete(student);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/q")
    List<Student>getQ(){
        return  studentRepos.getQuery();
    }

}
