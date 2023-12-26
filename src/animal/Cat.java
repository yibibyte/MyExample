package animal;

// Производный класс

// ООП
// Наследование
// Полиморфизм
// Абстактность
// Инкапсуляция
public class Cat extends Animal{
    //public class Cat extends AbstractAnimal {
        public String name;
        private int ageCat;

//        public Cat() {
//            this.name = super.name;
////        System.out.println("Имя животного: " + super.name); // Доступ к переменной name базового класса
//           // System.out.println("Имя животного Cat: " + name); // Доступ к переменной name базового класса
//        }
//
//    public Cat(String name) {
//            this.name = super.name;
//        //System.out.println("Имя животного: " + name);
//    }





        // Конструктор производного класса
//    public Cat(String name) {
//        // Вызов конструктора базового класса
//        super(name);
//
//        // Комментарий: Доступ к переменной name базового класса
//        System.out.println("Имя животного: " + super.name);
//    }

        //    public Cat(String name, int age) {
//        this(name); // Вызов конструктора с двумя параметрами
//    }
        public void makeSound() {
            //super.makeSound();
            System.out.println("Cat makes a bark");
        }
        // extends AbstractAnimal
//    @Override
//    public void speak() {
//        System.out.println("Meow!");
//    }

    }
