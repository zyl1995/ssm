package com.ssmdemo.zyl.service.Impl;

import com.ssmdemo.zyl.dao.BookDao;
import com.ssmdemo.zyl.entity.Book;
import com.ssmdemo.zyl.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    public List<Book> queryList(int start, int size) {
        return bookDao.queryList(start, size);
    }
}
