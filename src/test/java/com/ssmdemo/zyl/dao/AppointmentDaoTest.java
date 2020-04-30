package com.ssmdemo.zyl.dao;

import base.BaseTestCase;
import com.ssmdemo.zyl.entity.Appointment;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class AppointmentDaoTest extends BaseTestCase {

    @Autowired
    private AppointmentDao appointmentDao;

    @Test
    public void insertAppointment() {
        Appointment appointment = new Appointment(1000, 1);
        int insert = appointmentDao.insertAppointment(appointment);
        System.out.println("insert=" + insert);
    }

    @Test
    public void queryByKeyWithBook() {
        Appointment appointment = appointmentDao.queryByKeyWithBook(1000, 1);
        System.out.println("Appointment=" + appointment);
        System.out.println("Appointment Book=" + appointment.getBook());
    }

    @Test
    public void cancelAppointment() {
        int delete = appointmentDao.cancelAppointment(1000, 1);
        System.out.println("delete=" + delete);
    }
}