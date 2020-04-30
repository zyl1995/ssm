package com.ssmdemo.zyl.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexPageController {

    @RequestMapping("/")
    private String indexPage() {
        return "index";
    }
}
