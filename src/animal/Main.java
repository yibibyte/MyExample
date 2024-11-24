package animal;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();
        //animal.move();

        Animal animal2 = new Animal();
        animal2.makeSound();
        //animal2.move();

        Dog dog = new Dog();
        // dog.makeSound(); нет метод makeSound так как не наследуется от класса Animal
        dog.move();
        dog.swim();
        dog.walk();
        dog.play();

        Cat cat = new Cat();
        cat.makeSound();
        cat.name = "Мурзик";
        String name = cat.name;
        System.out.println(name);

        String nameBird = "Сокол";
        int age = 25;
        Bird bird = new Bird(nameBird,age);
        bird.makeSound();
        System.out.println(bird.getName());
        System.out.println(bird.getAge());
    }
}
