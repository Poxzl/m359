package Unit8.examples;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class MethodWritingPractice {
    public static void main(String[] args) {
        int[] arr1 = {9, 7, 23, 5};
        int[] arr2 = {29, 11, 22, 20};
        int[] arr3 = {15, 19, 21, 7};
        int[][] myNums = {arr1, arr2, arr3};

        showArray(myNums);

        System.out.println(getAverage(myNums));

        int count = getEvenRowCount(myNums);
        System.out.println(count);

        System.out.println(getEvenColumnCount(myNums));
    }


    public static void showArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }




    public static double getAverage(int[][] arr){
        int count = 0;
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                count++;
                total += arr[i][j];
            }
        }
        return ((double) total/ count);
    }

    public static int getEvenRowCount(int[][] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j] % 2 == 0){
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    public static int getEvenColumnCount(int[][] arr){
        int count = 0;
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[j][i] % 2 == 0){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
