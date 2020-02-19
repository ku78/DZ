package ru.geekbrains.java.leve1.lesson4.students;

public class Test {

    public static void main(String[] args) {
        Student s1 = new Student("Ivanov", "Ivan", "Ivanovich");
        Student s2 = new Student("Petrov", "Petr", "Ivanovich");
        Group group = new Group();
        group.schedule = new Schedule(group);
        Schedule schedule = group.schedule;
        s1.addToGroup(group);
        s2.addToGroup(group);
        Subject sub1 = new Subject("math", "12:00");
        Subject sub2 = new Subject("inf", "15:30");
        schedule.addSubject(sub1);
        schedule.addSubject(sub2);
        Teacher mathTeacher = new Teacher("Gleym", "Eric", "Hildson");
        Teacher infTeacher = new Teacher("Korotkevich", "Gennadiy", "Batkovich");
        sub1.applyTeacher(mathTeacher);
        sub2.applyTeacher(infTeacher);

        /**Информация о студентах учителя*/
        group.showStudentInfo();
        System.out.println();
        s1.showTeachersInfo();
        /** Информация об учителях студента*/
        System.out.println("__________________________________");
        s1.showTeachersInfo();
        System.out.println();
        group.showStudentInfo();
        /** Информация о предметах студента*/
        System.out.println("__________________________________");
        group.showSubjectInfo();
        System.out.println();
        group.showStudentInfo();
        System.out.println("__________________________________");
        /** Расписание студента : пердмет, время, учитель*/
        group.showScheduleInfo();
        System.out.println("__________________________________");
        /** Сделать две группы из 10 студентов каждая с различными расписаниями
            математика 12:00 и математика 15:30 - разные объекты
            1 предмет для одного студента не могут вести два препода*/
        Student g1s1 = new Student("Ivanov", "Ivan", "Ivanovich");
        Student g1s2 = new Student("Vinov", "Ivan", "Ivanovich");
        Student g1s3 = new Student("Petrov", "Petr", "Ivanovich");
        Student g1s4 = new Student("Cerosinov", "Ivan", "Ivanovich");
        Student g1s5 = new Student("Betmenov", "Petr", "Ivanovich");
        Student g1s6 = new Student("Zoristov", "Ivan", "Ivanovich");
        Student g1s7 = new Student("Spadermenov", "Petr", "Ivanovich");
        Student g1s8 = new Student("Tupakovich", "Ivan", "Ivanovich");
        Student g1s9 = new Student("Turing", "Alan", "Mathison");
        Student g1s10 = new Student("Kalbasov", "Ivan", "Ivanovich");
        Student g2s1 = new Student("Kisloti", "Petr", "Ivanovich");
        Student g2s2 = new Student("Felotovich", "Ivan", "Ivanovich");
        Student g2s3 = new Student("Linus ", "Benedict", "Torvalds");
        Student g2s4 = new Student("Mustangov", "Ivan", "Ivanovich");
        Student g2s5 = new Student("Snikers", "Petr", "Ivanovich");
        Student g2s6 = new Student("Marsikov", "Ivan", "Ivanovich");
        Student g2s7 = new Student("Liliputov", "Petr", "Ivanovich");
        Student g2s8 = new Student("Richard", "Matthew", "Stallman");
        Student g2s9 = new Student("Limonov", "Petr", "Ivanovich");
        Student g2s10 = new Student("Amiakov", "Ivan", "Ivanovich");
        Group g1 = new Group();
        Group g2 = new Group();
        g1.schedule = new Schedule(g1);
        g2.schedule = new Schedule(g2);
        Schedule g1sched = g1.schedule;
        Schedule g2sched = g2.schedule;
        g1s1.addToGroup(g1);
        g1s2.addToGroup(g1);
        g1s3.addToGroup(g1);
        g1s4.addToGroup(g1);
        g1s5.addToGroup(g1);
        g1s6.addToGroup(g1);
        g1s7.addToGroup(g1);
        g1s8.addToGroup(g1);
        g1s9.addToGroup(g1);
        g1s10.addToGroup(g1);
        g2s1.addToGroup(g2);
        g2s2.addToGroup(g2);
        g2s3.addToGroup(g2);
        g2s4.addToGroup(g2);
        g2s5.addToGroup(g2);
        g2s6.addToGroup(g2);
        g2s7.addToGroup(g2);
        g2s8.addToGroup(g2);
        g2s9.addToGroup(g2);
        g2s10.addToGroup(g2);
        Subject g1sub1 = new Subject("math", "12:00");
        Subject g1sub2 = new Subject("inf", "15:30");

        Subject g2sub1 = new Subject("math", "13:00");
        Subject g2sub2 = new Subject("inf", "15:30");
        g1sched.addSubject(g1sub1);
        g1sched.addSubject(g1sub2);

        g2sched.addSubject(g2sub1);
        g2sched.addSubject(g2sub2);

        Teacher g1mathTeacher = new Teacher("Gleym", "Eric", "Hildson");
        Teacher g1infTeacher = new Teacher("Korotkevich", "Gennadiy", "Batkovich");
        g1sub1.applyTeacher(g1mathTeacher);
        g1sub2.applyTeacher(g1infTeacher);
        Teacher g2mathTeacher = new Teacher("Popov", "Eric", "Hildson");
        Teacher g2infTeacher = new Teacher("Butin", "Gennadiy", "Batkovich");
        g2sub1.applyTeacher(g2mathTeacher);
        g2sub2.applyTeacher(g2infTeacher);

        //Группа №1
        g1.showStudentInfo();
        System.out.println();
        g1.showScheduleInfo();
        System.out.println();
        //Группа №2
        g2.showStudentInfo();
        System.out.println();
        g2.showScheduleInfo();

    }
}
