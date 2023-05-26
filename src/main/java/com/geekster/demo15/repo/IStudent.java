package com.geekster.demo15.repo;

import com.geekster.demo15.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudent extends JpaRepository<Student , Integer> {
}
