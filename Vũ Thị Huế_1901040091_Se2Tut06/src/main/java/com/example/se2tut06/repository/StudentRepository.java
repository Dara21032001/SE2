package com.example.se2tut06.repository;

import com.example.se2tut06.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
