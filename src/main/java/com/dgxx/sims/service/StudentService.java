package com.dgxx.sims.service;

import com.dgxx.sims.entity.Student;
import com.dgxx.sims.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * Created by XINGYANNIAN on 2018/3/4.
 */
@Service
public class StudentService implements UserDetailsService{
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Student student = studentRepository.findByNameOrStuId(s,s);
        if (student == null){
            return new Student();
        }
        return student;

    }
}
