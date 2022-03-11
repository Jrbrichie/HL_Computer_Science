package Unit5_Arrays.ItemInventory;

import java.util.ArrayList;

/**
 * User: 67364
 * Date: 11/03/22
 */
public class ItemInventory {
    private ArrayList<Item> itemList;

    public ItemInventory() {
        this.itemList = new ArrayList<>();
    }

    /**
     * returns itemList
     * @return
     */
    public ArrayList<Item> getItemList(){
        return itemList;
    }

    /**
     * adds a single item to the list
     * @param item
     */
    public void addItem(Item item){
        this.itemList.add(item);
    }

    public void printItems(){
        for(Item item: itemList){
            System.out.print(item);
        }
    }

    /**
     * finds the item with the most stocks in the itemList
     * @return an Item with the most stocks in the itemList
     */
    public Item getItemWithMostStocks(){
        if(itemList.size() > 0){
            Item most = itemList.get(0);
            for(Item item : itemList){
                if(item.getStocks() > most.getStocks()){
                    most = item;
                }
            }
            return most;
        } return null;
    }

    /**
     * finds the cheapest Item in the itemList
     * @return the cheapest Item in the itemList
     */
    public Item cheapestItem(){
        if(itemList.size() > 0){
            Item cheapest = itemList.get(0);
            for(Item item : itemList){
                if(item.getPrice() < cheapest.getPrice()){
                    cheapest = item;
                }
            }
            return cheapest;
        }return null;
    }

    /**
     * Calculates the average price of all items in itemList
     * @return average price of all items
     */
    public double getAveragePrice(){
        double average = 0;
        if(itemList.size() > 0){
            for(Item item : itemList){
                average += item.getPrice();
            }
        } return average / itemList.size();
    }

    /**
     * Counts the number of items with price
     * higher than the average price
     * @return
     */
    public int getNumOfItemsAboveAverage(){
        double average = getAveragePrice();
        int itemsAboveAverage = 0;

        if(itemList.size() > 0){
            for(Item item : itemList){
                if(item.getPrice() > average){
                    itemsAboveAverage++;
                }
            }
        }
        return itemsAboveAverage;
    }



    //Creates new Arrays or ArrayList
    //Does NOT change the contents of itemList

    /**
     * Creates a list of items that starts with the initial
     * @param initial any single alphabet
     * @return an ArrayList of items that start with initial
     */
    public ArrayList<Item> getItemsWithInitial(String initial){
        ArrayList<Item> withInitial = new ArrayList<>();
        if(itemList.size() > 0){
            for(Item item : itemList){
                if(item.getName().substring(0,1).equals(initial)){
                    withInitial.add(item);
                }
            }

        }
        return withInitial;
    }

    /**
     * Creates a String array of the names of items
     * from itemList
     * @return a String array that stores all names of items in itemList
     */
    public String[] getNameOfItems(){
        String[] names = new String[itemList.size()];
        for(int i = 0; i < names.length; i++){
            names[i] = itemList.get(i).getName();
        }
        return names;
    }

    /**
     * Creates an Item array that stores the Items from itemList
     * with price higher than the price specified
     * @param price any price of item
     * @return an Item array that contains Items with price higher than specified
     */
    public Item[] getItemsWithPriceGreaterThan(double price){
        int itemsGreater = 0;
        ArrayList<Item> greater = new ArrayList<>();

        for(Item item : itemList){
            if(item.getPrice() > price){
                greater.add(item);
            }
        }

        Item[] greaterThanAverage = new Item[greater.size()];
        for(int i = 0; i < greater.size(); i++){
            greaterThanAverage[i] = greater.get(i);
        }
        return greaterThanAverage;
    }


    /**
     * Creates a new ArrayList of Items with item removed
     * Removes all occurrences of specific item from the itemList
     * @param item is any Item in the list
     * @return an ArrayList of items with all occurence of Item removed
     * @post-condition:
     */
    public ArrayList<Item> removeItemFromList(Item item){
        ArrayList<Item> removed = new ArrayList<>(itemList);
        for(Item i : itemList){
            if(i.equals(item)){
                removed.remove(i);
            }
        }
        return removed;
    }

    /**
     * Creates a new ArrayList of Items with items removed
     * Removes items from itemList from
     * index start to index end inclusive
     * @param start >= 0 and <= end
     * @param end >= start and < itemList.size()
     * @return a new ArrayList that stores the removed Items from itemList
     * @post-condition: a call to getItemList will return an itemList with items from
     * start to end removed
     */
    public ArrayList<Item> getRemovedItems(int start, int end){
        ArrayList<Item> removed = new ArrayList<>();
        for(int i = start; i <= end; i++){
            removed.add(itemList.get(i));
        }
        return removed;
    }

    /**
     * Creates a new ArrayList of Items with items array inserted
     * Inserts items array to itemList at specific index
     * @param index a valid index in the itemList
     * @param items Item array
     * @return a new ArrayList of items that contains inserted items
     */
    public ArrayList<Item> insertItems(int index, Item[] items){
        ArrayList<Item> clone = new ArrayList<>(itemList);
        int j = 0;
        for(int i = index; j < items.length; i++){
            clone.add(i, items[j]);
            j++;
        }
        return clone;
    }

    /**
     * Creates a new ArrayList of Items with items added
     * Adds items to itemList
     * Creates a ArrayList with all the items from itemList and items combined
     * @return an ArrayList of items that contains itemList and items
     */
    public ArrayList<Item> addItems(ArrayList<Item> items){
        ArrayList<Item> added = new ArrayList<>(itemList);
        added.addAll(items);
        return added;
    }





}
