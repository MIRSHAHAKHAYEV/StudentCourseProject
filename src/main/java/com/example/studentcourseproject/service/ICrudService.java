package com.example.studentcourseproject.service;

public interface ICrudService<RQ, RS, ID>{
    RS create(RQ request);
    RS getById(ID id);
    RS update(ID id, RQ request);
    void delete(ID id);
}


