package com.example.studentcourseproject.service.student;

import com.example.studentcourseproject.dto.studentDto.DtoStudentRequest;
import com.example.studentcourseproject.dto.studentDto.DtoStudentResponse;
import com.example.studentcourseproject.service.ICrudService;

public interface IStudentService extends ICrudService<DtoStudentRequest, DtoStudentResponse,Long> {

}
