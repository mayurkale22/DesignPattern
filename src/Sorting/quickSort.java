package Sorting;

/**
 * Created by mayurkale on 9/30/15.
 */
public class quickSort {

    int[] arr;
    private int length;

    void sort(int[] a) {
        if (a.length == 0 || a == null){
            return;
        }

        this.arr = a;
        length = a.length;
        quick(0, length - 1);

    }

    void quick(int startIndex, int endIndex) {

        int i = startIndex;
        int j = endIndex;
        int pivot = arr[startIndex+(endIndex-startIndex)/2];

        while (i <= j) {

            while (arr[i] < pivot) {
                i++;
            }

            while (arr[j] > pivot) {
                j--;
            }

            if (i<=j) {
                exchnage(i, j);
                i++;
                j--;
            }
        }

        if (startIndex < j){
            quick(startIndex, j);
        }
        if (i< endIndex) {
            quick(i, endIndex);
        }
    }

    void exchnage(int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        int[] a = {45, 3, 67, 4, 15, 1, 5, 9, 100, 10, 34, 23, 69};
        quickSort q = new quickSort();
        q.sort(a);

        for(int i:a){
            System.out.print(i);
            System.out.print(" ");
        }
    }

}


