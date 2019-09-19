import java.util.Scanner;

public class Task2om4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter array size \"n\":");
        int n = in.nextInt();
        double[] a = new double[n];
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        int indexMin = 0;
        int indexMax = 0;
        double temp = 0;

        // массив заполняется случайными числами от -50 до 50
        for (int i = 0; i < n; i++){
            a[i] = Math.random() * 11 - 5.0;
            if (a[i] < min) {
                min = a[i];
                indexMin = i;
            }
            if (a[i] > max) {
                max = a[i];
                indexMax = i;
            }
            System.out.println(a[i]);
        }
        System.out.println();
        temp = a[indexMax];
        a[indexMax] = a[indexMin];
        a[indexMin] = temp;

        // print
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}
