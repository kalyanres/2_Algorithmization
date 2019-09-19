import java.util.Scanner;

public class Task2412 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter \"K\": ");
        int K = in.nextInt();
        System.out.print("Enter \"N\": ");
        int N = in.nextInt();

        int[] A = newArray(K, N);
        for (int i = 0; i < A.length; i++){
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }
    
    // метод формирования массива А, элементами которого являются числа,
    // сумма цифр которых равна K и которые не больше N
    public static int[] newArray(int K, int N) {
        int[] tempArray = new int[K];
        int i = 0;
        int sum = 0;
        while (sum <= K){
            tempArray[i] = (int)(Math.random() * N) + 1;
            sum += tempArray[i];
            i++;
        }
        // Если сумма превысит K
        if (sum > K){
            tempArray[i - 1] = tempArray[i - 1] - (sum - K);
        }

        int[] A = new int[i];
        for (int j = 0; j < i; j++){
            A[j] = tempArray[j];
        }
        return A;
    }
}
