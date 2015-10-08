package Stack;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by mayurkale on 10/4/15.
 */
public class RegularExpression {

    public static void main(String[] args) {

        System.out.println("Please enter: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        System.out.println(isChecked(input));
    }


    static boolean isChecked(String input) {
        StackLinkedList stack = new StackLinkedList();

        for (int i =0; i< input.length(); i++) {
            char ch = input.charAt(i);

            if (ch == '{' || ch == '[' || ch == '(') {
                stack.push(ch);
            }

            else if (ch == '}' || ch == ']' || ch == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                    switch(ch) {
                        case '}' :
                            if (stack.pop() != '{')
                                return false; break;
                        case ']' :
                            if (stack.pop() != ']')
                                return false; break;
                        case ')' :
                            if (stack.pop() != '(')
                                return false; break;
                        default :
                            break;
                    }
            }
        }
        if(stack.isEmpty())
            return true;
        return false;
    }

}
