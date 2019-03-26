package insertionsort;

public class InsertionSort {
//created by Zhaolong WANG

    public static void insertionSort(int[] ary) {
        int temp;
        for (int i = 1; i < ary.length; i++) {
            for (int j = i; j > 0; j--) {
                if (ary[j] < ary[j - 1]) {
                    temp = ary[j];
                    ary[j] = ary[j - 1];
                    ary[j - 1] = temp;
                }
            }
        }
    }

    public static void printAry(int[] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        int[] input = {9, 7, 6, 5, 4, 3};
        insertionSort(input);
        printAry(input);
    }
}