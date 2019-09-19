import java.util.Scanner;

public class Task2om6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter array size \"n\":");
        int n = in.nextInt();
        int[] a = new int[n];
        int sum = 0;

        // массив заполняется случайными числами от -50 до 50
        for (int i = 0; i < n; i++){
            a[i] = (int)(Math.random() * 101) - 50;
            System.out.print(a[i] + " ");
            if (i > 2){
                for (int j = 2; j <= i; j++){
                    if (i % j == 0 && i == j){
                        sum += a[i];
                    } else if (i % j == 0 && i != j){
                        break;
                    } else {
                        continue;
                    }
                }
            }
        }
        System.out.println();
        sum = sum + a[1] + a[2];
        System.out.println("Sum = " + sum);
    }
}
