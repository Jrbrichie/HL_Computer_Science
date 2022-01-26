package Unit3_Boolean_Expressions;

public class SomeClass{
    //gender: f, m, F, M
    String gender, text;
    int a, b, randNum;
    public SomeClass(String gender, int a, int b, String text){
        this.gender = gender.toLowerCase();
        this.a = a;
        this.b = b;
        this.text = text.toLowerCase();
        randNum = 0;

    }
    public boolean isMale(String gender){
        boolean isMale = false;
        if(gender.equals("m")){
            isMale = true;
        } return isMale;

    }
    //pre: a < b
//generates a random number
//between a and b inclusive
//test the random number if
    public boolean isEven(int a, int b){
        randNum = (int)(Math.random() * (b - a + 1) + a);
        return randNum % 2 == 0;
    }
//    checks if initial letter and
//    last letter are sama
//    ignoring the case
    public boolean isSamaAja(String text){
        boolean samaSaja = false;
        if(text.charAt(0) == text.charAt(text.length() - 1)){
            samaSaja = true;
        } return samaSaja;

    }
}

class SomeClassTester{
    public static void main(String[] args) {
        SomeClass someClass1 = new SomeClass("M", 30, 90, "lol");
        int localA = someClass1.a;
        int localB = someClass1.b;

        System.out.println("\nIs the gender male? " + someClass1.isMale(someClass1.gender));
        System.out.println("\nIs the random number generated between " +
                localA + " and " + localB + " even? " + String.valueOf(someClass1.isEven(localA, localB)) + "\nRandom Number: " + someClass1.randNum);
        System.out.println("\nAre the first and last letters of " + someClass1.text +
                " the same? " + someClass1.isSamaAja(someClass1.text));
    }
}