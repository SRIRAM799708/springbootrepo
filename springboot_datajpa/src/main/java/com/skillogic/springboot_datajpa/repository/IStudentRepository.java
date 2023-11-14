package com.skillogic.springboot_datajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.skillogic.springboot_datajpa.entity.Student;

public interface IStudentRepository extends JpaRepository<Student, Integer>{

}
