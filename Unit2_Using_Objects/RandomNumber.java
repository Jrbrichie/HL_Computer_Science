package Unit2_Using_Objects;
import java.lang.Math;
import java.util.Scanner;
public class RandomNumber {
    int a, b;
    String word;
    public RandomNumber(int a, int b, String word){
        this.a = a;
        this.b = b;
        this.word = word;

    }

    public int getRandomNumber(){
        return (int)(Math.random() * (b - a + 1) + a);
    }

    public String getRandomWord(){
        int i = (int)(Math.random() * (word.length() - 3 + 1));
        return word.substring(i, i + 3);
    }

    public String sortedLetters(){
        int a = (int)(Math.random() * word.length());
        int b = (int)(Math.random() * word.length());

        String wordA = word.substring(a, a + 1);
        String wordB = word.substring(b, b + 1);
        String twoLetters = "";

        if(wordA.compareTo(wordB) >= 0){
            twoLetters = wordB + wordA;
        } else {
            twoLetters = wordA + wordB;
        }

        return twoLetters;
    }
}

class TestRandomNumber{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = in.nextInt();
        System.out.print("Enter another number: ");
        int b = in.nextInt();
        System.out.print("Enter a random word: ");
        String word = in.next();

        RandomNumber rand1 = new RandomNumber(a, b, word);

        int cont = 1;
        while(cont != 0){
            System.out.println("Random Number between " + a + " and " + b);
            System.out.println(rand1.getRandomNumber());
            System.out.println("Random 3 letters in " + word);
            System.out.println(rand1.getRandomWord());
            System.out.println("Two random letters in alphabetical order");
            System.out.println(rand1.sortedLetters());
            System.out.println("");

            System.out.print("Continue? (1 - yes | 0 - no) ");
            cont = in.nextInt();
        }
    }
}