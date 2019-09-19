import java.util.Scanner;

public class Task2401 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter \"a\": ");
        int a = in.nextInt();
        System.out.print("Enter \"b\": ");
        int b = in.nextInt();

        System.out.println("НОД = " + nod(a, b));
        System.out.println("НОК = " + nok(a, b));
    }

    // метод нахождения наибольшего общего делителя
    public static int nod(int a, int b){
        int A = a;
        int B = b;
        int max = 0;
        int n = 1;
        // находим минимальное число
        if (a > b)
            max = a;
        else 
            max = b;
        
        // Находим простое число, на которое делим последовательно a и b
        for (int i = 2; i < max; i++) {
            boolean isprime = true;
            for (int j = 2; j <= i/j; j++) {
                if (i % j == 0)
                    isprime = false;
            }
            if (isprime){
                while (A % i == 0 && B % i == 0){
                    n *= i;
                    A /= i;
                    B /= i;
                }
            }
        }
        return n;
    }
                    
    // метод нахождения наименьшего общего кратного
    public static int nok(int a, int b){
        return (a * b) / nod(a, b);
    }
}
