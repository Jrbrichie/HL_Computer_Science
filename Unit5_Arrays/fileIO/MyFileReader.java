package Unit5_Arrays.fileIO;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * User: 67364
 * Date: 30/03/22
 */
public class MyFileReader {

    //reads a file using scanner, adds all values and returns the sum
    public double getSum(String fileName) throws IOException{
        File text = new File(fileName);
        Scanner sc = new Scanner(text);
        double sum = 0;

        //while there is a token to read
        while(sc.hasNext()){
            if(sc.hasNextDouble()){ //if there is a number
                double numDouble = sc.nextDouble(); //sets numDouble as the next double
                sum += numDouble;
            } else {
                sc.next(); //skips if not a double
            }
        }

        sc.close();
        return sum;
    }

    public ArrayList<String> getWords(String fileName) throws IOException{
        File words = new File(fileName);
        Scanner sc = new Scanner(words);
        ArrayList<String> wordsList = new ArrayList<>();

        while(sc.hasNext()){
            wordsList.add(sc.next());
        }
        sc.close();
        return wordsList;
    }
}

class TestFileReader{
    public static void main(String[] args) throws IOException {
        MyFileReader fileReader = new MyFileReader();
        String fileName = "/Unit5_Arrays/fileIO/text.txt";
        String wordsFileName = "Unit5_Arrays/fileIO/Words - Sheet1 (1).csv";

//        try { //trying to read file
//            FileReader read = new FileReader(new File(fileName));
//        } catch (FileNotFoundException e){ //if try fails
//            System.out.println("File Not Found");
//        } finally { //will execute if try catch does not work
//            System.out.println(fileReader.getSum(fileName));
//        }
        ArrayList<String> words = new ArrayList<>();
        try {
            words = fileReader.getWords(wordsFileName);
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } finally {
            System.out.println(words);
        }
    }
}
