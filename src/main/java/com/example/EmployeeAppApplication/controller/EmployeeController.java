package com.example.EmployeeAppApplication.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class EmployeeController {


    @GetMapping("/add")
    public String Addemployee()
    {
        return "welcome to add employee page";
    }
    @GetMapping("/search")
    public String Searchemployee()
    {
        return "welcome to search employee";
    }
    @GetMapping("/edit")
    public String Editemployee()
    {
        return "welcome to edit employee page";
    }

}
