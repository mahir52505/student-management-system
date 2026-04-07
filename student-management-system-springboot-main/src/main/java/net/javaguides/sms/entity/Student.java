package net.javaguides.sms.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "students")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "first_name", nullable = false)
	private String firstName;

	@Column(name = "last_name", nullable = false)
	private String lastName;

	@Column(name = "email", nullable = false, unique = true)
	private String email;

	@Column(name = "phone")
	private String phone;

	@Column(name = "address")
	private String address;

	@Column(name = "course")
	private String course;

	@Column(name = "created_at")
	private LocalDateTime createdAt;

	// Constructors
	public Student() {
		this.createdAt = LocalDateTime.now();
	}

	public Student(String firstName, String lastName, String email, String phone, String address, String course) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.course = course;
		this.createdAt = LocalDateTime.now();
	}

	// Getters and Setters
	public Long getId() { return id; }
	public void setId(Long id) { this.id = id; }

	public String getFirstName() { return firstName; }
	public void setFirstName(String firstName) { this.firstName = firstName; }

	public String getLastName() { return lastName; }
	public void setLastName(String lastName) { this.lastName = lastName; }

	public String getEmail() { return email; }
	public void setEmail(String email) { this.email = email; }

	public String getPhone() { return phone; }
	public void setPhone(String phone) { this.phone = phone; }

	public String getAddress() { return address; }
	public void setAddress(String address) { this.address = address; }

	public String getCourse() { return course; }
	public void setCourse(String course) { this.course = course; }

	public LocalDateTime getCreatedAt() { return createdAt; }
	public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
}