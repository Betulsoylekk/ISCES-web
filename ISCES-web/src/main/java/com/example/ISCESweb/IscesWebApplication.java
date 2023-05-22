package com.example.ISCESweb;

import com.example.ISCESweb.repositories.IDepartmentRepository;
import com.example.ISCESweb.repositories.IFacultyRepository;
import com.example.ISCESweb.repositories.IStudentRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class IscesWebApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(IscesWebApplication.class, args);
		var studentRepository = context.getBean(IStudentRepository.class);
		var departmentRepository = context.getBean(IDepartmentRepository.class);
		var facultyRepository = context.getBean(IFacultyRepository.class);


		//System.out.println(student1.getDepartment());

		System.out.println(studentRepository.findByDepartment_Faculty_FacultyName("ENG"));

	}

}
