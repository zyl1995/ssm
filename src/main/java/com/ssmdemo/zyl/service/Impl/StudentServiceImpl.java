package com.ssmdemo.zyl.service.Impl;

import com.ssmdemo.zyl.dao.StudentDao;
import com.ssmdemo.zyl.entity.Student;
import com.ssmdemo.zyl.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    public Student login(String email, String password) {
        return studentDao.login(email, password);
    }

    public void register(Student student) {
        studentDao.register(student);
    }
}
