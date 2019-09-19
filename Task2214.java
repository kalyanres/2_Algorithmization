import java.util.Scanner;

public class Task2214 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array size \"m\": ");
        int m = in.nextInt();
        System.out.print("Enter array size \"n\": ");
        int n = in.nextInt();
        int count = 0;
        int[][] a = new int[m][n];

        // Заполнение матрицы
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if (count < i){
                    a[j][i] = 1;
                    count++;
                } else {
                    a[j][i] = 0;
                }
            }
            count = 0;
        }

        // Print
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
