import java.util.Scanner;

public class Task2om10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array size \"n\": ");
        int n = in.nextInt();
        int[] a = new int[n];
        int temp = 0;

        // массив заполняется случайными числами от -5 до 5
        for (int i = 0; i < n; i++){
            a[i] = (int)(Math.random() * 11) - 5;
            System.out.print(a[i] + " ");
        }
        System.out.println();
        
        if (n % 2 == 0){
            for (int i = 1; i < n; i++) {
                if (i >= n / 2) {
                    a[i] = 0;
                } else {
                    a[i] = a[2 * i];
                }
            }
        }
        
        if (n % 2 != 0){
            for (int i = 1; i < n; i++) {
                if (i > n / 2) {
                    a[i] = 0;
                } else {
                    a[i] = a[2 * i];
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
