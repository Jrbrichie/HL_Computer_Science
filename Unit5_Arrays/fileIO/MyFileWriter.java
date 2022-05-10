package Unit5_Arrays.fileIO;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * User: 67364
 * Date: 20/04/22
 */

//runtime errors are done during runtime and are not detected by compiler (i.e. dividing by 0, infinite loop)
//exceptions aid with runtime errors easier

public class MyFileWriter {
    FileWriter fw; //sends data being writen by PrintWriter to file to be edited (mediator)
    PrintWriter pw = null; //writes on file and passes to FileWriter. DOES NOT print to console

    public void writeFile(File myFile, ArrayList<Double> arrList, boolean appends) {
        if(appends) {
            try {
                fw = new FileWriter(myFile, appends);
                pw = new PrintWriter(fw);

                try {
                    for(Double i : arrList){
                        pw.println(i);
                    }
                    pw.flush();

                } catch (IOError r) {
                    System.out.println("Unable to write to file");
                    r.printStackTrace();
                }

            } catch (IOException e) { //IOException means that writing/reading a file fails
                System.out.println("File Writer failed to be re-assigned");
                e.printStackTrace();
            }
        } else {
            System.out.println("Appends is false(?)...why");
        }
    }

    public ArrayList<Double> readGrades(File myFile){
        Scanner fileReader = null;
        ArrayList<Double> gradesUnder100 = new ArrayList<>();

        try{
            fileReader = new Scanner(myFile);
            while(fileReader.hasNext()){
                gradesUnder100.add(Double.parseDouble(fileReader.nextLine()));
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return gradesUnder100;
    }

    /**
     * writes from grades to enhancedGrades, adds one to all grades under 100
     * @param myFile
     * @param arrList
     * @param appends
     */
    public void addEnhancedGrade(File myFile, ArrayList<Double> arrList, boolean appends){
        if(appends && arrList != null){
            try {
                fw = new FileWriter(myFile, appends);
                pw = new PrintWriter(fw);

                for(Double i : arrList){
                    if(i < 100.0){
                        pw.println(i + 1);
                    } else {
                        pw.println(i);
                    }
                }

                pw.flush();
                System.out.println("Successful addition to enhanced grades");

            } catch (IOException e) { //IOException means that writing/reading a file fails
                System.out.println("File Writer failed to be re-assigned");
                e.printStackTrace();
            }
        } else {
            System.out.println("Appends is false(?)...why");
        }

    }
}

class TestMyFileWriter{
    public static void main(String[] args) {
        ArrayList<Double> toAdd = new ArrayList<>();
        toAdd.add(59.0);
        toAdd.add(90.5);
        toAdd.add(100.3);
        toAdd.add(78.6);
        toAdd.add(69.2);

        File file = new File("Unit5_Arrays/fileIO/grades.txt");
        MyFileWriter test = new MyFileWriter();

        test.addEnhancedGrade(new File("Unit5_Arrays/fileIO/EnhancedGrades.txt"), test.readGrades(file), true);
    }
}
