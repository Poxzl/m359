package Unit3_Booleans.wxamples;

public class StudentDriver {
    public static void main(String[] args) {
        Studentsss st1 = new Studentsss("Alice", "Smith", 121);
        Studentsss st2 = new Studentsss("Aldee", "Smither", 121);


        System.out.println(st1.equals(st2));
        System.out.println(st1.compareTo(st2));
    }
}
