package com.lhu.springbootMongoDB.dto;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "student")
public class Student {
	@Id
	private String _id;
	private String name;
	private String grade;
	private List<Subject> stuSubject;
	public Student() {}
	public Student(String id, String name, String grade, List<Subject> stuSubject) {
		this._id = id;
		this.name = name;
		this.grade = grade;
		this.stuSubject = stuSubject;
	}

	public String getId() {
		return _id;
	}

	public void setId(String id) {
		this._id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public List<Subject> getStuSubject() {
		return stuSubject;
	}

	public void setStuSubject(List<Subject> stuSubject) {
		this.stuSubject = stuSubject;
	}

	@Override
	public String toString() {
		return "Student [id=" + _id + ", name=" + name + ", grade=" + grade + ", stuSubject=" + stuSubject + "]";
	}

}
