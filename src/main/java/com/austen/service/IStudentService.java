package com.austen.service;

import java.util.List;

import com.austen.entity.Student;

/**
 * @author Austen
 */
public interface IStudentService {
    /**
     * 添加
     * @param name
     */
    void add(String name);

    /**
     * 删除
     * @param id
     */
    void del(Long id);

    /**
     * 修改
     * @param student
     */
    void upd(Student student);

    /**
     * 按id查询
     * @param id
     * @return
     */
    Student get(Long id);

    /**
     * 查询所有
     * @return
     */
    List<Student> list();

    /**
     * 查询数量
     * @return
     */
    int queryCount();
}
