package algrithm;
//created by Zhaolong WANG

public class algrithm {

    public void swap(int first, int second) {
        first = first + second;
        second = first - second;
        first = first - second;
    }
    
    public void printAry(int[] ary){
                
    }
    public static void main(String[] args) {
        int[] aryInt1d = {24, 2, 45, 20, 56, 75, 2, 56, 99, 53, 12,43,87};

        Alg.testQuickSort(aryInt1d);
        
        //int max = Recur.recurMax(aryInt1d, 0, aryInt1d.length - 1);
        //System.out.println("The max is: " + max);
    }
}
