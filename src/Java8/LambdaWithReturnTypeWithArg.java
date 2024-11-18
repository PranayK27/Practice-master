package Java8;

interface MessengerWithReturnTypeWithArg {
    public String printMessage(String value);
}

public class LambdaWithReturnTypeWithArg {
    public static void main(String[] args) {

//        MessengerWithReturnTypeWithArg obj = (arg) -> {
//            return "hello "+arg;
//        };

        // or
        MessengerWithReturnTypeWithArg obj = (arg) -> "hello "+arg;

        System.out.println(obj.printMessage("people I am here to rule!"));

    }
}
