package com.ssmdemo.zyl.dao;

import base.BaseTestCase;
import com.ssmdemo.zyl.entity.Book;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BookDaoTest extends BaseTestCase {

    @Autowired
    private BookDao bookDao;

    @Test
    public void queryBy() {
        long bookId = 1000;
        Book book = bookDao.queryById(bookId);
        System.out.println(book);
    }

    @Test
    public void queryList() {
        List <Book> books = bookDao.queryList(0, 3);
        for (Book book : books) {
            System.out.println(book);
        }
    }

    @Test
    public void reduceNumber() {
        int update = bookDao.reduceNumber(1000);
        System.out.println("update=" + update);
    }
}
