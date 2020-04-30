package com.ssmdemo.zyl.dao;

import com.ssmdemo.zyl.entity.Appointment;
import org.apache.ibatis.annotations.Param;

public interface AppointmentDao {
    int insertAppointment(Appointment appointment);

    Appointment queryByKeyWithBook(@Param("bookId") long bookId, @Param("studentId") long studentID);

    int cancelAppointment(@Param("bookId") long bookId, @Param("studentId") long studentID);
}
