package abc;

public class C extends B {
    static {
        System.out.print("7");
    }

    {
        System.out.print("8");
    }

    C() {
        super("Hello");
        System.out.print("9");
    }

}
