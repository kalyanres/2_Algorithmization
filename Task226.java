import java.util.Scanner;

public class Task226 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter column \"n\": ");
        int n = in.nextInt();
        int[][] a = new int[n][n];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (i < n / 2){
                    if (j < n - i && j + 1 > i){
                        a[i][j] = 1;
                    } else {
                        a[i][j] = 0;
                    }
                } else {
                    if (n - 1 > i + j || j >= i + 1)
                        a[i][j] = 0;
                    else 
                        a[i][j] = 1;
                }
                
                System.out.print(a[i][j] + " ");
            }                 
            System.out.println();
        }
        System.out.println();
    }
}
