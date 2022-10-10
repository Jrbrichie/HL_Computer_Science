package Unit5_Arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class CollectionTest {

    public static void main(String[] args) {
        ArrayList<String> student = new ArrayList<>();
        student.add("jenson");
        student.add("Joshua");
        student.add("sam");
        student.add("seojyn");

        Iterator<ArrayList> itr = (Iterator<ArrayList>) student;
        itr.hasNext();

        while(itr.hasNext()){
            String a = itr.next();
            if(itr.next().equals("Jenson")){
                System.out.println(itr.next());
            }
        }
    }
}
