package Java8;

interface Bird {
    public void displayMessage();
    static void printName(String name){
        System.out.println("New name is:" + name);
    }
    default void defaultName(){
        System.out.println("Sparrow is Default Name");
    }
}

public class DefaultInInterface {
    public static void main(String[] args) {
        Bird bird = new Bird() {
            @Override
            public void displayMessage() {
                System.out.println("Hello Interface");
            }};
        bird.displayMessage();
        bird.defaultName();
        Bird.printName("Pranay");
    }
}
