import java.util.Scanner;

public class Task225 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter column \"n\": ");
        int n = in.nextInt();
        int[][] a = new int[n][n];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (j < n - i){
                    a[i][j] = i + 1;
                } else {
                    a[i][j] = 0;
                }
                System.out.print(a[i][j] + " ");
            }                 
            System.out.println();
        }
        System.out.println();
    }
}
