package com.lhu.springbootMongoDB.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lhu.springbootMongoDB.controller.Dao.StudentRepository;
import com.lhu.springbootMongoDB.dto.Student;
import com.lhu.springbootMongoDB.dto.Subject;

@RestController
public class MainController {

	@Autowired
	StudentRepository repo;

	@GetMapping(path="/getStudents",produces = {"application/json","application/xml"})
	public List<Student> getStudents() {
		return repo.findAll();
	}
	
	@GetMapping(path="/getStudent/{id}",produces = {"application/xml","application/json"})
	public Student getStudent(@PathVariable("id") String id) {
		return repo.findById(id).orElse(new Student());
	}
	
	@RequestMapping("/addStudents")
	public List<Student> addStudents() {
		List<Student> students = new ArrayList<>();
		List<Subject> subject = new ArrayList<>();

		subject.add(new Subject("1", "Maths", "M001"));
		subject.add(new Subject("2", "Physics", "P001"));

		students.add(new Student("1", "Sunil", "11", subject));

		subject.add(new Subject("3", "Chemistry", "C001"));
		students.add(new Student("2", "Kamal", "12", subject));

		repo.deleteAll();
		repo.saveAll(students);

		return repo.findAll();
	}
	
	@PutMapping("/updateStudent")
	public List<Student> deleteStudent(@RequestBody Student student) {
		repo.save(student);
		return repo.findAll();
	}
	
	@DeleteMapping("/deleteStudent/{id}")
	public List<Student> deleteStudent(@PathVariable("id") String id) {
		Student student = repo.findById(id).orElse(new Student());
		repo.delete(student);
		return repo.findAll();
	}
}
