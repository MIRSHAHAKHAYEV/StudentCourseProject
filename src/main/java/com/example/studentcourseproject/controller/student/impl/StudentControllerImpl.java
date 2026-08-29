package com.example.studentcourseproject.controller.student.impl;

import com.example.studentcourseproject.configRecord.PropertyRecord;
import com.example.studentcourseproject.controller.student.IStudentController;
import com.example.studentcourseproject.dto.studentDto.DtoStudentRequest;
import com.example.studentcourseproject.dto.studentDto.DtoStudentResponse;
import com.example.studentcourseproject.service.notification.INotificationService;
import com.example.studentcourseproject.service.student.IStudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/student")
public class StudentControllerImpl implements IStudentController {

    private final IStudentService studentService;
    private final INotificationService notificationService;
    private final PropertyRecord propertyRecord;

    public StudentControllerImpl(
            IStudentService studentService,
            @Qualifier("emailService") INotificationService notificationService,
            PropertyRecord propertyRecord) {
        this.studentService = studentService;
        this.notificationService = notificationService;
        this.propertyRecord = propertyRecord;
    }

    @GetMapping
    public int getValues(){
        return propertyRecord.maximumStudent();
    }
    @PostMapping(path = "/save")
    public DtoStudentResponse saveStudent(@RequestBody DtoStudentRequest dtoStudentRequest){
        return studentService.create(dtoStudentRequest);
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
