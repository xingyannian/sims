package com.dgxx.sims.repository;

import com.dgxx.sims.entity.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by XINGYANNIAN on 2018/3/2.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentRepositoryTest {
    @Autowired
    private StudentRepository studentRepository;
    @Test
    public void save(){
        Student student = new Student();
        student.setName("zhansan");
        student.setPassword("123456");
        studentRepository.save(student);
    }

}