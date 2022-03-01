package Unit5_Arrays;

public class TestCustomArray {
    public static void main(String[] args) {
        CustomArray ca = new CustomArray();

        /**
         * Manipulates integer array
         */
        int[] numArray = {23, 34, 23, 45, 56, 67, 78, 90};

        System.out.println("Num Search: ");
        System.out.println(ca.search(numArray, 23));


        System.out.println();
        System.out.println("Sub Array: ");
        int[] subArray = ca.getSubArray(numArray, 2, 5);
        for (int i = 0; i < subArray.length; i++) {
            System.out.print(subArray[i] + " ");
        }

        System.out.println();
        System.out.println();
        System.out.println("Random number: ");
        System.out.println(ca.getRandomNum(numArray));

        System.out.println();
        System.out.println("Make evens array: ");
        int[] evenArray = ca.makeEvensArray(numArray);
        for (int i = 0; i < evenArray.length; i++) {
            System.out.print(evenArray[i] + " ");
        }

        System.out.println();
        System.out.println();
        System.out.println("Is there a duplicate? ");
        System.out.println(ca.isThereDuplicate(numArray));


        /**
         * Manipulates String arrays
         */
        System.out.println();
        System.out.println();
        String[] words = {"program", "general", "encode", "plus", "mississippi"};
        System.out.println("Number of vowels: ");
        int[] vowArr = ca.getNumOfVowels(words);
        for (int i = 0; i < vowArr.length; i++) {
            System.out.print(vowArr[i] + " ");
        }

        System.out.println();
        System.out.println();
        System.out.println("Reversed: ");
        String[] revArr = ca.reverseWords(words);
        for (int i = 0; i < revArr.length; i++) {
            System.out.print(revArr[i] + " ");
        }


        System.out.println();
        System.out.println();
        String[] texts = {"ba", "be", "bi", "bo", "bu"};
        System.out.println("Shift one: ");
        String[] shifted = ca.shiftOne(texts);
        for (int i = 0; i < shifted.length; i++) {
            System.out.print(shifted[i] + " ");
        }

        System.out.println();
        System.out.println();
        System.out.println("Swap words: ");
        String[] animals = {"cat", "dog", "hog", "owl", "pup", "kid", "pig"};
        String[] swapped = ca.swapWords(animals);
        for (int i = 0; i < swapped.length; i++) {
            System.out.print(swapped[i] + " ");
        }
        System.out.println(" ");
    }
}
