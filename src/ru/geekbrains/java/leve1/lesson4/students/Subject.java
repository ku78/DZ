package ru.geekbrains.java.leve1.lesson4.students;

import java.util.ArrayList;

public class Subject {

    Schedule schedule;
    String name;
    String time;
    ArrayList<Teacher> teachers;

    public Subject(String name, String time) {
        this.name = name;
        this.time = time;
        teachers = new ArrayList<>();
    }

    @Override
    public String toString() {
        return String.format("%s %s", name, time);
    }

    public void applyTeacher(Teacher teacher) {
        teacher.subjects.add(this);
        teachers.add(teacher);
    }
}