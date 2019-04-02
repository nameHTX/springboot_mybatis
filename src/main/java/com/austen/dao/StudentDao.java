package com.austen.dao;

import java.util.List;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import com.austen.entity.Student;

/**
 * @author Austen
 */
@Mapper
@Repository
public interface StudentDao {

    /**
     * 添加
     * @param name
     */
    @Insert("INSERT INTO student(name) values(#{name})")
    void add(String name);

    /**
     * 删除
     * @param id
     */
    @Delete("DELETE FROM student WHERE id = #{id}")
    void del(Long id);

    /**
     * 修改
     * @param student
     */
    @Update("UPDATE student SET name = #{name} WHERE id = #{id}")
    void upd(Student student);

    /**
     * 按id查询
     * @param id
     * @return
     */
    @Select("SELECT * FROM student WHERE id = #{id}")
    Student get(Long id);

    /**
     * 查询所有
     * @return
     */
    @Select("SELECT * FROM student")
    List<Student> list();

    /**
     * 查询数量
     * @return
     */
    int queryCount();
}
