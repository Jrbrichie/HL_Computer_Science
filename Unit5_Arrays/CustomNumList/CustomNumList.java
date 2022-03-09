package Unit5_Arrays.CustomNumList;
import java.util.ArrayList;

public class CustomNumList {

    private ArrayList<Integer> numList;

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
            System.out.println(n);
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
            for(int i = 0; i < numList.size(); i++){
                int highestCount = 0;
                int currentCount = 0;
                for(int j = i + 1; j < numList.size(); j++){
                    if(numList.get(j) == numList.get(i)){
                        currentCount++;
                    }
                    if(currentCount > highestCount){
                        highestCount = currentCount;
                        highestCountIndex = j;
                    }
                }
            }

            int[] occursMost = new int[highestCountIndex];
            for(int i = 0; i < highestCountIndex; i++){
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
        int[] zeroesAtEnd = new int[numList.size()];
        for(int i = 0; i < numList.size(); i++){
            if(numList.get(i) == 0){
                numList.remove((Integer)0);
                numList.add(0);
            }
        }
        for(int i = 0; i < numList.size();i++){
            zeroesAtEnd[i] = numList.get(i);
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
        ArrayList<Integer> unique = new ArrayList<Integer>();
        for(int i = 0; i < numList.size();i++){
            for(int j = i + 1; j < numList.size();){
                if(numList.get(i) == numList.get(j)){
                    numList.remove(j);
                } j++;
            }
        }
        unique = numList;
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
        ArrayList<Integer> newList = new ArrayList<Integer>();
        if(!numList.isEmpty()){
            newList.addAll(numList);
            int j = 0;
            for(int i = index; j < arr.length; i++){
                newList.add(i, arr[j]);
                j++;
            }
        }
        return newList;
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
        ArrayList<Integer> combined = new ArrayList<Integer>();
        combined.addAll(numList);
        combined.addAll(list2);
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
        for(int num : numList){
            if(num % 2 == 0){
                evens.add(num);
            }
        }
        return evens;
    }

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
        ArrayList<Integer> highests = new ArrayList<Integer>();
        if(!numList.isEmpty()){
            int highest = numList.get(0);
            int appearances = 0;
            for(int i = 1; i < numList.size(); i++){
                if(numList.get(i) > highest){
                    appearances = 0;
                    highest = numList.get(i);
                    for(int j = i + 1; j < numList.size(); j++){
                        if(numList.get(j) == highest){
                            appearances++;
                        }
                    }

                    for(int j = 0; j < numList.size(); j++){
                        highests.add(highest);
                    }
                }
            }
        } return highests;
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
