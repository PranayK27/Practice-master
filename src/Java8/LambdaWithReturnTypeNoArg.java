package Java8;

interface MessengerWithReturnTypeNoArg {
    public String printMessage();
}

public class LambdaWithReturnTypeNoArg {
    public static void main(String[] args) {

        MessengerWithReturnTypeNoArg messenger = () -> {
          return "Hello";
        };

        // or
//        Messenger1 obj = () -> "hello";

        String message = messenger.printMessage(); // obj.printMessage();
        System.out.println(message);
    }
}
