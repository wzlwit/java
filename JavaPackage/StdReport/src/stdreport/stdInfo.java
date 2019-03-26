package stdreport;

public class stdInfo {

//to simplify, just use public, otherwise will use private or protected
    public String lName;
    public String fName;
    public int age;
    public int nameL;

    public stdInfo(String ln, String fn, int s) {
        lName = ln;
        fName = fn;
        age = s;
        nameL = lName.length() + fName.length() + 3; //this assignment must be inside constructor, otherwise NoPointerException
    }

    public String pInfo() {
        String fmt = "%-" + StdReport.nameLength + "s%d";
        return String.format(fmt, lName + " " + fName + ": ", age);
    }

}
