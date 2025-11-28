// Program8_InterfaceExample.java
interface A {
    void displayA();
}

interface B {
    void displayB();
}

class C implements A, B {
    public void displayA() {
        System.out.println("From Interface A");
    }

    public void displayB() {
        System.out.println("From Interface B");
    }
}

public class Program8_InterfaceExample {
    public static void main(String[] args) {
        C obj = new C();
        obj.displayA();
        obj.displayB();
    }
}
