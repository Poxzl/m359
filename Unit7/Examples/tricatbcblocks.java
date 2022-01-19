package Unit7.Examples;

import java.util.Scanner;

public class tricatbcblocks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] myNums = {1, 2, 3, 4};

        try{
            System.out.println(myNums[4]);
            int x = myNums[56];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ERROR Index");
        }
        catch(ArithmeticException e){
            System.out.println("Cant div by 0");
        }
    }
}
