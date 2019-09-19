import java.util.Scanner;
import java.math.BigInteger;

public class Task2417 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter \"n\": ");
        BigInteger n = in.nextBigInteger();

        System.out.println("Counter = " + counter(n));
    }

    // метод вычисления суммы цифр, составляющих число
    public static BigInteger sumNumbers(BigInteger number) {
        BigInteger sum = BigInteger.valueOf(0);
        while (number.compareTo(BigInteger.valueOf(0)) != 0) {
            sum = sum.add(number.mod(BigInteger.valueOf(10)));
            number = number.divide(BigInteger.valueOf(10));
        }
        return sum;
    }
    // метод подсчета количества шагов, необходимых для получения нуля
    // вычитанием сумм цифр, составляющих разность на каждом шаге
    public static int counter(BigInteger number){
        int count = 0;
        while (number.compareTo(BigInteger.valueOf(0)) != 0){
            number = number.subtract(sumNumbers(number));
            count++;
        }
        return count;
    }        
}

