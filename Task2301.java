import java.util.Scanner;

public class Task2301 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array size \"m\": ");
        int m = in.nextInt();
        System.out.print("Enter array size \"n\": ");
        int n = in.nextInt();
        int[] a = new int[m];
        int[] b = new int[n];
        int[] c = new int[m + n];
        System.out.print("Enter \"k\": ");
        int k = in.nextInt();

        // массив заполняется случайными числами от -5 до 5
        for (int i = 0; i < m; i++){
            a[i] = (int)(Math.random() * 11) - 5;
            System.out.print(a[i] + " ");
        }                 
        System.out.println();
        // массив заполняется случайными числами от -5 до 5
        for (int i = 0; i < n; i++){
            b[i] = (int)(Math.random() * 11) - 5;
            System.out.print(b[i] + " ");
        }                 
        System.out.println();

        for (int i = 0; i < n + m; i++){
            if (i <= k){
                c[i] = a[i];
            } else if (i > k && i <= k + n) {
                c[i] = b[i - k - 1];
            } else if (i > k + n) {
                c[i] = a[i - n - 1];
            }
            System.out.print(c[i] + " ");
        }                 
        System.out.println();

    }
}
