package Unit4_Conditional_Statements;

public class Power {
    private String name;
    private int level;

    public Power(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString(){
        return "This hero has the power of " + name + " with a level of " + level + "!";
    }
}
