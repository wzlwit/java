package stdreport;

public class Grade {

    public static int max(int[] scr) {
        int max = scr[0];
        for (int j = 1; j < scr.length; j++) {
            max = (max < scr[j]) ? scr[j] : max;
        }
        return max;
    }



}

