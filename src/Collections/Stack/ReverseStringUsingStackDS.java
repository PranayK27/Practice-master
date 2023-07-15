public class ReverseStringUsingStackDS {

    public String reverseWord(String word) {

        StringBuilder stringBuilder = new StringBuilder();
        int size = word.length();
        StackArray stack = new StackArray(size);
        for(char c : word.toCharArray()){
            stack.push(c);
        }
        while (!stack.isEmpty()) {
            stringBuilder.append(stack.pop());
        }
        return stringBuilder.toString();
    }

    public static void main(String a[]) {
        ReverseStringUsingStackDS mwr = new ReverseStringUsingStackDS();
        System.out.println("pranay == " + mwr.reverseWord("pranay"));
        System.out.println("livedata == " + mwr.reverseWord("livedata"));
        System.out.println("program == " + mwr.reverseWord("program"));
    }

    class StackArray {
        private int stackSize;
        private char[] stackArr;
        private int top;

        /**
         * constructor to create stack with size
         * @param size
         */
        public StackArray(int size) {
            this.stackSize = size;
            this.stackArr = new char[stackSize];
            this.top = -1;
        }

        /**
         * This method adds new entry to the top of the stack
         *
         * @param entry
         * @throws Exception
         */
        public void push(char entry) {
            this.stackArr[++top] = entry;
        }

        /**
         * This method removes an entry from the top of the stack.
         *
         * @return
         * @throws Exception
         */
        public char pop() {
            char entry = this.stackArr[top--];
            return entry;
        }

        /**
         * This method returns top of the stack without removing it.
         *
         * @return
         */
        public char peek() {
            return stackArr[top];
        }

        /**
         * This method returns true if the stack is empty
         *
         * @return
         */
        public boolean isEmpty() {
            return (top == -1);
        }

        /**
         * This method returns true if the stack is full
         *
         * @return
         */
        public boolean isFull() {
            return (top == stackSize - 1);
        }
    }
}
