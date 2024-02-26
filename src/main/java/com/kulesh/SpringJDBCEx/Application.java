package com.kulesh.SpringJDBCEx;

import java.util.List;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.kulesh.SpringJDBCEx.model.Student;
import com.kulesh.SpringJDBCEx.service.StudentService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
ApplicationContext context=	SpringApplication.run(Application.class, args);
  Student s= context.getBean(Student.class);
  s.setRollNo(104);
  s.setName("Kulesh");
  s.setMarks(78);
  StudentService service=context.getBean(StudentService.class);
   service.addStudent(s);
   
   List<Student> students=service.getStudents();
   System.out.println(students);
    
	}

}
