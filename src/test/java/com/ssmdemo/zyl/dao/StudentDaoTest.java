package com.ssmdemo.zyl.dao;

import base.BaseTestCase;
import com.ssmdemo.zyl.entity.Student;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class StudentDaoTest extends BaseTestCase {
    @Autowired
    StudentDao studentDao;

    @Test
    public void register() {
        Student student = new Student("李四", "test@163.com", "123456");
        System.out.println(student);
        studentDao.register(student);
        System.out.println(student);
    }

    @Test
    public void login() {
        Student student = studentDao.login("test@163.com", "123456");
        System.out.println(student);
    }
}