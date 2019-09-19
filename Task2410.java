import java.util.Scanner;

public class Task2410 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter \"N\": ");
        int N = in.nextInt();

        int[] a = createArray(N);
        

        // print
        System.out.print("array = [ ");
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println("]");
    }

    // метод для формирования массива из цифр числа
    public static int[] createArray(int number){
        int size = 0;
        int n = number;
        int j = 0;
        // определение размера массива
        while (n != 0){
            n /= 10;
            size++;
        }
        n = number;
        // объявление и заполнение массива
        int[] array = new int[size];
        while (n != 0) {
            array[size - 1 - j] = n % 10;
            n /= 10;
            j++;
        }
        return array;
    }
}
