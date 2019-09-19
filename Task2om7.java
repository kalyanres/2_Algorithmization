import java.util.Scanner;

public class Task2om7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter array size \"n\":");
        int n = in.nextInt();
        double[] a = new double[2 * n];
        double max = Double.MIN_VALUE;

        // массив заполняется случайными числами от -50 до 50
        for (int i = 0; i < 2 * n; i++){
            a[i] = Math.random() * 101 - 50.0;
            System.out.print(a[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < n; i++){
            if (max < (a[i] + a[2 * n - 1 - i])){
                max = (a[i] + a[2 * n - 1 - i]);
                System.out.println(max + "   i =  " + i);
            }
        }
        System.out.println("Max = " + max);
    }
}
