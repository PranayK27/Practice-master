package Java8;

interface MessengerNoReturnTypeWithArg {
    public void printMessage(String message);
}

public class LambdaNoReturnTypeWithArg {
    public static void main(String[] args) {

        MessengerNoReturnTypeWithArg obj = (arg) -> {
            System.out.println(arg);
        };

        obj.printMessage("Hello World");
    }
}
