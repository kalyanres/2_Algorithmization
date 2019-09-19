
public class Task2211 {
    public static void main(String[] args) {
        int m = 10;
        int n = 20;
        int count = 0;
        int[][] a = new int[n][n];

        // массив заполняется случайными числами от 0 до 15
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                a[i][j] = (int)(Math.random() * 16);
                System.out.print(a[i][j] + " ");
            }                 
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if (a[i][j] == 5 || a[i][j] == 15) {
                    count++;
                }
            }
            if (count >= 3) {
                System.out.println("In row with number " + i +
                        "number 5 is 3 or more times");
            }
            count = 0;
        }            
    }
}
