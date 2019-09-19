import java.util.Scanner;

public class Task2om2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Z:");
        double Z = in.nextDouble();
        System.out.println("Enter array size \"n\":");
        int n = in.nextInt();
        double[] a = new double[n];
        int count = 0;

        // массив заполняется случайными числами от -50 до 50
        for (int i = 0; i < n; i++){
            a[i] = Math.random() * 101 - 50.0;
            if (a[i] > Z){
                a[i] = Z;
                count++;
            }
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("Counter = " + count);
    }
}
