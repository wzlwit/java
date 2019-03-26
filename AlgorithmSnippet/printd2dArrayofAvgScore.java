    public static void main(String[] args) {

        int[][] numAry = {{70, 75, 80,}, {80, 60, 65}, {70, 68, 72}};
        for (int i = 0; i < numAry.length; i++) {
            int sum = numAry[i][0];
            for (int j = 1; j < numAry[i].length; j++) {
                sum += numAry[i][j];
            }
            int avg=(numAry[i].length==0)? 0:sum/numAry[i].length;
            System.out.println("Student " + i + " Average is: " + avg);
        }

    }