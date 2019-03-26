package algrithm;

public class Recur {

    public static int recurMax(int[] ary, int sIndx, int eIndx) {
        int max = 0;
        if (eIndx == sIndx) {
            max = ary[sIndx];

        } else {
            max = recurMax(ary, sIndx, eIndx - 1);
            if (ary[eIndx] > max) {
                max = ary[eIndx];
            }
        }
        return max;
    }
}
