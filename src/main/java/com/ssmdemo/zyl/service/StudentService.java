package com.ssmdemo.zyl.service;

import com.ssmdemo.zyl.entity.Student;

public interface StudentService {
    Student login(String email, String password);

    void register(Student student);
}
