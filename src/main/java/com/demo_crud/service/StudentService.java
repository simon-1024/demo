package com.demo_crud.service;

import com.demo_crud.entity.Student;

import java.util.List;

public interface StudentService {

    /**
     * 查询所有
     */
    List<Student> getAllStudent();

    /**
     * 按照ID查询
     */
    Student getStudentById(Integer id);

    /**
     * 更新数据
     */
    void updateStudent(Student student);

    /**
     * 删除数据
     */
    void deleteStudent(Integer id);

    /**
     * 新增数据
     */
    void  saveStudent(Student student);

}
