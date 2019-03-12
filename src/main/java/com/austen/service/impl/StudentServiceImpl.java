package com.austen.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.austen.mapper.StudentMapper;
import com.austen.entity.Student;
import com.austen.service.IStudentService;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Austen
 */
@Transactional
@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public void add(String name) {
        if (null != name && !"".equals(name)) {
            studentMapper.add(name);
        }
    }

    @Override
    public void del(Long id) {
        if (null != id && id != 0) {
            studentMapper.del(id);
        }
    }

    @Override
    public void upd(Student student) {
        if (null != student && !"".equals(student)) {
            studentMapper.upd(student);
        }
    }

    @Override
    public Student get(Long id) {
        if (null != id && id != 0) {
            return studentMapper.get(id);
        }
        return null;
    }

    @Override
    public List<Student> list() {
        return studentMapper.list();
    }

    @Override
    public int queryCount() {
        return studentMapper.queryCount();
    }
}
