package com.skillogic.springboot_datajpa;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.skillogic.springboot_datajpa.entity.Student;
import com.skillogic.springboot_datajpa.service.StudentServiceImpl;

@SpringBootApplication
public class SpringbootDatajpaApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringbootDatajpaApplication.class, args);
		StudentServiceImpl sImpl=ctx.getBean("stservice",StudentServiceImpl.class);
		/*Student st = new Student();
		st.setStudentName("Mahesh");
		st.setStudentAvg(98.8);
		st.setStudentAddress("Vizag");
		int i = sImpl.saveStudent(st);
		if(i>0)
			System.out.println(i+" Student Inserted");
		else
			System.out.println("Failed");*/
		
		/*List<Student> list=sImpl.getAllStudents();
		for(Student st:list) {
			System.out.println(st.getStudentId()+"  "+st.getStudentName()+"  "+st.getStudentAvg()+"  "+st.getStudentAddress());
		}*/
		
		/*Student st=sImpl.getStudentById(2);
		if(st!=null)
			System.out.println(st.getStudentId()+"  "+st.getStudentName()+"  "+st.getStudentAvg()+" "+st.getStudentAddress());
		else
			System.out.println("No Student Found");*/
		
		//sImpl.deleteStudentById(2);
		
		Student st = new Student();
		st.setStudentName("Rajkumar");
		st.setStudentAvg(97.9);
		st.setStudentAddress("Hyderabad");
		st.setStudentId(1); //existing student id
		sImpl.updateStudent(st);
		
	}

}
