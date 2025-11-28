// Program3_StaticExample.java
class Counter {
    static int count = 0;

    Counter() {
        count++;
    }

    static void showCount() {
        System.out.println("Total Objects: " + count);
    }
}

public class Program3_StaticExample {
    public static void main(String[] args) {
        new Counter();
        new Counter();
        new Counter();
        Counter.showCount();
    }
}
