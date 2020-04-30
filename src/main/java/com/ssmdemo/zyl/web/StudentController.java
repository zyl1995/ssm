package com.ssmdemo.zyl.web;

import com.ssmdemo.zyl.entity.Student;
import com.ssmdemo.zyl.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    private String registerPage() {
        return "register";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    private String doRegister(
            @RequestParam("name") String name,
            @RequestParam("email") String email,
            @RequestParam("password") String password,
            HttpSession session) {
        Student student = new Student(name, email, password);
        studentService.register(student);
        if (student != null && student.getStudentId() > 0) {
            session.setAttribute("student", student);
            return "redirect:/book";
        }
        return "register";
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    private String doLogOut(HttpSession session) {
        session.removeAttribute("student");
        return "redirect:/";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    private String loginPage() {
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    private String doLogin(
            @RequestParam("email") String email,
            @RequestParam("password") String password,
            HttpSession session) {
        Student student = studentService.login(email, password);
        if (student != null && student.getStudentId() > 0) {
            session.setAttribute("student", student);
            return "redirect:/book";
        }
        return "login";
    }
}
