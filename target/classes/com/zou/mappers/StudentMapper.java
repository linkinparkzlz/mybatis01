package com.zou.mappers;

import com.zou.model.Student;

import java.util.List;

public interface StudentMapper {

    public int add(Student student);

    public int update(Student student);

    public int delete(Integer id);

    public Student findById(Integer id);

    public List<Student> findAll();
}
