package Unit5_Arrays.hangman;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * User: 67364
 * Date: 12/04/22
 */
public class Hangman {
    ArrayList<String> words;
    String asterisks = "******";
    String word, dashes;
    int attempts = 6;


    public void setRandomWord(){
        word = words.get((int)(Math.random() * words.size()));
    }

    public void setDashes(){
        for(int i = 0; i < word.length(); i++){
            dashes += "_";
        }
    }


    public ArrayList<String> getWords(String path) throws FileNotFoundException {
        File file = new File(path);
        ArrayList<String> words = new ArrayList<>();
        Scanner sc = new Scanner(file);

        while (sc.hasNext()) { //continues reading the file as long as there are lines to read
            String line = sc.nextLine();
            String[] row = line.split(",");
            for (String w : row) {
                words.add(w);
            }
        }
        sc.close();
        this.words = words;

        return words;
    }

    public void updateAsterisks(String guess){
        for(int i = 0; i < 6; i ++){
            if(asterisks.charAt(i) == '*'){
                asterisks = asterisks.substring(0, i) + guess + asterisks.substring(i + 1);
                break;
            }
        }
    }


    public void makeLetterGuess(String guess){
        boolean incorrectGuess = true;

        for (int i = 0; i < word.length(); i++) {
            if(word.substring(i, i + 1).equals(guess)){
                dashes = dashes.substring(0, i) + guess + dashes.substring(i + 1);
                incorrectGuess = false;
            }
        }

        if(incorrectGuess){
            updateAsterisks(guess);
            attempts--;
        }
        System.out.println("Word: " + dashes);
        System.out.println("Attempts: " + asterisks);
    }

    public void makeFinalGuess(String guess){
        if(guess.equals(word)){
            System.out.println("Word: " + word);
            System.out.println("Attempts: " + asterisks);
            System.out.println("You Won!");
        } else {
            System.out.println("Word: " + word);
            System.out.println("You lost :(");
        }
    }


    public void play(){
        Scanner in = new Scanner(System.in);
        String guess = "";
        setRandomWord();
        setDashes();
        dashes = dashes.substring(4);

        while(attempts > 1){
            System.out.print("Enter guess: ");
            guess = in.next();
            makeLetterGuess(guess);

            if(dashes.equals(word)){
                System.out.println("You Won!");
                return;
            }
            System.out.println();
        }

        System.out.print("Enter word guess (final guess): ");
        guess = in.next();
        makeFinalGuess(guess);
    }
}

class TestHangman {
    public static void main(String[] args) throws FileNotFoundException {
        Hangman h = new Hangman();
        h.getWords("/Users/67364/IdeaProjects/HL_Computer_Science/Unit5_Arrays/hangman/wordList.csv");
        h.play();
    }
}


