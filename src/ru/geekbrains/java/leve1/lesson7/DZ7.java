package ru.geekbrains.java.leve1.lesson7;


//1. Расширить задачу про котов и тарелки с едой
//2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20)
//3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true
//4. Считаем, что если коту мало еды в тарелке, то он ее просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы)
//5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль
//6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку



    class Cat {
        private String name;
        private int appetite;
        private boolean fed; //Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны)
        // как мы знаем boolean default false и не будем производить инициализацию

        public Cat(String name, int appetite) {
            this.name = name;
            this.appetite = appetite;
        }

        public String getName() {
            return name;
        }

        public int getAppetite() {
            return appetite;
        }

        public void eat(Plate plate) {
            fed = plate.decreaseFood(appetite);
        }

        public void info() {
            System.out.println(name + " " + (fed ? " сыт " : " голоден "));
        }
    }

    class Plate {
        private int food;

        public Plate(int food) {
            this.food = food;
        }

        public int getFood() {
            return food;
        }

        public boolean decreaseFood(int appetite) {
            if (food - appetite < 0) {
                //4. Считаем, что если коту мало еды в тарелке, то он ее просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы)
                return false;
            }
            else {
                food -= appetite;
                return true;
            }
        }

        public void info() {
            System.out.println("plate " + food);
        }

        //6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку
        public void addFood(int food) {
            this.food += food;
        }

    }


    public class DZ7 {
        public static void main(String[] args) {
            //5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль
            Cat[] cats = {
                    new Cat("Barsik", 70),
                    new Cat("Sharik", 25),
                    new Cat("Mursik", 18),
            };
            //и тарелку с едой,
            Plate plate = new Plate(100);
            for(Cat itemCat:cats) {
                itemCat.eat(plate);
                itemCat.info();
            }



        }


}
