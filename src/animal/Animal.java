package animal;

public class Animal {
    public String name = "Sharik from Animal";
    private int age;
    private String color = "Black";

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

    public Animal(int age) {
        this.age = age;
    }

    // Метод для получения возраста
    public int getAge() {
        return age;
    }

    public Animal(String name, int age) {
        this(name);
        // Инициализация переменной age
        this.age = age;
    }

}
