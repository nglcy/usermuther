package com.chenyuan.scaffold.mapper;

import com.chenyuan.scaffold.model.Student;
import java.util.List;

/**
 * @ClassName StudentMapper
 * @Author chenyuan
 * @Description TODO
 * @Date 2019/9/25 0:06
 */
public interface StudentMapper {

    int insert(Student student);

    List<Student> selectAll();
}
