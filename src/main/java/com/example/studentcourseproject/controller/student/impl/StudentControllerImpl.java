package com.example.studentcourseproject.controller.student.impl;

import com.example.studentcourseproject.configRecord.PropertyRecord;
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
    private final PropertyRecord propertyRecord;
    @GetMapping
    public int getValues(){
        return propertyRecord.maximumStudent();
    }
    @GetMapping(path = "/country")
    public boolean isAllowedCountry(@RequestHeader String country){
        return propertyRecord.allowedCountries().contains(country.toUpperCase());
    }
    @GetMapping("/record")
    public PropertyRecord returnRecord(){
        return propertyRecord;
    }
}
