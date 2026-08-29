package com.example.studentcourseproject.service.student.impl;

import com.example.studentcourseproject.controller.student.IStudentController;
import com.example.studentcourseproject.dto.studentDto.DtoStudentRequest;
import com.example.studentcourseproject.dto.studentDto.DtoStudentResponse;
import com.example.studentcourseproject.entity.StudentEntity;
import com.example.studentcourseproject.repository.StudentRepository;
import com.example.studentcourseproject.service.student.IStudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements IStudentService {
    private final StudentRepository studentRepository;

    @Override
    public DtoStudentResponse create(DtoStudentRequest request) {
        StudentEntity entity = StudentEntity.builder()
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .build();

        StudentEntity saved = studentRepository.save(entity);

        return DtoStudentResponse.builder()
                .fullName(saved.getFirstName() + " " + saved.getLastName())
                .build();
    }

    @Override
    public DtoStudentResponse getById(Long aLong) {
        return null;
    }

    @Override
    public DtoStudentResponse update(Long aLong, DtoStudentRequest request) {
        return null;
    }

    @Override
    public void delete(Long aLong) {

    }
}
