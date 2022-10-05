package com.revature.courses.dao;

import com.revature.courses.models.Teacher;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TeacherDAOImpl implements TeacherDAO {
    String line = "";
    String splitBy = ",";
    @Override
    public Teacher getByUsername(String username) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("src/main/resources/teachers.csv"));
            while ((line = br.readLine()) != null) {
                String[] info = line.split(splitBy);
                int id = Integer.valueOf(info[0]);
                if (info[3].equals(username)) {
                    return new Teacher(id, info[1], info[2], info[3], info[4]);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public Teacher createTeacher(String first, String last, String username, String password) {
        System.out.println("called");
        return null;
    }
}
