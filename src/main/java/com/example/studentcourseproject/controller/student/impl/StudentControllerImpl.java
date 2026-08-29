package com.example.studentcourseproject.controller.student.impl;

import com.example.studentcourseproject.controller.student.IStudentController;
import com.example.studentcourseproject.service.student.IStudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/student")
@RequiredArgsConstructor
public class StudentControllerImpl implements IStudentController {
    private final IStudentService studentService;
    @Value("${app.maximum-student}")
    private int maximumStudent;
    @Value("${app.allowed-countries}")
    private List<String> allowedCountries;
    @GetMapping
    public int getValues(){
        return maximumStudent;
    }
    @GetMapping(path = "/country")
    public boolean isAllowedCountry(@RequestHeader String country){
        return allowedCountries.contains(country);
    }
}
