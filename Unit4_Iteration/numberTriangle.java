package Unit4_Iteration;

public class numberTriangle {
    void printNumberTriangle(int n){
        for(int i = n; i > 0; i--){
            for(int j = i; j > 0; j--){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        numberTriangle test = new numberTriangle();
        test.printNumberTriangle(6);
    }
}
