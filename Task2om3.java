import java.util.Scanner;

public class Task2om3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter array size \"n\":");
        int n = in.nextInt();
        double[] a = new double[n];
        int count_neg = 0;
        int count_pos = 0;
        int count_zer = 0;

        // массив заполняется случайными числами от -50 до 50
        for (int i = 0; i < n; i++){
            a[i] = Math.random() * 11 - 5.0;
            if (a[i] < 0) {
                count_neg++;
            } else if (a[i] > 0) {
                count_pos++;
            } else {
                count_zer++;
            }
            System.out.println(a[i]);
        }
        System.out.println();
        System.out.println("Positive numbers is " + count_pos);
        System.out.println("Negative numbers is " + count_neg);
        System.out.println("Zero numbers is " + count_zer);
    }
}
