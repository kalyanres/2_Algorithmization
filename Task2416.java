import java.math.BigInteger;
import java.util.Scanner;

public class Task2416 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter \"n\": ");
        int n = in.nextInt();
        BigInteger sum = BigInteger.valueOf(0);

        for (BigInteger i = begin(n);
             i.compareTo(end(n)) == -1;
             i = i.add(BigInteger.valueOf(1))){
            if (checkOdd(i))
                sum = sum.add(i);
        }            
        System.out.println("Sum = " + sum);
        System.out.println("Even numbers in sum is " + checkEven(sum));

    }
    
    // метод формирования первого числа разрядности n
    public static BigInteger begin(int size){
        BigInteger number = BigInteger.valueOf(1);
        BigInteger const_number = BigInteger.valueOf(10);
        for (int i = 0; i < size - 1; i++){
            number = number.multiply(const_number);
        }
        return number;
    }
    
    // метод формирования последнего числа разрядности n
    public static BigInteger end(int size){
        BigInteger number = BigInteger.valueOf(1);
        BigInteger const_number = BigInteger.valueOf(10);
        for (int i = 0; i < size; i++){
            number = number.multiply(const_number);
        }
        return number;
    }

    // функция проверки числа на нечетные числа
    public static boolean checkOdd(BigInteger number){
        BigInteger temp;
        while (number.compareTo(BigInteger.valueOf(0)) != 0){
            temp = number.mod(BigInteger.valueOf(10));
            number = number.divide(BigInteger.valueOf(10));
            if (temp.mod(BigInteger.valueOf(2)).compareTo(BigInteger.valueOf(0)) == 0)
                return false;
        }
        return true;
    }
    
    // функция вывода количества четных чисел
    public static int checkEven(BigInteger number){
        int count = 0;;
        BigInteger temp;
        while (number.compareTo(BigInteger.valueOf(0)) != 0){
            temp = number.mod(BigInteger.valueOf(10));
            number = number.divide(BigInteger.valueOf(10));
            if (temp.mod(BigInteger.valueOf(2)).compareTo(BigInteger.valueOf(0)) == 0)
                count++;
        }
        return count;
    }
}
