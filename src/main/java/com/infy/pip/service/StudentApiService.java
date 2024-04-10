package com.infy.pip.service;

import com.infy.pip.model.StudentApi;

import java.util.List;

public interface StudentApiService {
    public StudentApi saveStudent(StudentApi student);
    public List<StudentApi> getAllStudents();


    StudentApi updateStudent(StudentApi studentApi, Integer studentId);
}
