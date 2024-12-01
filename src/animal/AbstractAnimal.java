package animal;

public abstract class AbstractAnimal implements AnimalImpl {
    int age;
    int speed;
    String name = "AbstractAnimal Name";

    public abstract void speak();   // Абстрактный метод, реализация которого обязательна в подклассах

    public void walk() {
        System.out.println("Animal is walking");
    }

    // Метод с конкретной реализацией
    public void introduce() {
        System.out.println("Привет! Я " + name);
    }
}
