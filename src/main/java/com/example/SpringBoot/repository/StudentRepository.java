package com.example.SpringBoot.repository;

import com.example.SpringBoot.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

public interface StudentRepository extends JpaRepository<Student,Long> {
    Optional<Object> findByEmail(String email);





    Optional<Object> findByRollNum(Long rollNum);

    Optional<Object> deleteByRollNum(Long rollNum);
}