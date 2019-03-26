    public static void decToBin(int num, int base) {
        if (num == 0) {
            System.out.print(0);
        } else if (num > 0) {
            decToBin(num / base, base);
            System.out.print(num % base);
        }
    }