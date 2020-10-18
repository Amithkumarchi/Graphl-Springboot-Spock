package com.springboot.graphql.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/books")
@RestController
public class Controller
{

    @PostMapping
    public void getAllBooks(@RequestBody String query)
    {

    }



}
