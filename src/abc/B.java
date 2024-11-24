package abc;

public class B extends A {
    static {
        System.out.print("4");
    }

    B() {
        System.out.print("5");
    }

    B(String str) {
        this();
        System.out.println("6");
    }
}
