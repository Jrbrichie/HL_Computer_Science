package Unit4_Conditional_Statements;

public class superPower {
    private String name;
    private Power power;

    public superPower(String n, Power p){
        power = new Power(p.getName(), p.getLevel());//makes new object and future instantiations does not point to the same power
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Power getPower() {
        return power;
    }

    public void setPower(Power power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "This hero is " + name + ". " + power;
    }
}
