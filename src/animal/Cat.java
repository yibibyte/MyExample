package animal;

// Производный класс

// ООП
// Наследование
// Полиморфизм
// Абстактность
// Инкапсуляция

public class Cat implements MakeVoice{
    //public class Cat extends AbstractAnimal {
    public String name = "Кот";
    private int ageCat;

    public Cat() {
        super();
    }
//        public Cat(String name) {
//                super(name);
//            //System.out.println("Имя животного: " + name);
//        }

    //Конструктор производного класса
    public Cat(String name) {
        // Вызов конструктора базового класса
        this.name = name;
        
        // Комментарий: Доступ к переменной name базового класса
        System.out.println("Имя животного: " + name);
    }

    public Cat(String name, int age) {
        this(name); // Вызов конструктора с двумя параметрами
    }

    @Override
    public void makeSound() {
        //super.makeSound();
        System.out.println("Мяу!");
    }

    // extends AbstractAnimal
    //    @Override
    //    public void speak() {
    //        System.out.println("Meow!");
    //    }

}
