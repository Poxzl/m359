package Unut6.exampels;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class FileReadingExample {
    public static void main(String[] args) throws FileNotFoundException {
        File myFile = new File("courseData.txt");
        Scanner fileIn = new Scanner(myFile);

        String teacherName = fileIn.nextLine();
        String ClassName = fileIn.nextLine();
        int periodNum = fileIn.nextInt();
        fileIn.nextLine();
        String letterGrade = fileIn.nextLine();

        System.out.println(teacherName);
        System.out.println(ClassName);
        System.out.println(periodNum);
        System.out.println(letterGrade);

    }
}
