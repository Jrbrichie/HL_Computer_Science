package Unit5_Arrays.ItemInventory;

/**
 * User: 67364
 * Date: 11/03/22
 */
import java.util.ArrayList;
public class TestItemInventory {
    public static void main(String[] args) {
    ItemInventory ii = new ItemInventory();

       ii.addItem(new Item("Toothbrush", 2.0, 200));
       ii.addItem(new Item("Paper", 5.0, 50));
       ii.addItem(new Item("Pencil", 0.10, 1000));
       ii.addItem(new Item("Comb", 2.5, 50));
       ii.addItem(new Item("Gloves", 4.0, 500));
       ii.addItem(new Item("Paint", 10.50, 100));
       ii.addItem(new Item("Brush", 3.0, 500));

       System.out.println("Printing item list...");
       ii.printItems();

       System.out.println();
       System.out.println("Printing item list one line...");
    //calls the getItemList and assigns it to a new list

    ArrayList<Item> newList = ii.getItemList();
    //prints the contents of the newList in one line
       System.out.println(newList);

       System.out.println();
       System.out.println("Item with most stocks...");
       System.out.println(ii.getItemWithMostStocks());

       System.out.println();
       System.out.println("Cheapest Item...");
       System.out.println(ii.cheapestItem());

       System.out.println();
       System.out.println("Average Price of Items...");
       System.out.println(ii.getAveragePrice());

       System.out.println();
       System.out.println("Items with above average price...");
       System.out.println(ii.getNumOfItemsAboveAverage());


       System.out.println();
       System.out.println("Items with initial...");
    ArrayList<Item> list = ii.getItemsWithInitial("P");
       System.out.println(list);

       System.out.println();
       System.out.println("Array of item names...");
    String[] names = ii.getNameOfItems();
       for (int i = 0; i < names.length; i++) {
        System.out.print(names[i] + " ");
    }

       System.out.println();
       System.out.println();
       System.out.println("Item with price greater than 2.0...");
    Item[] items = ii.getItemsWithPriceGreaterThan(2);
       for (Item i : items) {
        System.out.println(i);
    }

       System.out.println();
       System.out.println("Removing Comb from list...");
    ArrayList<Item> list2 = ii.removeItemFromList(new Item("Comb", 2.5, 50));
       for (Item i : list2) {
        System.out.println(i);
    }

       System.out.println();
       System.out.println("Printing removed items from start to end...");
    ArrayList<Item> removedList = ii.getRemovedItems(2, 4);
       for (Item i : removedList) {
        System.out.println(i);
    }

       System.out.println();
       System.out.println("Inserting this array of items...");
    Item[] itemsArr = {new Item("Notebook", 5.0, 100),
            new Item("Stuffed Animal", 12.0, 20),
            new Item("Pins", 0.3, 1000),
            new Item("Clips", 0.8, 100)};
       for(Item i: itemsArr){
        System.out.println(i);
    }
       System.out.println();
       System.out.println("Inserting items at index 1 in list...");
    ArrayList<Item> inserted = ii.insertItems(1, itemsArr);
       for(Item i: inserted){
        System.out.println(i);
    }

       System.out.println();

    }
}
