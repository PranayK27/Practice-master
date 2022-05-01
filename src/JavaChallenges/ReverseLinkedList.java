package JavaChallenges;

import java.util.StringJoiner;

class LinkedList<T>{
    Node head;

    private class Node{
        final T value;
        Node next;

        Node(T value, Node next){
            this.value = value;
            this.next = next;
        }
    }

    public void add(T value){
        Node node = new Node(value, null);
        if (head == null){
            head = node;
        } else {
            Node last = head;
            while(last.next != null){
                last = last.next;
            }
            last.next = node;
        }
    }

    @Override
    public String toString(){
        StringJoiner stringJoiner = new StringJoiner("->", "[", "]");
        Node last = head;
        while(last!=null){
            stringJoiner.add(last.value.toString());
            last = last.next;
        }
        return stringJoiner.toString();
    }
    public void reverse(){
        if (head == null)
            return;

        Node prev = null;
        Node current = head;
        Node next = null;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }
}
public class ReverseLinkedList {
    public static void main(String args[]){
        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);

        System.out.println(linkedList);

        linkedList.reverse();
        System.out.println(linkedList);
    }
}
