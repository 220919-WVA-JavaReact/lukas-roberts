package com.revature.courses.dao;

import com.revature.courses.models.Teacher;

public interface TeacherDAO {
    Teacher getByUsername(String username);
    Teacher createTeacher(String first, String last, String username, String password);
}
