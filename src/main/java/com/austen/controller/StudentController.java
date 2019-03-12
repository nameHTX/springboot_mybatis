package com.austen.controller;

import com.austen.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.austen.service.IStudentService;

import java.util.List;

/**
 * @author Austen
 */
@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private IStudentService iStudentService;

    /**
     * 添加
     * @param name
     * @return
     */
    @RequestMapping("/add")
    public String add(String name) {
        iStudentService.add(name);
        return "add success";
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @RequestMapping("/del")
    public String del(Long id){
        iStudentService.del(id);
        return "del success";
    }

    /**
     * 更新
     * @return
     */
    @RequestMapping("/upd")
    public String upd(){
        Student student = new Student();
        student.setId((long) 1);
        student.setName("荆轲");
        iStudentService.upd(student);
        return "upd success";
    }

    /**
     * 按id查询
     * @param id
     * @return
     */
    @RequestMapping("/get")
    public Student get(Long id){
        return iStudentService.get(id);
    }

    /**
     * 查询全部
     * @return
     */
    @RequestMapping("/list")
    public List<Student> list(){
        return iStudentService.list();
    }

    /**
     * 查询数量
     * @return
     */
    @RequestMapping("/queryCount")
    public int queryCount(){
        return iStudentService.queryCount();
    }
}
