package com.chenyuan.scaffold.service;

import com.chenyuan.scaffold.mapper.StudentMapper;
import com.chenyuan.scaffold.model.Student;
import com.chenyuan.scaffold.result.CommonServiceResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName UserService
 * @Author chenyuan
 * @Description TODO
 * @Date 2019/9/29 22:59
 */
@Service
public class StudentService {

    @Autowired
    private StudentMapper userMapper;

    public String findStudentAll(){
        List<Student> list = userMapper.selectAll();
//        CommonServiceResult result = new CommonServiceResult();
//        result.setT(list);
//        result.setFlag(true);
        return list.toString();
    }
}
