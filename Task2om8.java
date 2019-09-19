import java.util.Scanner;

public class Task2om8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array size \"n\": ");
        int n = in.nextInt();
        int[] a = new int[n];
        int min = Integer.MAX_VALUE;
        int count_min = 0;
        int j = 0;

        // массив заполняется случайными числами от -50 до 50
        for (int i = 0; i < n; i++){
            a[i] = (int)(Math.random() * 101) - 50;
            System.out.print(a[i] + " ");
            if (min > a[i]) {
                min = a[i];
                count_min = 1;
            } else if (min == a[i]){
                count_min++;
            }
        }
        System.out.println();

        int[] b = new int[n - count_min];
        for (int i = 0; i < n - count_min; i++) {
            if (a[i] > min) {
                b[i] = a[i + j];
                System.out.print(b[i] + " ");
            } else {
                j++;
                b[i] = a[i + j];
                System.out.print(b[i] + " ");
            }
        }
        System.out.println();
    }
}
