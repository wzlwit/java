package stdreport;

import java.io.*;
import java.util.*;

public class StdReport {
static int nameLength=0;
    public static stdInfo[][] partition(stdInfo[] input, int... pvt) {
        int r = pvt.length, c = input.length;
        stdInfo[][] oPut = new stdInfo[r + 1][c];
        int ColIdx[] = new int[r + 1];
        for (stdInfo n : input) {
            if (n != null) {
                for (int i = 0; i <= r; i++) {
                    if (i == 0 && n.age < pvt[0] || i == r && n.age >= pvt[r - 1]) {
                        oPut[i][ColIdx[i]] = n;
                        ColIdx[i]++;
                    } else if (i > 0 && n.age >= pvt[i - 1] && n.age < pvt[i]) {
                        //in this way, must include i>0, otherwise will IdexOutBoundException
                        oPut[i][ColIdx[i]++] = n;
                        ColIdx[i]++;
                    }
                }
            }
        }
        return oPut;
    }

    public static stdInfo[] aryReader(Scanner inFile, int amountOfStudent) {
        stdInfo[] std = new stdInfo[amountOfStudent];
        for (int i = 0; i < amountOfStudent && inFile.hasNext(); i++) {
            std[i] = new stdInfo(inFile.next(), inFile.next(), inFile.nextInt());
            std[i].nameL=std[i].lName.length()+std[i].fName.length()+3;
            nameLength=(nameLength<std[i].nameL)? std[i].nameL:nameLength;
        }
        return std;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner inputFile = new Scanner(new FileReader(
                "G:\\SessionII\\Java\\StdReport\\src\\stdreport\\StdAge.txt"));
        stdInfo[] stdAry = aryReader(inputFile, 12);
 /*       
        for (stdInfo p : stdAry) {
            if (p != null) {
                System.out.println(p.pInfo());
            }

        }
        System.out.println();
*/
        stdInfo[][] stdCtg = partition(stdAry, 18, 65);

        for (int i = 0; i < stdCtg.length; i++) {

            switch (i) {
                case 0:
                    System.out.println("Minors:");
                    break;
                case 1:
                    System.out.println("Adults:");
                    break;
                case 2:
                    System.out.println("Seniors:");
                    break;
            }

            for (stdInfo m : stdCtg[i]) {
                if (m != null) {
                    System.out.println(m.pInfo());
                }
            }

            System.out.println();
        }

        inputFile.close();
        System.exit(0);
    }

}
