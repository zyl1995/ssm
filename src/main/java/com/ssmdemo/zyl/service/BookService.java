package com.ssmdemo.zyl.service;

import com.ssmdemo.zyl.entity.Book;

import java.util.List;

public interface BookService {
    List<Book> queryList(int start, int size);
}
