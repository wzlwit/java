public class LabEx1 {
//by Zhaolong Wang

    public static int[] find(int[][] input) {
        int ary[] = new int[input.length * input[0].length];
//if ragged 2d array, have to find the max ary[i].length
        int k = 0;
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                if (input[i][j] < 60) {
                    ary[k++] = input[i][j];
                }
            }
        }
        int out[] = new int[k];
        for (int i = 0; i < k; i++) {
            out[i] = ary[i];
        }
        return out;
    }

    public static void printAry(int[] input) {
        System.out.println("The scores below(<) 60 are: ");
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        int[][] score = {{88, 99, 77, 43}, {73, 58, 66, 92},
        {53, 77, 61, 56}, {87, 67, 55, 83}};
        printAry(find(score));
    }
}