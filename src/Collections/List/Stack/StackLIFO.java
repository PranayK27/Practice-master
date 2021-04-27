package Collections.List.Stack;

import java.util.Stack;

public class StackLIFO {

    public static void main(String[] args) {
        Stack<String> s = new Stack<>();
        s.push("A");
        s.push("B");
        s.push("C");
        System.out.print("Next: "+ s.peek());
        s.push("D");
        System.out.println(s.pop());
        s.push("E");
        s.push("F");

        int pos = s.search("E");
        if (pos>=1)
            System.out.println("found at: "+pos);
        else
            System.out.println("not found");
        System.out.println(s);
    }
}
