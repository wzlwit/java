public class Calculator {

    public static void main(String[] args) {

        int[] ary = {98, 72, 96, 2, 34, 56, 42, 43, 76, 9, 6, 14};
        for (int j = 0; j < ary.length - 1; j++) {
            for (int i = 0; i < ary.length - 1; i++) {

                if (ary[i] > ary[i + 1]) {
                    ary[i] = ary[i] + ary[i + 1];
                    ary[i + 1] = ary[i] - ary[i + 1];
                    ary[i] = ary[i] - ary[i + 1];
                }
            }
        }
        for (int i = 0; i < ary.length - 1; i++) {
            System.out.println(ary[i]);
        }
    }
}