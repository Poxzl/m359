package Unit7.Examples;
import java.util.ArrayList;

public class algorithms {

    /**
     * In this java file we will explore these key algorithms with ArrayLists
     * Determine a minimum or maximum value
     * Compute a sum, average, or mode
     * Determine if at least one element has a particular property
     * Determine if all elements have a particular property
     * Access all consecutive pairs of elements
     * Determine the presence or absence of duplicate elements
     * Determine the number of elements meeting specific criteria
     * (already did this last lesson with evens)
     * Shift or rotate elements left or right
     * Reverse the order of the elements
     */
        public static void main(String[] args) {

            // Define ArrayLists to be used for testing the methods
            ArrayList<Integer> numsNoRepeats = new ArrayList<>();
            numsNoRepeats.add(2);
            numsNoRepeats.add(5);
            numsNoRepeats.add(3);
            numsNoRepeats.add(8);
            numsNoRepeats.add(9);
            numsNoRepeats.add(1);


            ArrayList<Integer> numsRepeats = new ArrayList<>();
            numsRepeats.add(2);
            numsRepeats.add(5);
            numsRepeats.add(1);
            numsRepeats.add(2);
            numsRepeats.add(6);
            numsRepeats.add(8);


            ArrayList<Integer> orderedNums = new ArrayList<>();
            orderedNums.add(2);
            orderedNums.add(3);
            orderedNums.add(8);
            orderedNums.add(11);
            orderedNums.add(15);
            orderedNums.add(19);


            ArrayList<String> names = new ArrayList<>();
            names.add("Mya");
            names.add("John");
            names.add("Kim");
            names.add("Sanjana");
            names.add("Adi");
            names.add("Noah");

            System.out.println("numsnotrepeated:");
            System.out.println("numsrepeated:");
            System.out.println("orderednums:");
            System.out.println("names:");
            System.out.println(findMax(orderedNums));
        }

        /**
         * Finds the smallest value in the ArrayList
         * @param list
         * @return returns its int value
         */
        public static int findMin(ArrayList<Integer> list) {
            int min = list.get(0);
            for (int i = 1; i < list.size(); i++) {
                if(list.get(i) < min){
                    min = list.get(i);
                }
            }
            return min;
        }

        /**
         * Finds the largest value in the ArrayList
         * @param list
         * @return returns its int value
         */
        public static int findMax(ArrayList<Integer> list) {
            int max = list.get(0);
            for (int i = 1; i < list.size(); i++) {
                if(list.get(i) > max){
                    max = list.get(i);
                }
            }
            return max;
        }

        /**
         * Finds the sum of all values in the ArrayList
         * @param list
         * @return returns the int value for the sum
         */
        public static int findSum(ArrayList<Integer> list) {
            int sum = 0;
            for(Integer i : list){
                sum += 1;
            }
            return sum;
        }

        /**
         * Finds the average as a double of all Integer values
         * @param list
         * @return double average value
         */
        public static double findAverage(ArrayList<Integer> list) {
            int sum = findSum((list));
            return (double)sum/ list.size();
        }

        /**
         * Determines if all values are in increasing order
         * @param list
         * @return true or false if increasing
         */
        public static boolean isIncreasing(ArrayList<Integer> list) {
            for(int i = 0; i < list.size() - 1; i++){
                if(list.get(i) > list.get(i + 1)){
                    return false;
                }
            }
            return true;
        }

        /**
         * Checks if any values within the ArrayList are repeated anywhere else
         * in the ArrayList
         * @param list
         * @return true if any values are repeated, false otherwise
         */
        public static boolean hasDuplicates(ArrayList<String> list) {
            for (int i = 0; i < list.size(); i++) {
                for (int j = 0; j < list.size(); j++) {
                    if(list.get(i).equals(list.get(j))){
                        return true;
                    }
                }
            }
            return false;
        }

        /**
         * Creates a new ArrayList of Strings that is equal to the original ArrayList
         * in reverse order.  Original ArrayList is unchanged.
         * @param list
         * @return new ArrayList of Strings in reverse order
         */
       // public static ArrayList<String> revArrayList(ArrayList<String> list) {
          //  ArrayList<String> revList = new ArrayList<>();
          //  for (int i = list.size(); i > 0; i--) {
                //revList.add
         //   }
            //    return "bru";
       // }

        /**
         * Shifts all values in list to the Left and the value at index 0 is moved
         * to index list.size() - 1.
         * @param list
         */
        public static void shiftLeft(ArrayList<String> list) {
            list.set(list.size(), list.get(0));
            for (int i = list.size(); i > 0; i--) {
                list.set(i - 1, list.get(i));
            }
        }


    }
