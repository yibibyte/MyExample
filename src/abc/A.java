package abc;

public class A {
    static {
        System.out.print("1");
    }

    A(){
        System.out.print("2");
    }

    A(String str){
        this();
        System.out.print("3");
    }

}
