package Stack;

/**
 * Created by mayurkale on 10/4/15.
 */
public class TheStack {
    int[] stackArray;
    int maxSize;
    int top;
    TheStack(int size) {
        stackArray = new int[size];
        maxSize = size;
        top = -1;
    }

    void push(int item) {
        if ((top < maxSize-1))
            stackArray[++top] = item;
    }

    int pop() {
        if (top != -1)
            return stackArray[top--];

        throw new java.lang.ArrayIndexOutOfBoundsException();
    }

    int peek() {
        return stackArray[top];
    }

    boolean isEmpty() {
        return (top == -1);
    }

    public static void main(String[] args) {

        TheStack stack = new TheStack(1);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        while (! stack.isEmpty()){
            int item = stack.pop();
            System.out.println("item = " + item);
        }
    }
}
