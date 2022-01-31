package Unit7.Examples;

import java.util.ArrayList;

public class InsertionSortExample {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(3);
        nums.add(4);
        nums.add(1);
        nums.add(6234);
        nums.add(4);
        insertionSort(nums);
    }

    public static void insertionSort(ArrayList<Integer> list){
        for (int i = 1; i < list.size(); i++) {
            Integer valueToInsert = list.get(i);
            int pos = i;
            while(pos > 0 && list.get(pos - 1) > valueToInsert){
                list.set(pos, list.get(pos - 1));
                pos--;
            }

            list.set(pos, valueToInsert);
        }
        System.out.println(list);
    }
}
