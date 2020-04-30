package com.ssmdemo.zyl.web;

import com.ssmdemo.zyl.entity.Book;
import com.ssmdemo.zyl.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping(value = "/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping(method = RequestMethod.GET)
    private String bookListPage(
            @RequestParam(value = "start", defaultValue = "0") int start,
            @RequestParam(value = "size", defaultValue = "4") int size,
            Model model) {
        List<Book> bookList = bookService.queryList(start, size);
        model.addAttribute(bookList);
        return "books";
    }
}
