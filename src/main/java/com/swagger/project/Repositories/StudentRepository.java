package com.swagger.project.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.swagger.project.Modals.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {
    
}
