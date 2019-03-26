    public static stdInfo[][] partition(stdInfo[] input, int low, int high) {
        stdInfo[][] oPut = new stdInfo[3][input.length];
        int ColIdx[] = new int[3];
        for (stdInfo n : input) {
            if (n != null) {
                if (n.age < low) {
                    oPut[0][ColIdx[0]++] = n;
                } else if (n.age >= low && n.age < high) {
                    oPut[1][ColIdx[1]++] = n;
                } else if (n.age >= high) {
                    oPut[2][ColIdx[2]++] = n;
                }
            }
        }

        return oPut;
    }