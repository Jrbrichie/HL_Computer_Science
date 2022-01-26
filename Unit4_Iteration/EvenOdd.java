package Unit4_Iteration;

public class EvenOdd {

    public boolean isEven(int num){
        return num % 2 == 0;
    }

    /**
     *
     * @param min
     * @param max
     * min < max
     */
    public void printsEvens(int min, int max, int num){
        System.out.print("Even numbers:" );
        int i = 0;

        while (i < num){
            int rand = (int)(Math.random() * (max - min + 1) + min);
            if(isEven(rand)){
                System.out.print(" " + rand);
                i++;
            }
        }
    }
}

class testEvenOdd{
    public static void main(String[] args) {
        EvenOdd test1 = new EvenOdd();
        System.out.println("Is it even? " + test1.isEven(7));
        System.out.println("Is it even? " + test1.isEven(22));

        test1.printsEvens(3, 46, 10);

    }
}
