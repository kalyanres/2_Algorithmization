import java.util.Scanner;

public class Task222 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array size \"n\": ");
        int n = in.nextInt();
        int[][] a = new int[n][n];

        // массив заполняется случайными числами от -5 до 5
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                a[i][j] = (int)(Math.random() * 11) - 5;
                System.out.print(a[i][j] + " ");
            }                 
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < n; i++){
            System.out.print(a[i][i] + " ");
        }
        System.out.println();

        for (int i = 0; i < n; i++){
            System.out.print(a[i][n - 1 - i] + " ");
        }
        System.out.println();
    }
} 
