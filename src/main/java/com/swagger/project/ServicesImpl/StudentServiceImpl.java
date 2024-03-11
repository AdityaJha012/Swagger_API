package com.swagger.project.ServicesImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.swagger.project.Modals.Student;
import com.swagger.project.Repositories.StudentRepository;
import com.swagger.project.Services.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired private StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudentList() {
        return (List<Student>) this.studentRepository.findAll();
    }

    @Override
    public Student getStudentById(int studentId) {
        return this.studentRepository.findById(studentId).orElse(null);
    }

    @Override
    public Student saveStudentRecord(Student student) {
        if(student != null){
            return this.studentRepository.save(student);
        } else {
            throw new NullPointerException("Student Object is Null!");
        }
    }

    @Override
    public Student updateStudentRecord(Student student) {
        if(student != null){
            return this.studentRepository.save(student);
        } else {
            throw new NullPointerException("Student Object is Null!");
        }
    }

    @Override
    public Student deleteStudentRecord(int studentId) {
        Student deleteStudent = null;
        try {
            deleteStudent = this.studentRepository.findById(studentId).orElse(null);
            if(deleteStudent != null){
                this.studentRepository.deleteById(studentId);
            } else {
                throw new NullPointerException("Student Not Found!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return deleteStudent;
    }
    
}
