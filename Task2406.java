import java.util.Scanner;

public class Task2406 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter \"a\": ");
        int a = in.nextInt();
        System.out.print("Enter \"b\": ");
        int b = in.nextInt();
        System.out.print("Enter \"c\": ");
        int c = in.nextInt();

        coprime(a, b, c);
    }

    // метод, проверяющий, являются ли три числа взаимно простыми
    public static void coprime(int a, int b, int c){
        int max = Integer.MIN_VALUE;
        int nod = 1;
        // находим максимальное число
        if (max < a)
            max = a;
        if (max < b)
            max = b;
        if (max < c)
            max = c;
        
        // Находим простое число, на которое делим последовательно a, b и c
        for (int i = 2; i < max; i++) {
            boolean isprime = true;
            for (int j = 2; j <= i/j; j++) {
                if (i % j == 0)
                    isprime = false;
            }
            if (isprime){
                while (a % i == 0 && b % i == 0 && c % i == 0){
                    nod *= i;
                    a /= i;
                    b /= i;
                    c /= i;
                }
            }            
        }

        System.out.println("НОД = " + nod);
        if (nod == 1)
            System.out.println("Числа являются взаимно простыми");
        else
            System.out.println("Числа не являются взаимно простыми");
        return;
    }
}
