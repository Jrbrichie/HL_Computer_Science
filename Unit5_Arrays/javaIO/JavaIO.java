package Unit5_Arrays.javaIO;
import java.io.*;
import java.util.Scanner;

/**
 * User: 67364
 * Date: 30/03/22
 */
public class JavaIO {
    public static void main(String[] args) throws IOException {
        //reading using io
        File file1 = new File("file.txt");
        FileReader reader1 = new FileReader(file1); //reads info in file1
        BufferedReader buffer1 = new BufferedReader(reader1); //stores file in memory for efficient processing

        //stops file
        reader1.close();
        buffer1.close();


        //reading using a Scanner
        Scanner sc = new Scanner("file.txt");

        if(sc.hasNext()){ //if there is a next line in file
            String nextVal = sc.next(); //saves nextVal as String
        }
        sc.close();
    }
}
