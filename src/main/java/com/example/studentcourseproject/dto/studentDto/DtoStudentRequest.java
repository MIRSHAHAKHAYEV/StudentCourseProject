package com.example.studentcourseproject.dto.studentDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
public class DtoStudentRequest {
    private String firstName;
    private String lastName;
}
