package animal;

public class Dog extends AbstractAnimal implements Swimmable, Movable, MakeVoice {
    @Override
    public void speak() {
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
        System.out.println("Dog is making sound from Interface MakeVoice");
    }
}
