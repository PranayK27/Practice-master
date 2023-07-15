public class FixedSizeArrayStack {
    protected int capacity;

    public static final int CAPACITY = 16; // power of 2

    protected int[] stackArray;

    protected int top = -1;

    public FixedSizeArrayStack() {
        this(CAPACITY); // default capacity
    }

    public FixedSizeArrayStack(int cap) {
        capacity = cap;
        stackArray = new int[capacity];
    }

    public int size() {
        return (top + 1);
    }

    public boolean isEmpty() {
        return (top < 0);
    }

    public void push(int data) throws Exception {
        if (size() == capacity)
            throw new Exception("Stack is full.");
        stackArray[++top] = data;
    }

    public int top() throws Exception {
        if (isEmpty())
            throw new Exception("Stack is empty.");
        return stackArray[top];
    }

    public int pop() throws Exception {
        int data;
        if (isEmpty())
            throw new Exception("Stack is empty.");
        data = stackArray[top];
        stackArray[top--] = Integer.MIN_VALUE;
        return data;
    }

    public String toString() {
        String s;
        s = "[";
        if (size() > 0)
            s += stackArray[0];
        if (size() > 1)
            for (int i = 1; i <= size() - 1; i++) {
                s += ", " + stackArray[i];
            }
        return s + "]";
    }

    public static void main(String args[]) throws Exception {
        FixedSizeArrayStack myStack = new FixedSizeArrayStack(2);
        myStack.push(5);
        myStack.push(8);

        System.out.println("*********************Fixed Stack Array Implementation*********************");
        System.out.println("Print stack elements before pop(): " + myStack.toString());
        System.out.println("Size of stack : " + myStack.size());
        System.out.println("Pop element from Stack : " + myStack.pop());
        System.out.println("Pop element from Stack : " + myStack.pop());
        System.out.println("Pop element from Stack : " + myStack.pop());

        System.out.println("Print stack elements after opo() : " + myStack.toString());
    }
}
