// Course.java
package com.api.multipleapi.entity;


import jakarta.persistence.*;
import jakarta.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

import java.util.List;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Course() {
		super();
	}

	public Course(Long id, String name, List<Student> students) {
		super();
		this.id = id;
		this.name = name;
		this.students = students;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	private String name;

	@ManyToMany(mappedBy = "courses")
	@JsonBackReference
	private List<Student> students;
    // Constructors, getters, setters
}
