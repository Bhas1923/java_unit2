// Program7_Overloading.java
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class Program7_Overloading {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("Sum1: " + c.add(10, 20));
        System.out.println("Sum2: " + c.add(5.5, 6.5));
    }
}
