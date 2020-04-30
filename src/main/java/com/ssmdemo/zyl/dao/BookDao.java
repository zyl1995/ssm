package com.ssmdemo.zyl.dao;

import com.ssmdemo.zyl.entity.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookDao {

    Book queryById(long id);

    List<Book> queryList(@Param("start") int start, @Param("size") int size);

    int reduceNumber(long id);
}
