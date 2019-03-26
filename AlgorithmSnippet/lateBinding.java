package myEx;

public class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Employee staff = new Ch("Spider");
        System.out.println(staff.getName());
    }
}

class Ch extends Employee {
    public Ch(String name) {
        super(name);

    }

    public String getName() {
        System.out.println("this is subclass");
        return super.getName();

    }
}
/* output:
this is subclass
Spider
 */
