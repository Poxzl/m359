package Unut6.exampels;

public class StudentTester {
    public static void main(String[] args) {
        String name = "";
        course per1 = new course("Junge", "math", "B-", 1);
        course per2 = new course("Jusyedk", "renglif", "a", 2);
        course per3 = new course("moon", "mcompscih", "a-", 3);
        course per4 = new course("Jlinch", "rlinchf", "c", 4);
        course per5 = new course("Jeberge", "chemsh", "g-", 5);
        course per6 = new course("Jnewby", "rgymmf", "B", 6);
        course per7 = new course("sotoe", "mgemrna", "B+", 7);
        course per8 = new course("Jkarasch", "rengineering", "B-", 8);

        course[] sched = {per1, per2, per3, per4, per5, per6, per7, per8};

        Student s1 = new Student(name, sched);
        System.out.println(s1);
    }
}
