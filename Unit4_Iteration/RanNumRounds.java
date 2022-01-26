package Unit4_Iteration;

public class RanNumRounds {
    void getRanNumsRounds(int n){
        int sumAll = 0;
        for(int i = 1; i <=n; i++){
            System.out.print("Round " + i + "...");
            int sum = 0;
            for(int j = 0; j < n; j++){
                int rand = (int)(Math.random() * (10) + 1);
                System.out.print(rand + " ");
                sum+=rand;
            }
            System.out.println(", sum: " + sum);
            sumAll += sum;
        }
        System.out.println("\nTotal sum: " + sumAll);
    }

    public static void main(String[] args) {
        RanNumRounds test = new RanNumRounds();
        test.getRanNumsRounds(9);
    }
}
