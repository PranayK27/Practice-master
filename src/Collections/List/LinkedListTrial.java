package Collections.List;

public class LinkedListTrial {
    public static void main(String[] args) {
        java.util.LinkedList<String> linkedList = new java.util.LinkedList<>();
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");
        linkedList.add("E");
        linkedList.add("F");
        linkedList.addLast("Z");
        linkedList.addFirst("A");
        System.out.println("Elements: "+linkedList);

        linkedList.remove("F");
        linkedList.remove(2);
        System.out.println("After delete: "+linkedList);

        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("After deleting 1st and last: "+linkedList);

        String val = linkedList.get(2);
        linkedList.set(2, val+" Changed");
        System.out.println(linkedList+" after changes.");
    }
}
