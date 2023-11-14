package com.skillogic.springboot_datajpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillogic.springboot_datajpa.entity.Student;
import com.skillogic.springboot_datajpa.repository.IStudentRepository;

@Service("stservice")
public class StudentServiceImpl implements IStudentService{
	
	@Autowired
	private IStudentRepository iRepository;

	@Override
	public int saveStudent(Student st) {
		Student s=iRepository.save(st);//it inserts the data as record
		int id = s.getStudentId();
		return id;
	}

	@Override
	public List<Student> getAllStudents() {
		List<Student> list=iRepository.findAll();
		return list;
	}

	@Override
	public Student getStudentById(int id) {
		Optional<Student> op=iRepository.findById(id);//select * from student_details where id=?
		Student st = null;
		if(op.isPresent()) {
			 st = op.get();
		}else {
			st = null;
		}
		return st;
	}

	@Override
	public void deleteStudentById(int id) {
		iRepository.deleteById(id);
		System.out.println("Student is deleted");
	}

	@Override
	public void updateStudent(Student st) {
		Optional<Student> op = iRepository.findById(st.getStudentId());
		if(op.isPresent()) {
			   iRepository.save(st);//update operation
			   System.out.println("Student is updated");
		}else {
			   System.out.println("Student not found");
		}		
	}
}
