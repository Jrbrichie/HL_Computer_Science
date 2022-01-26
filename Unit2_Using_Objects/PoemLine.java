package Unit2_Using_Objects;
import java.util.Scanner;
import java.lang.Math;
public class PoemLine {

    String poemLine; // 3 words

    public PoemLine(String line){
        poemLine = line;
    }

    /*
     * Converts a PoemLine into a an AlienLine
     * by swapping the first word and the third word of the poem line
     * and converts the initial letter of each word to uppercase
     * with middle word trimmed into only its middle letter
     * @return: an alienWord
     */
    public String convertToAlienLine(){
        int lastSpace = poemLine.lastIndexOf(" ");
        int firstSpace = poemLine.indexOf(" ");
        String midWord = poemLine.substring(firstSpace + 1, lastSpace);
        String newPoemLine = poemLine.substring(lastSpace + 1, lastSpace + 2).toUpperCase() + poemLine.substring(lastSpace + 2) + " " +
                midWord.substring(midWord.length() / 2, midWord.length() / 2 + 1) + " " +
                poemLine.substring(0,1).toUpperCase() + poemLine.substring(1, firstSpace);

        return newPoemLine;
    }

    /**
     * Generates a crazy line by
     * Replacing the spaces of the poem line with its last three letters
     * @param: a string value that is not null
     * @return: returns a crazy poemLine
     */
    public String makeCrazyLine(){
        int lastSpace = poemLine.lastIndexOf(" ");
        int firstSpace = poemLine.indexOf(" ");
        String lastThreeLetters = poemLine.substring(poemLine.length() - 3);
        return poemLine.substring(0, firstSpace) + lastThreeLetters + poemLine.substring(firstSpace + 1, lastSpace) +
                lastThreeLetters + poemLine.substring(lastSpace + 1);

    }


    /**
     * Generates random index number between a and b
     * and generates a random letter at that random index number
     * @param a - first index number >= 0 and < poemLine.length()
     * @param b - second index number > first index number < poemLine.length()
     * @return: a random letter from a substring starting at random index number
     *          between a and b
     *
     */
    public String getRandomLetter(int a, int b){
        int randomIndex = (int)(Math.random() * (b - a + 1) + a);
        return poemLine.substring(randomIndex, randomIndex + 1);

    }

}

class TestPoemLine{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a 3 word line: ");
        String line = in.nextLine();
        PoemLine pl1 = new PoemLine(line);

        System.out.println("Converted to Alien: " + pl1.convertToAlienLine());
        System.out.println("Converted to crazy line: " + pl1.makeCrazyLine());

        System.out.print("Enter start index: ");
        int a = in.nextInt();
        System.out.print("Enter end index: ");
        int b = in.nextInt();
        System.out.println("Random text: " + pl1.getRandomLetter(a, b));
    }
}