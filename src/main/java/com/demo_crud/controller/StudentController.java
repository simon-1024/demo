package com.demo_crud.controller;
import com.demo_crud.entity.Result;
import com.demo_crud.entity.Student;
import com.demo_crud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService service;

    /**
     * 查询所有数据
     */
    @RequestMapping(method = RequestMethod.GET)
    public Result getAllStudent(){
        List<Student> allStudent = service.getAllStudent();
        return new Result(true,200,"查询成功",allStudent);
    }

    /**
     * 根据ID查询
     */
    @RequestMapping(method = RequestMethod.GET, value ="/{id}" )
    public Result getStudentById(@PathVariable Integer id){
        Student student = service.getStudentById(id);
        return new Result(true,200,"查询成功",student);
    }

    /**
     * 更新数据
     */
    @RequestMapping(method =RequestMethod.PUT ,value = "/update")
    public Result updateStudent(@RequestBody Student student) {
        service.updateStudent(student);
        return new Result(true,200,"更新成功");
    }

    /**
     * 添加数据
     */
    @RequestMapping(method = RequestMethod.POST,value = "/save")
    public Result saveStudent(@RequestBody Student student){
        service.saveStudent(student);
        return new Result(true,200,"插入成功");
    }

    /**
     * 删除数据
     */
    @RequestMapping(method = RequestMethod.DELETE,value = "/delete/{id}")
    public Result deleteStudent(@PathVariable Integer id) {
        service.deleteStudent(id);
        return new Result(true,200,"已经删除");
    }
}
