package animal;

public class Bird extends Animal implements IFlyable{

    private String name ="Орел";
    private int age;

    // Конструктор
    public Bird(String name, int age) {
        super(age);
        this.name = name;
    }

    // Переопределяем метод getAge(), нарушая контракт родительского метода
    @Override
    public int getAge() {
        return age;
    }

    // Новый метод для получения типа птицы
    public String getName() {
        return name;
    }

    @Override
    public void fly() {
        System.out.println("Летаю");
    }
}
