package algrithm;

public class Alg {

    public static void swap(int[] inAry, int i, int j) {//i, j for index
        inAry[i] = inAry[i] + inAry[j];
        inAry[j] = inAry[i] - inAry[j];
        inAry[i] = inAry[i] - inAry[j];
        printAry(inAry, i, j);

    }

    public static void quickSortAsc(int[] inAry, int indx1, int indx2) {
        //this is the best way of doing quick sort.
        //bucket sorting is similar, but need to declare arrays as bucket, so worse than this quick sort.

        int i = indx1;
        int j = indx2;

        // pdx = indx1;
        // int pdx = (i + j) / 2;
        int pdx = (int) ((indx2 - indx1) * Math.random() + indx1);
        //Random r = new Random();int pdx = r.nextInt(indx2 - indx1) + indx1;

        int pvt = inAry[pdx]; //must assign this value to a 3rd varialbe. because it may change in some methods
        while (i < j) {
            while (inAry[i] <= pvt && i < indx2) {
                i++;
            }
            while (inAry[j] >= pvt && j > indx1) {
                j--;
            }
            //if using <= and >=, boundry must be limited
            //if no =, boundry no checked, but more loops may be needed

            if (i == j) {

                i++;
                j--;
            } else if (i < j) {
                // or declare another variable for swapping
                swap(inAry, i, j);
                i++;
                j--;
            }
        }
        if (inAry[pdx] > inAry[i - 1]) {
            swap(inAry, indx1, i - 1);
        }
        if (indx1 < j) {
            quickSortAsc(inAry, indx1, j);
            //when j-i==1, after ++, j<i;
        }
        if (i < indx2) {
            quickSortAsc(inAry, i, indx2);
        }
    }

    public static void testQuickSort(int[] ary) {
        printAry(ary, -1, -1);
        System.out.println();
        quickSortAsc(ary, 0, ary.length - 1);
    }

    public static void printAry(int[] input, int l, int r) {
//l,r indicate the members to be enclosed by []
        int index = 0;
        for (int i : input) {

            if (index == l || index == r) {
                System.out.print("[" + i + "]");
            } else {
                System.out.print(" " + i + " ");
            }
            index++;
        }
        System.out.println();
    }
}
