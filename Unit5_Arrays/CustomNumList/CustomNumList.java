package Unit5_Arrays.CustomNumList;
import java.util.ArrayList;
import java.util.Objects;

public class CustomNumList {

    private final ArrayList<Integer> numList;

    /**
     * Constructor
     * instantiates the numList
     */
    public CustomNumList() {
        numList = new ArrayList();
    }

    /**
     * adds one element to the numList
     * appends num to end of list
     *
     * @param num
     */
    public void add(int num) {
        numList.add(num);//int will be outboxed to Integer
    }

    /**
     * prints all elements of numList
     * uses enhanced for loop
     */
    public void printList() {
        for (Object n : numList) {
            System.out.print(n + " ");
        }
    }

    /**
     * returns the lowest integer in numList
     *
     * @return
     */
    public int getLowest() {
        if(!numList.isEmpty()){
            int lowest = numList.get(0);
            for(int i = 0; i < numList.size(); i++){
                if (numList.get(i) != null) {
                    if (numList.get(i) < lowest) {
                        lowest = numList.get(i);
                    }
                }
            }
            return lowest;
        } return 0;
    }


    /**
     * creates an array of odd numbers
     * that exist in numList
     *
     * @return an array of odd numbers
     */
    public int[] getOddsFromList() {
        if(!numList.isEmpty()){
            int odd = 0;
            for(int num : numList){
                if(num % 2 == 0){
                    odd++;
                }
            }

            int[] odds = new int[odd];
            int j = 0;
            for(int i = 0; i < numList.size(); i++){
                if(numList.get(i) % 2 == 0){
                    odds[j] = numList.get(i);
                    j++;
                }
            }
            return odds;
        } return new int[0];
    }

    /**
     * creates and array that stores
     * the elements that occurs the most in the numList
     * example:
     * if numList contains 1, 2, 3, 3, 4, 3, 5, 3
     * the array that will be returned will contain 3 3 3 3*
     * @return an array the stores similar values
     *          that occurs the most in numList
     */
    public int[] getNumsFromList() {
        if(!numList.isEmpty()){
            int highestCountIndex = 0;
            int highestCount = 0;
            for(int i = 0; i < numList.size(); i++){
                int currentCount = 0;
                for(int j = i + 1; j < numList.size(); j++){
                    if(Objects.equals(numList.get(j), numList.get(i))) {
                        currentCount++;
                    }
                }
                if(currentCount > highestCount){
                    highestCount = currentCount;
                    highestCountIndex = i;
                }
            }

            int[] occursMost = new int[highestCount + 1];
            for(int i = 0; i < highestCount; i++){
                occursMost[i] = numList.get(highestCountIndex);
            }
            return occursMost;
        } return new int[0];
    }

    /**
     * creates an ArrayList from numList
     * with elements n removed
     * must use the remove method
     * @param n is element to remove
     * @return
     */
    public ArrayList<Integer> makeNumList(int n) {
        ArrayList<Integer> nRemoved = new ArrayList<Integer>();
        for (Integer integer : numList) {
            if (!(integer == n)) {
                nRemoved.add(integer);
            }
        }
        return nRemoved;
    }

    /**
     * creates an integer array from numList
     * with zeroes moved at the end of the list
     * and non-zero values are the same order
     *
     * @return an array of integers with zeroes placed at the end of list,
     * returns an array with elements the same as numList if no 0 values found
     */
    public int[] putZeroesAtEnd() {
        ArrayList<Integer> copy = new ArrayList<Integer>(numList); //so copy doesn't point to numList

        int[] zeroesAtEnd = new int[numList.size()];
        for(int i = 0; i < numList.size(); i++){
            if(numList.get(i) == 0){
                copy.remove((Integer)0);
                copy.add(0);
            }
        }
        for(int i = 0; i < numList.size();i++){
            zeroesAtEnd[i] = copy.get(i);
        }
        return zeroesAtEnd;
    }

    /**
     * creates an ArrayList of unique integers from numList
     * Example:
     * if numList contains 1, 5, 6, 6, 7, 7, 8,
     * the ArrayList returned should only store 1, 5, 6, 7, 8
     *
     * @return an ArrayList of distinct values from numList
     */
    public ArrayList<Integer> getUniqueValues() {
        ArrayList<Integer> unique = new ArrayList<Integer>(numList);

        //does not work for some reason
//        for(int i = 0; i < unique.size() - 1; i++){
//            for(int j = i + 1; j < numList.size();){
//                if(unique.get(i) == unique.get(j)) {
//                    unique.remove(j);
//                } else {
//                    j++;
//                }
//            }
//        }
        unique.remove((Integer) 0);
        return unique;
    }

    /**
     * creates an array of integers
     * from index start to index end inclusive
     *
     * @param start <= 0 and <= end
     * @param end   >= start and < length of array
     * @return an array of integers that contains elements
     * from index start to index end of numList
     */
    public int[] getSubList(int start, int end) {
        int[] subList = new int[end - start + 1];
        int j = 0;
        for(int i = start; i <= end; i++){
            subList[j] = numList.get(i);
            j++;
        }
        return subList;
    }

    /**
     * creates a new ArrayList with array arr
     * inserted at specific index in numList
     *
     * @param arr   array of integers
     * @param index valid index number in numList
     * @return an ArrayList of integers with contents of array arr
     * inserted at index in numList
     */
    public ArrayList<Integer> insertArrayInList(int[] arr, int index) {
        if(!numList.isEmpty()){
            int j = 0;
            for(int i = index; j < arr.length; i++){
                numList.add(i, arr[j]);
                j++;
            }
        }
        return numList;
    }

    /**
     * Combines the contents in numList with list2
     * in alternate manner
     * Example:
     * if numList contains 3, 4, 5, 6
     * and list2 contains 5, 6, 7, 8
     * the ArrayList returned should contain 3, 5, 4, 6, 5, 7, 6, 8
     *
     * @param list2
     * @return a new list with combined contents
     */
    public ArrayList<Integer> combineList(ArrayList<Integer> list2) {
        ArrayList<Integer> combined = new ArrayList<Integer>(numList);
        int j = 0;
        for(int i = 1; i < list2.size(); i+=2){
            combined.add(i, list2.get(j));
            j++;
        }
        return combined;
    }


    /**
     * Not-related to the list attribute
     * creates an ArrayList of even numbers
     * of n elements
     *
     * @param n number of even numbers to store in the list, size of the list
     * @return an ArrayList of even numbers, with n size
     */
    public ArrayList<Integer> makeNewListOfEvens(int n) {
        ArrayList<Integer> evens = new ArrayList<Integer>();
        //if from random integers < 100
        int rand = 0;
        while(evens.size() != 5) {
            rand = (int) (Math.random() * (100 - 1 + 1) + 1);
            if (rand % 2 == 0) {
                evens.add(rand);
            }
        }
        //if from numList
//        for(int num : numList){
//            if(num % 2 == 0){
//                evens.add(num);
//            }
//        }
        return evens;
        }

//

    /**
     * Not-related to the list attribute
     * creates and ArrayList of all the highest numbers
     * in array arr
     * Example:
     * if arr contains 7, 4, 5, 6, 2, 4, 7, 1, 2, 7
     * the ArrayList should contain 7 7 7
     *
     * @param arr integer array
     * @return an ArrayList that contains the highest numbers from array arr
     */
    public ArrayList<Integer> getListOfHighest(int[] arr) {

        //not sure why this does not work
        ArrayList<Integer> highests = new ArrayList<>();
        int highest = arr[0];
        int appearances;
        for(int i = 1; i < arr.length; i++) {
            if (arr[i] > highest) {
                highests.removeAll(highests);
                highest = arr[i];
                highests.add(arr[i]);

                if(i != arr.length - 1){
                    for (int j = i + 1; j < arr.length; j++) {
                        if (arr[j] == highest) {
                            highests.add(arr[j]);
                        }
                    }
                }
            }
        }
        return highests;
    }


}

class TestNumList {
    public static void main(String[] args) {
        CustomNumList cn = new CustomNumList();
        //calls the add method 5 times
        cn.add(12);
        cn.add(13);
        cn.add(14);
        cn.add(14);
        cn.add(16);

        //prints the contents of the arraylist
        cn.printList();

//        testing the getOddFromList
//        int[] nums = cn.getOddsFromList();
//        for (int n : nums) {
//            System.out.print(n + " ");
//        }

        int[] nums2 = cn.getNumsFromList();
        for (int n: nums2) {
            System.out.print(n + " ");
        }
    }
}
