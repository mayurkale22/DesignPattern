package VendingMachine;

import java.util.*;

/**
 * Created by mayurkale on 10/10/15.
 */
public class VendingMachine {
    static int[] dimens = {25, 10, 5, 1};
    static List res = new ArrayList();

    public static void main(String[] args) {
        System.out.println("Please enter number: ");
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.next());

        makeChange(input);
    }

    static void makeChange(int num) {
        int dimen_length = dimens.length;
        for (int index = 0; index < dimen_length; index++)
            num = makeChange(num,index);

        Iterator i = res.iterator();
        while(i.hasNext())
            System.out.println(i.next());

    }
    
    static int makeChange(int num, int index) {
        if (num >= dimens[index]) {
            int reminder = num / dimens[index];
            num = num % dimens[index];

            while (reminder > 0) {
                res.add(dimens[index]);
                reminder--;
            }
        }
        return num;
    }
    
}































