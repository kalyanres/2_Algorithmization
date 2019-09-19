import java.util.Scanner;

public class Task2402 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter \"a\": ");
        int a = in.nextInt();
        System.out.print("Enter \"b\": ");
        int b = in.nextInt();
        System.out.print("Enter \"c\": ");
        int c = in.nextInt();
        System.out.print("Enter \"d\": ");
        int d = in.nextInt();

        System.out.println("НОД = " + nod(a, b, c, d));
    }
    
    public static int nod(int n1, int n2, int n3, int n4) {
        int max = Integer.MIN_VALUE;
        int n = 1;
        // находим максимальное число
        if (max < n1)
            max = n1;
        if (max < n2)
            max = n2;
        if (max < n3)
            max = n3;
        if (max < n4)
            max = n4;
        
        // Находим простое число, на которое делим последовательно n1 - n4
        for (int i = 2; i < max; i++) {
            boolean isprime = true;
            for (int j = 2; j <= i/j; j++) {
                if (i % j == 0)
                    isprime = false;
            }
            if (isprime){
                while (n1 % i == 0 && n2 % i == 0 && 
                       n3 % i == 0 && n4 % i == 0){
                    n *= i;
                    n1 /= i;
                    n2 /= i;
                    n3 /= i;
                    n4 /= i;
                }
            }   
        }
        return n;
    }
}
