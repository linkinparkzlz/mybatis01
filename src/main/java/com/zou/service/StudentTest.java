package com.zou.service;

import com.zou.mappers.StudentMapper;
import com.zou.model.Student;
import com.zou.util.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;

public class StudentTest {

    public static void main(String[] args) {


        SqlSession sqlSession = SqlSessionFactoryUtil.openSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);

        Student student = new Student("lisi", 111);

        int result = studentMapper.add(student);

        sqlSession.commit();

        if (result > 0) {
            System.out.println("添加成功");
        }

    }


}
