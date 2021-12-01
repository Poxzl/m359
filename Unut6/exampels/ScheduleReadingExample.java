package Unut6.exampels;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class ScheduleReadingExample {
    public static void main(String[] args) throws FileNotFoundException {
        File myFile = new File("scheduleData.txt");
        Scanner fileIn = new Scanner(myFile);

        int numstud = fileIn.nextInt();
        fileIn.nextLine();
        Student[] myStudents = new Student[numstud];
        int studentCount = 0;
        while (fileIn.hasNextLine()){
            String studentName = fileIn.nextLine();
            course[] allClasses = new course[8];


            for (int i = 0; i < 8; i++) {
                String teacher = fileIn.nextLine();
                String className = fileIn.nextLine();
                String letterGrade = fileIn.nextLine();
                int per = fileIn.nextInt();
                if(fileIn.hasNextLine()){
                    fileIn.nextLine();
                }
                course c = new course(teacher, className, letterGrade, per);
                allClasses[i] = c;
            }
            myStudents[studentCount] = new Student(studentName, allClasses);
            studentCount++;
        }
    printStudSched(myStudents);
    }
    public static void printStudSched(Student[] allStudents){
        for(Student s: allStudents){
            if(s != null){
                System.out.println(s);
                System.out.println();
            }
        }
    }
}
