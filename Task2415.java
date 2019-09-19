import java.math.BigInteger;
import java.util.Scanner;

public class Task2415 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter \"n\": ");
        int n = in.nextInt();

        for (BigInteger i = begin(n);
             i.compareTo(end(n)) == -1;
             i = i.add(BigInteger.valueOf(1))){
            if (check(i))
                System.out.println(i);
        }            
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

    // функция проверки числа на возрастающую последовательность
    public static boolean check(BigInteger number){
        BigInteger temp1 = number.mod(BigInteger.valueOf(10));
        number = number.divide(BigInteger.valueOf(10));
        BigInteger temp2;
        while (number.compareTo(BigInteger.valueOf(0)) != 0){
            temp2 = number.mod(BigInteger.valueOf(10));
            number = number.divide(BigInteger.valueOf(10));
            if (temp1.subtract(temp2).compareTo(BigInteger.valueOf(1)) != 0)
                return false;
            temp1 = temp2;
        }
        return true;
    }
}
