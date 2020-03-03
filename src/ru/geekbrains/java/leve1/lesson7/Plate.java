package ru.geekbrains.java.leve1.lesson7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }
    public int getFood() {
        return food;
    }

    public void info(){
        System.out.println("Food: "+ food);
    }

    public boolean decreaseFood(int amount){
        if (food - amount < 0) {
            //4. Считаем, что если коту мало еды в тарелке, то он ее просто не трогает,
            // то есть не может быть наполовину сыт (это сделано для упрощения логики программы)
            return false;
        }
        else {
            food -= amount;
            return true;
        }
    }
    //6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку
    public void addFood(int food) {
        this.food += food;
    }

}

