package com.swagger.project.Controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.swagger.project.Modals.Student;
import com.swagger.project.ServicesImpl.StudentServiceImpl;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired private StudentServiceImpl studentServiceImpl;

    @GetMapping("/getAllStudentList")
    public ResponseEntity<List<Student>> getAllStudentList(){
        List<Student> studentList = this.studentServiceImpl.getAllStudentList();
        return new ResponseEntity<List<Student>> (studentList, HttpStatus.OK);
    }

    @GetMapping("/getStudentById/{studentId}")
    public ResponseEntity<Student> getStudentById(@PathVariable("studentId") int studentId){
        Student student = this.studentServiceImpl.getStudentById(studentId);
        return new ResponseEntity<Student> (student, HttpStatus.OK);
    }
    
    @PostMapping("/saveStudentRecord")
    public ResponseEntity<Student> saveStudentRecord(@RequestBody Student student){
        Student saveStudent = null;
        if(student != null){
            saveStudent = this.studentServiceImpl.saveStudentRecord(student);
        } else {
            throw new NullPointerException("Student Object is Null!");
        }
        return new ResponseEntity<Student> (saveStudent, HttpStatus.OK);
    }

    @PutMapping("/updateStudentRecord")
    public ResponseEntity<Student> updateStudentRecord(@RequestBody Student student){
        Student updateStudent = null;
        if(student != null){
            updateStudent = this.studentServiceImpl.updateStudentRecord(student);
        } else {
            throw new NullPointerException("Student Object is Null!");
        }
        return new ResponseEntity<Student> (updateStudent, HttpStatus.OK);
    }

    @DeleteMapping("/deleteStudentRecord/{studentId}")
    public ResponseEntity<Student> deleteStudentRecord(@PathVariable("studentId") int studentId){
        Student deleteStudent = this.studentServiceImpl.deleteStudentRecord(studentId);
        return new ResponseEntity<Student> (deleteStudent, HttpStatus.OK);
    }
}
