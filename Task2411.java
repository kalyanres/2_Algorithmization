import java.util.Scanner;

public class Task2411 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter \"Number 1\": ");
        int N1 = in.nextInt();
        System.out.print("Enter \"Number 2\": ");
        int N2 = in.nextInt();

        System.out.println("the most number is " + moreNumbers(N1, N2));
    }
    
    // метод, определяющий, в каком из двух чисел больше цифр
    public static int moreNumbers(int A, int B) {
        int size1 = 0; // размер первого числа
        int size2 = 0; // размер второго числа
        int a = A;
        int b = B;

        while (a!= 0){
            a /= 10;
            size1++;
        }
        while (b!= 0){
            b /= 10;
            size2++;
        }

        if (size1 > size2){
            return A;
        } else if (size1 < size2){
            return B;
        } else {
            return 0;
        }
    }
}
