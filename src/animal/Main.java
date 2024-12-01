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

    // AbstractAnimal animalAnimals = new AbstractAnimal();

        AbstractAnimal animalAnimal = new Dog("Полкан");

        MakeVoice voice = new Dog();
        voice.makeSound();
        animalAnimal.walk(); // Упаковка объекта Dog в переменную типа Animal
        animalAnimal.play();

        // Создаем экземпляры конкретных классов
        Dog dog3 = new Dog("Шарик");
        Cat cat2 = new Cat("Мурка");

        // Upcasting: Преобразовываем объект конкретного класса к типу родительского класса или интерфейсу
        //Animal animalCat = cat2; // Упаковка объекта Cat в переменную типа Animal

        // Полиморфизм: вызываем метод у объектов разного типа через общий интерфейс
        animalAnimal.introduce(); // Выводит "Гав!"
        animal2.makeSound(); // Выводит "Мяу!"

        // Downcasting: Преобразовываем обратно к конкретному типу
        if (animalAnimal instanceof Dog) { // Проверяем, является ли объект объектом класса Dog
            Dog downcastedDog = (Dog) animalAnimal; // Приведение к типу Dog
            downcastedDog.introduce(); // Выводит "Привет! Я Шарик"
        }

//        if (animal2 instanceof Cat) { // Проверяем, является ли объект объектом класса Cat
//            Cat downcastedCat = (Cat) animal2; // Приведение к типу Cat
//            downcastedCat.introduce(); // Выводит "Привет! Я Мурка"
//        }

    }
}
