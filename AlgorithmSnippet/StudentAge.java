package studentage;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class StudentAge {

    public static void AgeSplit(Scanner inFile, int amountOfStudent) {
        String[][] std = new String[amountOfStudent][2];
        while (inFile.hasNext()) {
            for (int i = 0; i < amountOfStudent; i++) {
                std[i][0] = inFile.next() + " " + inFile.next();
                std[i][1] = inFile.next();
            }
        }
        inFile.close();
        System.out.println("Minors:");
        for (int i = 0; i < std.length; i++) {
            if (Integer.parseInt(std[i][1]) < 18) {
                 System.out.printf("%-15s: %s\n",std[i][0] ,std[i][1]);
            }
        }
        System.out.println("\nAdults:");
        for (int i = 0; i < std.length; i++) {
            int age = Integer.parseInt(std[i][1]);
            if (age >= 18 && age < 65) {
                System.out.printf("%-15s: %s\n",std[i][0] ,std[i][1]);
            }
        }
        System.out.println("\nSeniors:");
        for (int i = 0; i < std.length; i++) {
            int age = Integer.parseInt(std[i][1]);
            if (age >= 65) {
                 System.out.printf("%-15s: %s\n",std[i][0] ,std[i][1]);
            }
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner inputFile =new Scanner(new FileReader("G:\\code\\StudentAge\\src\\studentage\\StdAge.txt"));
        AgeSplit(inputFile,11);
    }

}
