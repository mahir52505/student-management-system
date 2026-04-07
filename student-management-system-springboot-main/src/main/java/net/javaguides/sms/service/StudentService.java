package net.javaguides.sms.service;

import net.javaguides.sms.entity.Student;
import net.javaguides.sms.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;

	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	public void saveStudent(Student student) {
		studentRepository.save(student);
	}

	public Student getStudentById(Long id) {
		Optional<Student> optional = studentRepository.findById(id);
		return optional.orElse(null);
	}

	public void deleteStudentById(Long id) {
		studentRepository.deleteById(id);
	}

	public List<Student> searchStudents(String keyword) {
		return studentRepository.search(keyword);
	}

	public long getTotalCount() {
		return studentRepository.count();
	}

	public List<Student> getStudentsByCourse(String course) {
		return studentRepository.findByCourse(course);
	}
}