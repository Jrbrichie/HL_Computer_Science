package Unit5_Arrays.CustomNumList;

import java.util.ArrayList;

/**
 * @author: maanderson, 01/03/22
 */
class TestCustomNumList {
    public static void main(String[] args) {
        CustomNumList cn = new CustomNumList();
        //calls the add method 5 times
        cn.add(12);
        cn.add(0);
        cn.add(0);
        cn.add(14);
        cn.add(16);

        System.out.println("Printing contents of the arraylist...");
        cn.printList();

        System.out.println();
        System.out.println("Printing lowest number...");
        System.out.println(cn.getLowest());
        System.out.println();
        int[] odds = cn.getOddsFromList();
        for (int o: odds) {
            System.out.print(o + " ");
        }

        System.out.println("Printing common nums from list...");
        int[] commonNums = cn.getNumsFromList();
        for(int n: commonNums){
            System.out.print(n + " ");
        }
        System.out.println();

        System.out.println("ArrayList with zeros at end");
        int[] nums = cn.putZeroesAtEnd();
        for (int n : nums) {
            System.out.print(n + " ");
        }

        System.out.println();
        System.out.println();
        System.out.println("Printing unique values...");
        System.out.println(cn.getUniqueValues());


        System.out.println();
        System.out.println("Printing a sublist from index 2 to index 4...");
        int[] subList = cn.getSubList(2, 4);
        for (int n : subList) {
            System.out.print(n + " ");
        }

        System.out.println();
        System.out.println();
        int[] x = {1, 2, 3, 4, 5, 6};
        System.out.println("Inserting array to list...");
        System.out.println(cn.insertArrayInList(x, 2));


        System.out.println();
        System.out.println("Contents of the numList...");
        cn.printList();
        System.out.println();
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(5);
        list2.add(6);
        list2.add(7);
        list2.add(8);
        System.out.println();
        System.out.println("Contents of list2...");
        System.out.println(list2);
        System.out.println();
        System.out.println("Combining numList to list2 in alternate order...");
        ArrayList<Integer> combined = cn.combineList(list2);
        System.out.println(combined);

        System.out.println();
        System.out.println("Printing 5 even numbers...");
        System.out.println(cn.makeNewListOfEvens(5));

        System.out.println();
        System.out.println("Printing list of highest numbers...");
        int[] arr = {7, 4, 5, 6, 2, 4, 7, 1, 2, 7};
        ArrayList<Integer> hList = cn.getListOfHighest(arr);
        System.out.println(hList);
    }
}
