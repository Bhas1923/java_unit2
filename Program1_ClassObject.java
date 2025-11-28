// Program1_ClassObject.java
class Student {
    String name;
    int age;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age : " + age);
    }
}

public class Program1_ClassObject {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Bhaskar";
        s.age = 21;
        s.display();
    }
}
