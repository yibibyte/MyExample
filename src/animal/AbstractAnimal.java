package animal;

public abstract class AbstractAnimal implements AnimalImpl{
    public abstract void speak();

    public void walk() {
        System.out.println("Animal is walking");
    }
}
