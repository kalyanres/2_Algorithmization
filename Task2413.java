import java.util.Scanner;

public class Task2413 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter \"n\": ");
        int n = in.nextInt();
        int temp1 = 0;
        int temp2 = 0;
        
        temp1 = primeNumber(n, 2 * n);
   // когда заканчиваются простые числа диапазона, метод primeNumber() возвращает нуль
        while (temp1 != 0){
            temp2 = primeNumber(temp1 + 1, 2 * n);
            twinsPrimeNumber(temp1, temp2);
            temp1 = temp2;
        //System.out.println(temp1 + " " + temp2);
        }
        
    }

    // метод нахождения простого числа из диапазона
    public static int primeNumber(int begin, int end){
        // Находим простое число
        for (int i = begin; i <= end; i++) {
            boolean isprime = true;
            for (int j = 2; j <= i/j; j++) {
                if (i % j == 0)
                    isprime = false;
            }
            if (isprime){
                return i;
            }
        }
        // если нет простых чисел, выводится нуль
        return 0;
    }

    // метод нахождения близнецов простых чисел
    public static void twinsPrimeNumber(int number1, int number2){
        if ((number2 - number1) == 2) {
            System.out.println(number1 + " " + number2 + ";");
        }
    }
}
