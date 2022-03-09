package Unit5_Arrays;

public class CustomArray {
    /**
     * finds the first occurrence of an integer in the integer array
     *
     * @param arr array of integers
     * @param numToSearch integer to search
     * @return index number of first occurrence of numToSearch, -1 otherwise
     */
    public int search(int[] arr, int numToSearch) { //1, 2, 1, 3, 1
        int index = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == numToSearch){
                index = i;
                break;
            }
        }
        return index;
    }

    //int arrays

    /**
     * generates a new integer array
     * from index start to index end inclusive
     *
     * @param arr   integer array
     * @param start is a start index < end index >=0
     * @param end   index >= start < arr length
     * @return and array of integers extracted from array arr
     */
    public int[] getSubArray(int[] arr, int start, int end) {
        int[] newArr = new int[end - start + 1];
        int j = 0;

        for(int i = start; i <= end; i++){
            newArr[j] = arr[i];
            j++;
        }
        return newArr;
    }

    /**
     * generates a random number from the array of integers
     *
     * @param arr integer array with length > 0
     * @return random integer from integer array
     */
    public int getRandomNum(int[] arr) {
        return arr[(int)(Math.random() * (arr.length))];
    }


    /**
     * finds all the even numbers in arr
     * stores all even numbers in a new int array
     *
     * @param arr integer array with length > 0
     * @return an array of even number with values from array arr
     * if no even number, and empty array is returned
     */
    public int[] makeEvensArray(int[] arr) {
        int evenCount = 0;

        for (int k : arr) {
            if (k % 2 == 0) {
                evenCount++;
            }
        }

        int[] evens = new int[evenCount];
        int j = 0;
        for (int k : arr) {
            if (k % 2 == 0) {
                evens[j] = k;
                j++;
            }
        }
        return evens;
    }

    /**
     * finds duplicates
     * @param nums array of integers with length > 0
     * @return true if duplicate is found, false otherwise
     */
    public boolean isThereDuplicate(int[] nums) {
        Boolean duplicate = false;

        outerloop:
        for(int i = 0; i < nums.length - 1; i++){
            int num = nums[i];
            for(int j = i + 1; j < nums.length; j++){
                if(num == nums[j]){
                    duplicate = true;
                    break outerloop;
                }
            }
        }
        return duplicate;
    }

    /**
     * counts the number of vowels in each word in the words array
     * stores the number of vowels in an array of integers
     *
     * @param arr of String with length > 0
     * @return integer array that stores the number of vowels
     */
    public int[] getNumOfVowels(String[] arr) {
        int[] numVowels = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            int vowels = 0;
            for(int j = 0; j < arr[i].length(); j++){
                if(arr[i].substring(j, j + 1).toLowerCase().equals("a") ||
                        arr[i].substring(j, j + 1).toLowerCase().equals("i") ||
                        arr[i].substring(j, j + 1).toLowerCase().equals("o") ||
                        arr[i].substring(j, j + 1).toLowerCase().equals("e") ||
                        arr[i].substring(j, j + 1).toLowerCase().equals("u")){
                    vowels++;
                }
            }
            numVowels[i] = vowels;
        }
        return numVowels;
    }

    //String array

    /**
     * reverses each word in the array of words
     * reverses the entire array
     * stores the reversed words and the reversed array of words
     * in a new String array
     *
     * @param words String array with length > 0
     * @return reversed array with reversed words
     */
    public String[] reverseWords(String[] words) {
        String[] reversed = new String[words.length];
        String[] revReversed = new String[words.length];
        for(int i = 0; i < words.length; i++){
            String reversedWord = "";
            for(int j = words[i].length(); j > 0; j--){
                reversedWord += words[i].substring(j - 1, j);
            }
            reversed[i] = reversedWord;
        }

        for(int i = 0; i < words.length; i++){
            revReversed[i] = reversed[words.length - 1 - i];
        }

        return revReversed;
    }


    /**
     * shifts the elements of the array one step to the right
     * example: ba, be, bi, bo, bu
     * output: bu, ba, be, bi, bo
     *
     * @param words array of words
     * @return array with shifted elements
     */
    public String[] shiftOne(String[] words) {
        String[] shifted = new String[words.length];

        for(int i = 0; i < words.length - 1; i++){
            shifted[i+1] = words[i];
        }
        shifted[0] = words[words.length - 1];
        return shifted;
    }

    /**
     * swaps all elements in even index to
     * elements in odd index location
     * example: "cat", "dog", "hog", "owl", "pup", "kid"
     * output: "dog", "cat", "owl", "hog", "kid", "pup"
     *
     * @param words
     * @return
     */
    public String[] swapWords(String[] words) {
        String[] swaped = new String[words.length];

        for(int i = 0; i < words.length / 2 * 2; i += 2){
            swaped[i] = words[i + 1];
            swaped[i + 1] = words[i];
        }
        if(words.length % 2 == 1){
            swaped[words.length - 1] = words[words.length - 1];
        }
        return swaped;
    }

    public String[] swapWords2(String[] words) {
        return null;
    }
}
