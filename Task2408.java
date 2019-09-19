import java.util.Scanner;

public class Task2408 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter size array \"N\": ");
        int N = in.nextInt();
        System.out.print("Enter begin \"k\": ");
        int k = in.nextInt();
        System.out.print("Enter end \"m\": ");
        int m = in.nextInt();
        int[] D = new int[N];

        if (m > N)
            m = N;
        // заполняем массив числами от -50 до 50
        for (int i = 0; i < N; i++){
            D[i] = (int)(Math.random() * 101) - 50;
            System.out.print(D[i] + " ");
        }
        System.out.println();

        sumOfThree(D, N, k, m);
        
    }       

    // метод для вычисления суммы трех последовательно 
    // расположенных элементов
    public static void sumOfThree(int[] array, int size, int begin, int end){
        for (int i = begin; i <= end; i++){
            int sum = 0;
            if (i >= end){
                break;
            } else if (end < i + 2){
                for (int j = end; j > end - 3; j--){
                    sum += array[j];
                    i++;
                }
            } else {
                int temp_i = i + 3;
                while (i < temp_i){
                    sum += array[i];
                    i++;
                }
            }
            i -= 2;    // чтобы начать новую сумму с последнего элемента старой
            System.out.println("Sum " + sum);
        }
    }
}
