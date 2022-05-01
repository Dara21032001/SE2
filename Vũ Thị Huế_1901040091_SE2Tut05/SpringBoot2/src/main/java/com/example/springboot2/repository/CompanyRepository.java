package com.example.springboot2.repository;

import com.example.springboot2.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}