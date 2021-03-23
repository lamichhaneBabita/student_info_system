package com.consultadd.studentInfoSystem.controller;

import com.consultadd.studentInfoSystem.Repos.StudentRepos;
import com.consultadd.studentInfoSystem.ResourceNotFound;
import com.consultadd.studentInfoSystem.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")

public class studentControl {
    @Autowired
    StudentRepos studentRepos;

    @GetMapping("")
    String getStudent(Model model){
        model.addAttribute("student", studentRepos.findAll());
        return "list";
    }

    @GetMapping("/signup")
    String signup(Student student){
        return "addStudent";
    }
    @PostMapping("/add")
    String addStudent(Student student, Model model, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "addStudent";
        }
        studentRepos.save(student);
        return "redirect:/";
    }

    @GetMapping("edit/{id}")
    String edit(@PathVariable(value ="id")Long id, Model model) throws ResourceNotFound{
        Student student = studentRepos.findById(id).orElseThrow(()->new ResourceNotFound("Not Found",id,"Not Found"));
        model.addAttribute("student", student);
        return "updateStudent";
    }
    @PostMapping("/update")
    String update (@PathVariable (value = "id")Long id, Student student, BindingResult bindingResult, Model model)throws ResourceNotFound{
        if(bindingResult.hasErrors()){
            return "updateStudent";
        }
        Student updated = studentRepos.findById(id).orElseThrow(()->new ResourceNotFound("Not Found",id,"Not Found"));
        updated.setStudentId(student.getStudentId());
        updated.setName(student.getName());
        updated.setDob(student.getDob());
        updated.setEmail(student.getEmail());
        updated.setMobileNum(student.getMobileNum());
        updated.setGender(student.getGender());
        updated.setDepartment(student.getDepartment());
        model.addAttribute("student", studentRepos.findAll());
        return "redirect:/";

    }

    @GetMapping("/delete/{id}")
    String delete(@PathVariable(value ="id")Long id, Model model) throws ResourceNotFound{
        Student updated = studentRepos.findById(id).orElseThrow(()->new ResourceNotFound("Not Found",id,"Not Found"));
        studentRepos.delete(updated);
        model.addAttribute("student", studentRepos.findAll());
        return "redirect:/";
    }
}
