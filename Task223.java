import java.util.Scanner;

public class Task223 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter row \"m\": ");
        int m = in.nextInt();
        System.out.print("Enter column \"n\": ");
        int n = in.nextInt();
        System.out.print("Enter index of the row \"k\": ");
        int k = in.nextInt();
        System.out.print("Enter index of the column \"p\": ");
        int p = in.nextInt();
        int[][] a = new int[m][n];

        // массив заполняется случайными числами от 0 до 9
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                a[i][j] = (int)(Math.random() * 10);
                System.out.print(a[i][j] + " ");
            }                 
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if (i == k){
                    System.out.print(a[i][j] + " ");
                } else if (i != k && j == p){
                    System.out.print(a[i][j] + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
    }
} 
