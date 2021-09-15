package Unit2_UsingObjects.examples;
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("lol whats your name?");
        String name = input.nextLine();

        System.out.println("lol your name is " + name);

        int age = input.nextInt();

        System.out.println("lol whats your age?");

        System.out.println("lol your age is " + age);


    }
}
