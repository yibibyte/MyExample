package animal;

public class Dog extends AbstractAnimal implements Swimmable, Movable, MakeVoice {

    public String name = "Собакин";
    public Dog() {
        super();
    }
    public Dog(String name) {
        super();
    }

    @Override
    public void speak() {
        System.out.println("Dog is speaking");
    }

    @Override
    public void play() {
        System.out.println("Dog is playing");
    }

    public void walk() {
        System.out.println("Dog is walking");
    }

    @Override
    public void move() {
        System.out.println("Dog is move at speed of :" + speed);
    }

    @Override
    public void swim() {
        System.out.println("Dog is swimming");
    }

    @Override
    public void makeSound() {
        System.out.println("Гав! из Interface MakeVoice");
    }
}
