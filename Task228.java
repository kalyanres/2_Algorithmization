import java.util.Scanner;

public class Task228 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array size \"m\": ");
        int m = in.nextInt();
        System.out.print("Enter array size \"n\": ");
        int n = in.nextInt();
        System.out.print("Enter two column numbers: ");
        int k = in.nextInt();
        int p = in.nextInt();
        int[][] a = new int[m][n];
        int temp = 0;

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
            temp = a[i][k];
            a[i][k] = a[i][p];
            a[i][p] = temp;
        }

        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                System.out.print(a[i][j] + " ");
            }                 
            System.out.println();
        }
        System.out.println();
    }
}
