package net.javaguides.sms.controller;

import net.javaguides.sms.entity.Student;
import net.javaguides.sms.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;

	@GetMapping("/")
	public String viewHomePage(Model model) {
		model.addAttribute("students", studentService.getAllStudents());
		model.addAttribute("totalStudents", studentService.getTotalCount());
		return "index";
	}

	@GetMapping("/showNewStudentForm")
	public String showNewStudentForm(Model model) {
		Student student = new Student();
		model.addAttribute("student", student);
		return "new_student";
	}

	@PostMapping("/saveStudent")
	public String saveStudent(@ModelAttribute("student") Student student) {
		studentService.saveStudent(student);
		return "redirect:/";
	}

	@GetMapping("/showFormForUpdate/{id}")
	public String showFormForUpdate(@PathVariable(value = "id") long id, Model model) {
		Student student = studentService.getStudentById(id);
		model.addAttribute("student", student);
		return "update_student";
	}

	@GetMapping("/deleteStudent/{id}")
	public String deleteStudent(@PathVariable(value = "id") long id) {
		this.studentService.deleteStudentById(id);
		return "redirect:/";
	}

	@GetMapping("/search")
	public String search(@RequestParam("keyword") String keyword, Model model) {
		model.addAttribute("students", studentService.searchStudents(keyword));
		model.addAttribute("keyword", keyword);
		model.addAttribute("totalStudents", studentService.searchStudents(keyword).size());
		return "index";
	}
}