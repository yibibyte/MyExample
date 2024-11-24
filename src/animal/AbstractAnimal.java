package animal;

public abstract class AbstractAnimal implements AnimalImpl {
    int age;
    int speed;
    String name = "AbstractAnimal Name";

    public abstract void speak();

    public void walk() {
        System.out.println("Animal is walking");
    }


}
