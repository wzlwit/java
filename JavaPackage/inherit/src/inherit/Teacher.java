package inherit;

public class Teacher extends Person {

    private int grade;

    public void Teacher() {
        grade = 5;
    }

    public void Teacher(int ag, int sl, int exp) {
        grade = exp;

    }

    public int getGrd() {
        return grade;
    }
}
