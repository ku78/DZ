package ru.geekbrains.java.leve1.lesson7;
//1. Расширить задачу про котов и тарелки с едой
//2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды
// (например, в миске 10 еды, а кот пытается покушать 15-20)
//3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны).
// Если коту удалось покушать (хватило еды), сытость = true
//4. Считаем, что если коту мало еды в тарелке, то он ее просто не трогает,
// то есть не может быть наполовину сыт (это сделано для упрощения логики программы)
//5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой
// тарелки и потом вывести информацию о сытости котов в консоль
//6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку

public class DZ7 {

        public static void main(String[] args) {



//            Cat cat = new Cat("Murzik");
//            Cat cat1 = new Cat("Barsik");
//            Plate plate = new Plate(100);
//
//            cat.eat(plate);
//            plate.info();
//            cat1.eat(plate);
//            plate.info();
//
//            Dog dog = new Dog("Buldog");
//            dog.voice(cat);

            //5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести
            // информацию о сытости котов в консоль
            Cat[] cats = {
                    new Cat("Barsik", 70),
                    new Cat("Sharik", 25),
                    new Cat("Mursik", 18),
            };
            //и тарелку с едой,
            Plate plate = new Plate(70);
            for(Cat itemCat:cats) {
                itemCat.eat(plate);
                itemCat.info();
            }

        }
    }
