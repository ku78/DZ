package ru.geekbrains.java.leve1.lesson4.students;

import java.util.ArrayList;

public class Group {

    ArrayList<Student> students;
    Schedule schedule;
    String groupId;
    private static int counter = 0;

    public Group() {
        groupId = "gr_" + counter;
        counter++;
        students = new ArrayList<>();
    }

    public void showStudentInfo() {
        System.out.println("Инфа о студентах: ");

        for (Student student : students) {
            System.out.print(groupId + " ");
            System.out.println(student);

        }
    }
    public void showSubjectInfo() {
        System.out.println("Инфа о предметах: ");
        for (Subject subject : schedule.subjects) {

            System.out.println(subject);

        }
    }
    public void showScheduleInfo() {
        System.out.println("Расписание:");
        for (Subject subject : schedule.subjects) {
            System.out.print(subject + " : ");
            for (Teacher teacher : subject.teachers) {
                System.out.println(teacher);
            }
        }
    }

    public void addStudent(Student student) {
        student.addToGroup(this);
        students.add(student);
    }
}