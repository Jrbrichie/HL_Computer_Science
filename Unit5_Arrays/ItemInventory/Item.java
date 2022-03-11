package Unit5_Arrays.ItemInventory;

public class Item {
    //values of static array is the same for every item created
    private static String[] generalInfo = new String[3];

    //attributes, values of these variables vary in every object
    private String name;
    private double price;
    private int stocks;

    //constructor
    public Item(String name, double price, int stocks) {
        this.name = name;
        this.price = price;
        this.stocks = stocks;
    }

    //non-static method that returns a static value/variable
    public String[] getGeneralInfo() {
        return generalInfo;
    }

    //instance method that sets a static variable
    public void setGeneralInfo(String[] generalInfo) {
        Item.generalInfo = generalInfo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStocks() {
        return stocks;
    }

    public void setStocks(int stocks) {
        this.stocks = stocks;
    }

    @Override
    public String toString(){
        return "Name: " + name + ", Price: " + price + ", Stocks: " + stocks;
    }
}
