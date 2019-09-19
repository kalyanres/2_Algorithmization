import java.util.Scanner;

public class Task221 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array size \"m\": ");
        int m = in.nextInt();
        System.out.print("Enter array size \"n\": ");
        int n = in.nextInt();
        int[][] a = new int[m][n];

        // массив заполняется случайными числами от -5 до 5
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                a[i][j] = (int)(Math.random() * 11) - 5;
                System.out.print(a[i][j] + " ");
            }                 
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if (j % 2 == 0)
                    continue;
                if (a[0][j] > a[n - 1][j]) {
                    System.out.print(a[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
} 
