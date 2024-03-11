package com.swagger.project.Services;

import java.util.List;
import com.swagger.project.Modals.Student;

public interface StudentService {
    public List<Student> getAllStudentList();
    public Student getStudentById(int studentId);
    public Student saveStudentRecord(Student student);
    public Student updateStudentRecord(Student student);
    public Student deleteStudentRecord(int studentId);
}
