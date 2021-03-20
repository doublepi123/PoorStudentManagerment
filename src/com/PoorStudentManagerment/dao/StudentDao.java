package com.PoorStudentManagerment.dao;

import com.PoorStudentManagerment.model.Student;

public interface StudentDao {
    boolean add(Student student);
    boolean delete();
    boolean find();
    boolean update();
}
