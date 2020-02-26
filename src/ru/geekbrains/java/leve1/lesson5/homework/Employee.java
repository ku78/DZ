package ru.geekbrains.java.leve1.lesson5.homework;
//* Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
//* Конструктор класса должен заполнять эти поля при создании объекта;
//* Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
//* Создать массив из 5 сотрудников
//Пример:
//Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
//persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
//persArray[1] = new Person(...);
//...
//persArray[4] = new Person(...);
//
//* С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
public class Employee {
        private String name, surname , futhername, position, email, telephon;

        public int getAge() {
            return age;
        }

        private int age;
        private double patch;
        Employee(String name, String surname , String futhername, String position,String email, String telephon,double patch, int age) {
            this.name = name;
            this.surname = surname;
            this.futhername = futhername;
            this.position = position;
            this.email = email;
            this.telephon = telephon;
            this.patch = patch;
            if(age >= 14) {
                this.age = age;
            } else {
                System.out.println("Сотрудник должен быть старше 14 лет");
            }

        }//end конструктор
        void employeeInfo(){

            System.out.println(name+" "+futhername+" "+surname+" "+position+" "+email+" "+telephon+" "+patch+" "+age);
        }

        public static void main(String[] args) {
            Employee[] emplArray = new Employee[5]; // Вначале объявляем массив объектов
            emplArray[0] = new Employee("Vasy", "Ivanov", "Ivanovich", "Engineer po NiI","vasy900405@maillol.com", "+791112312", 40000,33 ); // потом для каждой ячейки массива задаем объект
            emplArray[1] = new Employee("Mariya", "Petrova", "Sergeevna", "Manager","mari05@maillol.com", "+793112512", 45000,43 );
            emplArray[2] = new Employee("Pavel", "Sidorov", "Genadevich", "Slesar","pavel004@maillol.com", "+790216127", 60000,50 );
            emplArray[3] = new Employee("Anton", "Dokuchaev", "Pavlovich", "Engineer-programmist","anton85@maillol.com", "+796012318", 30000,20 );
            emplArray[4] = new Employee("Denis", "Ladkin", "Andrervich", "Engineer po NiI","den78@maillol.com", "+793019312", 50000,45 );
            for (Employee item : emplArray) {
                if (item.getAge() > 40) {
                    item.employeeInfo();
                }
            }
        }


      

}//end Employee
