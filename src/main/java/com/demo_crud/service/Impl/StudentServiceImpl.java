package com.demo_crud.service.Impl;

import com.demo_crud.dao.StudentDao;
import com.demo_crud.entity.Student;
import com.demo_crud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao dao;

    @Override
    public List<Student> getAllStudent() {
        List<Student> allStudent = dao.getAllStudent();
        return allStudent;
    }

    @Override
    public Student getStudentById(Integer id) {
        Student student = dao.getStudentById(id);
        return student;
    }

    @Override
    public void updateStudent(Student student) {
        dao.updateStudent(student);
    }

    @Override
    public void deleteStudent(Integer id) {
        dao.deleteStudent(id);
    }

    @Override
    public void saveStudent(Student student) {
        dao.saveStudent(student);
    }
}
