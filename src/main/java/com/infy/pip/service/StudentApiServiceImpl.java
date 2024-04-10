package com.infy.pip.service;

import com.infy.pip.exception.ResourceNotFoundException;
import com.infy.pip.model.StudentApi;
import com.infy.pip.repo.StudentApiRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentApiServiceImpl implements StudentApiService{

    @Autowired
    private StudentApiRepo studentApiRepo;
    @Override
    public StudentApi saveStudent(StudentApi student) {
        return studentApiRepo.save(student);
    }

    @Override
    public List<StudentApi> getAllStudents() {
        return studentApiRepo.findAll();
    }

    @Override
    public StudentApi updateStudent(StudentApi studentApi, Integer studentId) {
        StudentApi existStudent= studentApiRepo.findById(studentId).orElseThrow(()->new ResourceNotFoundException("StudentApi","Id",studentId));
        existStudent.setName(studentApi.getName());
        existStudent.setAddress(studentApi.getAddress());
        studentApiRepo.save(existStudent);
        return  existStudent;
    }


}
