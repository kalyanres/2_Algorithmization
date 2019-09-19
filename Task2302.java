import java.util.Scanner;

public class Task2302 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array size \"n\": ");
        int n = in.nextInt();
        System.out.print("Enter array size \"m\": ");
        int m = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        int[] c = new int[n + m];
        int j = 0;
        int k = 0;

        // массив заполняется числами
        for (int i = 0; i < n; i++){
            a[i] = i * 2 + 2;
            System.out.print(a[i] + " ");
        }                 
        System.out.println();
        // массив заполняется числами от 2 с шагом 3
        for (int i = 0; i < m; i++){
            b[i] = i * 3 + 1;
            System.out.print(b[i] + " ");
        }                 
        System.out.println();

        for (int i = 0; i < n + m; i++){
            if (j >= n){
                c[i] = b[k];
                k++;
            } else if (k >= m) {
                c[i] = a[j];
                j++;
            } else if (a[j] <= b[k]){
                c[i] = a[j];
                j++;
            } else if (b[k] < a[j]){
                c[i] = b[k];
                k++;
            }
            System.out.print(c[i] + " ");
        }
        System.out.println();
    }
}
