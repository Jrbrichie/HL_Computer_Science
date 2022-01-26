package Unit4_Conditional_Statements;

public class testSuperPower {
    public static void main(String[] args) {
        Power speed = new Power("Speed", 9001);
        superPower flash = new superPower("flash", speed);

        superPower shazam = new superPower("shazam", speed);

        System.out.println(flash);
        System.out.println(shazam);

        flash.getPower().setLevel(100000);

        System.out.println(flash);
        System.out.println(shazam);

    }
}
