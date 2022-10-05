package com.revature.courses.dao;

import com.revature.courses.models.Course;

import java.util.List;

public interface CourseDAO {
    // This is where I define the methods I want the DAO to use to interact with some database
    Course createCourse(String courseNum, String title, int teacherId);

    List<Course> getAllCourses();

    List<Course> getCoursesByTeacherId(int id);

    boolean updateCourse(Course course);
}
