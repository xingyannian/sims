package com.dgxx.sims.repository;

import com.dgxx.sims.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by XINGYANNIAN on 2018/3/2.
 */
public interface StudentRepository extends JpaRepository<Student,Long> {
    Student findByName(String name);
    Student findByNameOrStuId(String name,String stuId);
}
