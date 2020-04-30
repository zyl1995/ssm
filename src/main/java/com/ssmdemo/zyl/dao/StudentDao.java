package com.ssmdemo.zyl.dao;

import com.ssmdemo.zyl.entity.Student;
import org.apache.ibatis.annotations.Param;

public interface StudentDao {
    int register(Student student);

    Student login(@Param("email") String email, @Param("password") String password);
}
