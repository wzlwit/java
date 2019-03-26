package superclass;

public class SuperClass {

    protected int x;
    private String str;

    public void print() {
        System.out.println(x + " " + str);
    }

    public SuperClass() {
        str = "";
        x = 0;
    }

    public SuperClass(String s, int a) {
        str = s;
        x = a;
    }

    public static void main(String[] args) {
        SuperClass superObject = new SuperClass("This is superclass", 2);
        SubClass subObject = new SubClass("DDDDDD", 3, 7);
        superObject.print();
        subObject.print();
    }

}
