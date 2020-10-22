package com.lhu.springbootMongoDB.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.lhu.springbootMongoDB.controller.Dao.StudentRepository;
import com.lhu.springbootMongoDB.dto.Student;
import com.lhu.springbootMongoDB.dto.Subject;

public class DbInsert implements CommandLineRunner{
	
	@Autowired
	StudentRepository repo;

	List<Student> students = new ArrayList<>();
	List<Subject> subject = new ArrayList<>();
	
	@Override
	public void run(String... args) throws Exception {
		/*
		subject.add(new Subject("1", "Maths", "M001"));
		subject.add(new Subject("2", "Physics", "P001"));
		
		students.add(new Student("1", "Sunil", "11", subject));
		
		subject.add(new Subject("3", "Chemistry", "C001"));
		students.add(new Student("2", "Kamal", "12", subject));
		
		repo.deleteAll();
		repo.saveAll(students);*/
	}

}
