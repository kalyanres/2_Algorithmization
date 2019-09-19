import java.util.Scanner;

public class Task229 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array size \"m\": ");
        int m = in.nextInt();
        System.out.print("Enter array size \"n\": ");
        int n = in.nextInt();
        int[][] a = new int[m][n];
        int[] sum = new int[n];
        int temp = 0;
        int max = 0;
        int index = -1;

        // массив заполняется случайными числами от 0 до 9
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                a[i][j] = (int)(Math.random() * 10);
                System.out.print(a[i][j] + " ");
            }                 
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                sum[i] += a[j][i];
                if (max < sum[i]){
                    max = sum[i];
                    index = i;
                }
            }
            System.out.print(sum[i] + " ");
        }
        System.out.println();

        System.out.println("Maximum sum in the element with number " + index);
    }
}
