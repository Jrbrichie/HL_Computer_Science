package Unit5_Arrays;

/**
 * User: 67364
 * Date: 22/03/22
 */
public class TwoD_Array {
    private int[][] table;

    public TwoD_Array(int r, int c){
        table = new int[r][c];
    }

    public void fill2DArray(){
        for(int i = 0; i < table.length; i++){
            for(int j = 0; j < table[i].length; j++){
                table[i][j] = (int)(Math.random() * 10);
            }
        }
        System.out.println(String.valueOf(table));
    }

    public double getAverage(){
        double average = 0;
        int totalElements = 0;
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                average += table[i][j];
                totalElements++;
            }
        }
        return average / totalElements;
    }

    public int[][] copyArray(){
        int[][] copy = new int[table.length][table[0].length];
        for(int i = 0; i < copy.length; i++){
            for(int j = 0; j < copy.length; j++){
                copy[i][j] = table[i][j];
            }
        }
        return copy;
    }

    public int[][] getRow(int r){
        int[][] chosenRows = new int[r][table[0].length];

        for(int i = 0; i <= r; i++){
            for(int j = 0 ; j < table[i].length; j++){
                chosenRows[i][j] = table[i][j];
            }
        }
        return chosenRows;
    }

    public int[][] getColumn(int c){
        int[][] chosenColumns = new int[table.length][c];
        for(int i = 0; i < table.length; i++){
            for(int j = 0 ; j <= c; j++){
                chosenColumns[i][j] = table[i][j];
            }
        }
        return chosenColumns;
    }

    public int[] sumRows(){
        int[] sum = new int[table.length];

        for(int i = 0; i < table.length; i++){
            for(int j = 0; j < table[i].length; j++){
                sum[i] += table[i][j];
            }
        }
        return sum;
    }

    public int[] sumColumns(){
        int[] sum = new int[table[0].length];

        for(int i = 0; i < table[0].length; i++){
            for(int j = 0; j < table.length; j++){
                sum[i] += table[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        TwoD_Array test = new TwoD_Array(3,4);

        test.copyArray();
    }


}
