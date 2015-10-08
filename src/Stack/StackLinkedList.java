package Stack;

/**
 * Created by mayurkale on 10/4/15.
 */
public class StackLinkedList<T> implements StackArray<T> {

    int total = 0;
    Node first = null;
    public class Node {
        public T item;
        public Node next;
    }

    StackLinkedList() {}

    public StackLinkedList<T> push(T item) {
        Node Current = first;
        first = new Node();
        first.item = item;
        first.next = Current;
        total++;
        return this;
    }

    public T pop() {
        if (first == null) new java.util.NoSuchElementException();
        T item = first.item;
        first = first.next;
        total--;
        return item;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public static void main(String[] args) {
        StackLinkedList stack = new StackLinkedList();
        stack.push("M");
        stack.push("A");

        while (! stack.isEmpty()) {
            System.out.println("stack = " + stack.pop().toString());
        }
    }
}
