import java.util.Iterator;
import java.util.Stack;

public class StackReversal {

    public static <T> void reverseStack(Stack<T> stack) {
        if (stack.isEmpty()) {
            return;
        }
        // Remove bottom element from stack
        T bottom = popBottom(stack);

        // Reverse everything else in stack
        reverseStack(stack);

        // Add original bottom element to top of stack
        stack.push(bottom);
    }
    private static <T> T popBottom(Stack<T> stack) {
        T top = stack.pop();
        if (stack.isEmpty()) {
            // If we removed the last element, return it
            return top;
        } else {
            // We didn't remove the last element, so remove the last element from what remains
            T bottom = popBottom(stack);
            // Since the element we removed in this function call isn't the bottom element,
            // add it back onto the top of the stack where it came from
            stack.push(top);
            return bottom;
        }
    }

    private static <T> void printStack(Stack<T> stack){
        Iterator<T> iterator = stack.iterator();
        while (iterator.hasNext()) {
            T t = (T) iterator.next();
            System.out.println(t);
        }
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("Stack elements before reverse");
        printStack(stack);
        StackReversal reversal = new StackReversal();
        reversal.reverseStack(stack);

        System.out.println("Stack after before reverse");
        printStack(stack);

        Stack<String> stack1 = new Stack<>();
        stack1.push("a");
        stack1.push("b");
        stack1.push("c");
        stack1.push("d");

        System.out.println("Stack elements before reverse");
        printStack(stack1);
        reversal.reverseStack(stack1);

        System.out.println("Stack after before reverse");
        printStack(stack1);
    }
}
