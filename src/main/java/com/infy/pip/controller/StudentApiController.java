package com.infy.pip.controller;

import com.infy.pip.model.StudentApi;
import com.infy.pip.service.StudentApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
@CrossOrigin("*")
public class StudentApiController {

    @Autowired
    private StudentApiService studentApiService;

    @PostMapping("/add")
    public String addStudent(@RequestBody StudentApi student)
    {
        studentApiService.saveStudent(student);

return "New Student is added";
    }
    @GetMapping("/getall")
    public List<StudentApi> getStudents()
    {
        return studentApiService.getAllStudents();
    }
    @PutMapping("/{id}")
    public ResponseEntity<StudentApi> updateStudent(@PathVariable("id") Integer studentId,@RequestBody StudentApi studentApi)
    {
        return new ResponseEntity<StudentApi>(studentApiService.updateStudent(studentApi,studentId), HttpStatus.OK);
    }

}
