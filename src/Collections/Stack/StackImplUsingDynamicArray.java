public class StackImplUsingDynamicArray {
    /** The max size of the Stack */
    private int maxSize;
    /** The array representation of the Stack */
    private int[] stackArray;
    /** The top of the stack */
    private int top;

    /**
     * Constructor
     *
     * @param size
     *            Size of the Stack
     */
    public StackImplUsingDynamicArray(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    /**
     * Adds an element to the top of the stack
     *
     * @param value
     *            The element added
     */
    public void push(int value) {
        if (!isFull()) { // Checks for a full stack
            top++;
            stackArray[top] = value;
        } else {
            resize(maxSize * 2);
            push(value);// don't forget push after resizing
        }
    }

    /**
     * Removes the top element of the stack and returns the value you've removed
     *
     * @return value popped off the Stack
     */
    public int pop() {
        if (!isEmpty()) { // Checks for an empty stack
            return stackArray[top--];
        }

        if (top < maxSize / 4) {
            resize(maxSize / 2);
            return pop();// don't forget pop after resizing
        } else {
            System.out.println("The stack is already empty");
            return -1;
        }
    }

    /**
     * Returns the element at the top of the stack
     *
     * @return element at the top of the stack
     */
    public int peek() {
        if (!isEmpty()) { // Checks for an empty stack
            return stackArray[top];
        } else {
            System.out.println("The stack is empty, cant peek");
            return -1;
        }
    }

    private void resize(int newSize) {
        int[] transferArray = new int[newSize];

        for (int i = 0; i < stackArray.length; i++) {
            transferArray[i] = stackArray[i];
            stackArray = transferArray;
        }
        maxSize = newSize;
    }

    /**
     * Returns true if the stack is empty
     *
     * @return true if the stack is empty
     */
    public boolean isEmpty() {
        return (top == -1);
    }

    /**
     * Returns true if the stack is full
     *
     * @return true if the stack is full
     */
    public boolean isFull() {
        return (top + 1 == maxSize);
    }

    /**
     * Deletes everything in the Stack
     *
     * Doesn't delete elements in the array but if you call push method after
     * calling makeEmpty it will overwrite previous values
     */
    public void makeEmpty() { // Doesn't delete elements in the array but if you
        top = -1; // push method after calling makeEmpty it will overwrite
        // previous values
    }

    public static void main(String args[]) {
        StackImplUsingDynamicArray myStack = new StackImplUsingDynamicArray(2); // Declare a stack of
        // Populate the stack
        myStack.push(5);
        myStack.push(8);
        myStack.push(2);
        myStack.push(9);

        System.out.println("*********************Stack Array Implementation*********************");
        System.out.println(myStack.isEmpty()); // will print false
        System.out.println(myStack.isFull()); // will print true
        System.out.println(myStack.peek()); // will print 9
        System.out.println(myStack.pop()); // will print 9
        System.out.println(myStack.peek()); // will print 2
    }
}
