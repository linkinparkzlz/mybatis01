package com.zou.mappers;

import com.zou.model.Address;
import com.zou.model.Student;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.session.RowBounds;

import java.util.List;
import java.util.Map;

public interface StudentMapper {


    public int add(Student student);

    public int update(Student student);

    public int delete(Integer id);

    public Student findById(Integer id);

    public List<Student> findAll();

    public Student findStudentWithAddress(Integer id);

    public Student findByGradeId(Integer gradeId);


    //f复杂sql  if

    public List<Student> searchStudents(Map<String, Object> map);


    //复杂sql  when
    public List<Student> searchStudents2(Map<String, Object> map);

    //where 语句
    public List<Student> searchStudents3(Map<String, Object> map);

    //trim  语句
    public List<Student> searchStudents4(Map<String, Object> map);

    //  foreach语句
    public List<Student> searchStudents5(Map<String, Object> map);

    //  set  更新一个字段
    public int updateStudent(Student student);

    //多参数
    public List<Student> searchStudent6s(String name, String age);

    //  分页
    public List<Student> findStudents(RowBounds rowBounds);

    //使用注解
    @Insert("insert into t_student values(null,#{name},#{age})")
    public int insertStudent(Student student);

    @Update("update t_student set name=#{name},age=#{age} where id=#{id}")
    public int updateStudent1(Student student);

    @Delete(("deleteStudent where id=#{id}"))
    public int deleteStudent1(int id);

    @Select("select * from t_student where id=#{id}")
    public Student getStudent(Integer id);

}

















