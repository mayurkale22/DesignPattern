package Queue;

/**
 * Created by mayurkale on 10/7/15.
 */
public class QueueLinkedList<T> implements Queue<T>{

    private int total;
    private Node first, last;

    private class Node {
        private T item;
        private Node next;
    }

    QueueLinkedList(){}

    @Override
    public Queue<T> enqueue(T ele) {
        Node Current = last;
        last = new Node();
        last.item = ele;

        if (total++ ==0) first = last;
        else Current.next = last;

        return this;
    }

    @Override
    public T dequeue() {
        if (total == 0) throw new java.util.NoSuchElementException();
        T ele = first.item;
        first = first.next;
        if (--total == 0) last = null;
        return ele;
    }
}
