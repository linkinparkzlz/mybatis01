package com.zou.mappers;

import com.zou.model.Student;

import java.util.List;

public interface AddressMapper {


    /**
     * 通过Id查找年级
     * @param id
     * @return
     */
    public GradeMapper findById(Integer id);

}
