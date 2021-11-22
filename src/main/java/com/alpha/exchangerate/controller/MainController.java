package com.alpha.exchangerate.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/course")
@RestController
public class MainController {

    @GetMapping
    public List<String > getSomething() {
        List<String> list = List.of("First", "Second", "Threeth");
        return list;
    }
}
