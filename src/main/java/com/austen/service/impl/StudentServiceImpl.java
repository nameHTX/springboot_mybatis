package com.austen.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.austen.dao.StudentDao;
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
    private StudentDao studentDao;

    @Override
    public void add(String name) {
        if (null != name && !"".equals(name)) {
            studentDao.add(name);
        }
    }

    @Override
    public void del(Long id) {
        if (null != id && id != 0) {
            studentDao.del(id);
        }
    }

    @Override
    public void upd(Student student) {
        if (null != student && !"".equals(student)) {
            studentDao.upd(student);
        }
    }

    @Override
    public Student get(Long id) {
        if (null != id && id != 0) {
            return studentDao.get(id);
        }
        return null;
    }

    @Override
    public List<Student> list() {
        return studentDao.list();
    }

    @Override
    public int queryCount() {
        return studentDao.queryCount();
    }
}
