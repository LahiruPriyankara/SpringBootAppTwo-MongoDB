package com.lhu.springbootMongoDB.controller.Dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lhu.springbootMongoDB.dto.Student;

public interface StudentRepository extends MongoRepository<Student, String>{

}
