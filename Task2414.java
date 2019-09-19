import java.math.BigInteger;
import java.util.Scanner;

public class Task2414 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter \"k\": ");
        BigInteger k = in.nextBigInteger();

        System.out.println("size = " + size(k));
        System.out.println("sum = " + sum(k, size(k)));
        
        for (BigInteger i = BigInteger.valueOf(1);
             i.compareTo(k) == -1; 
             i = i.add(BigInteger.valueOf(1))) {
            if (sum(i, size(i)).compareTo(i) == 0)
                System.out.println(i);
        }
    }

    // метод нахождения порядка числа
    public static int size (BigInteger n){
        int count = 0;
        while (n.compareTo(BigInteger.valueOf(0)) != 0) {
            n = n.divide(BigInteger.valueOf(10));
            count++;
        }
        return count;
    }

    // метод нахождения суммы составных цифр в степени size() числа 
    public static BigInteger sum(BigInteger number, int size) {
        BigInteger sum_temp = BigInteger.valueOf(0);
        while (number.compareTo(BigInteger.valueOf(0)) != 0){
            sum_temp = sum_temp.add(exp(number.mod(BigInteger.valueOf(10)), size));
            number = number.divide(BigInteger.valueOf(10));
        }
        return sum_temp;
    }
    
    // метод возведения в целую степень
    public static BigInteger exp (BigInteger number, int n){
        BigInteger mul = BigInteger.valueOf(1);
        for (int i = 0; i < n; i++)
            mul = mul.multiply(number);
        return mul;
    }
}
