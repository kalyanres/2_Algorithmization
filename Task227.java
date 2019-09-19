import java.util.Scanner;

public class Task227 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter column \"N\": ");
        int N = in.nextInt();
        double[][] A = new double[N][N];
        int count = 0;
        String number;

        for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){
                A[i][j] = Math.sin((double)(i * i - j * j) / N);
                number = String.format("%.3f", A[i][j]);
                System.out.print(number + " ");
                if (A[i][j] > 0){
                    count++;
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Positive elements is " + count);
    }
}
