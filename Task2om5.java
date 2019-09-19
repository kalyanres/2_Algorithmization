import java.util.Scanner;

public class Task2om5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter array size \"n\":");
        int n = in.nextInt();
        int[] a = new int[n];

        // массив заполняется случайными числами от -50 до 50
        for (int i = 0; i < n; i++){
            a[i] = (int)(Math.random() * 101) - 50;
            if (a[i] > i) {
                System.out.println(a[i]);
            }
        }
    }
}
