public class Main {
    public static void main(String[] args) {

    }
}

class Singleton {
    private static Singleton single_instance = null;
    public String s;

    private Singleton() {
        s = "Hello, Singleton class";
    }

    public static Singleton getInstance() {
        if (single_instance == null)
            single_instance = new Singleton();
        return single_instance;
    }
}

class Soup2 {
    private Soup2() {
    }

    private static Soup2 ps1 = new Soup2();

    public static Soup2 access() {
        return ps1;
    }
}


