package Unit5_Arrays;
import java.util.ArrayList;
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();//if no type is specified, Object is defualted
        list.add("Jenson");
        list.add(16);
        list.add(false);
        list.add(true);
        list.add(1);
        list.add('c');
        System.out.println(list);

        //Object is a generic class for all object types
        for(Object o : list){
            System.out.println(o);
        }

        //Printing contents using a regular loop
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        //remove items from the list
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.remove(i));
        }

        list.set(0, "iona");
    }
}
