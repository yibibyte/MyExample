package animal;

public class Animal {
    public String name = "Vasya from Animal";
    int age;

    //private String breed = "";

    public Animal() {
        //System.out.println("Animal constructor");
        this.name = name;
    }

    public void makeSound() {
        System.out.println("Animal makes a sound");
    }

    public Animal(String name) {
        // Инициализация переменной name
        this.name = name;
    }
}
