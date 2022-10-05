package com.revature.courses.dao;

import com.revature.courses.models.Course;

import java.util.List;

public class CourseDAOImpl implements CourseDAO {

    @Override
    public Course createCourse(String courseNum, String title, int teacherId) {
        System.out.println("Course Created");
        return null;
    }

    @Override
    public List<Course> getAllCourses() {
        System.out.println("Called get all courses");
        return null;
    }

    @Override
    public List<Course> getCoursesByTeacherId(int id) {
        System.out.println("called get by teacher");
        return null;
    }

    @Override
    public boolean updateCourse(Course course) {
        System.out.println("called update course");
        return false;
    }
}
