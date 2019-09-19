import java.util.Scanner;

public class Task2om1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter K:");
        int K = in.nextInt();
        System.out.println("Enter array size N:");
        int N = in.nextInt();
        int[] A = new int[N];
        int sum = 0;

        for (int i = 0; i < N; i++){
            A[i] = (int)(Math.random() * 100);
            System.out.print(A[i] + " ");
            if (A[i] % K == 0){
                sum += A[i];
            }
        }
        System.out.println();
        System.out.println("Sum = " + sum);
    }
}
