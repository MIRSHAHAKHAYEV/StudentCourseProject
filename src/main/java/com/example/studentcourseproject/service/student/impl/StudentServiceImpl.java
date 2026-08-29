package com.example.studentcourseproject.service.student.impl;

import com.example.studentcourseproject.controller.student.IStudentController;
import com.example.studentcourseproject.repository.StudentRepository;
import com.example.studentcourseproject.service.student.IStudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements IStudentService {
    private final StudentRepository studentRepository;
}
