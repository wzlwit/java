package javaapplication3;

public class JavaApplication3 {

    public static void funcRec(int u, char v) //Line 1
    {
        if (u == 0) //Line 2
        {
            System.out.print(v); //Line 3
        } else if (u == 1) //Line 4
        {
            System.out.println((char)(v + 1)); //Line 5
        } else //Line 6
        {
            funcRec(u - 1, v); //Line 7
        }
    }

    public static void main(String[] args) {
        funcRec(5,'A');    //whatever the number is, it will always be B
    }

}
