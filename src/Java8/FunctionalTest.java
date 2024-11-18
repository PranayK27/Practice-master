package Java8;

public class FunctionalTest {
    public static void main(String[] args) {
        // Lambda expression to implement the sayHello method
        Runnable greeting = (name) -> System.out.println("Hello, " + name);

        // Using the functional interface with a lambda
        greeting.sayHello("Alice");  // Output: Hello, Alice
    }
}
