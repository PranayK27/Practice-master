package Java8;

interface MessengerNoReturnTypeNoArg {
    public void printMessage();
}

public class LambdaNoReturnTypeNoArg {

    public static void main(String[] args) {
        MessengerNoReturnTypeNoArg messenger = () -> {
            System.out.println("hello");
        };

        messenger.printMessage();
    }
}
