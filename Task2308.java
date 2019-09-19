import java.util.Scanner;

public class Task2308 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array size \"n\": ");
        int n = in.nextInt();
        long[] p = new long[n];
        long[] q = new long[n];
        long q_max = Long.MIN_VALUE;
        int nod = 1;
        long nok = 1;

        // массив заполняется случайными числами от 1 до 9
        for (int i = 0; i < n; i++){
            p[i] = (int)(Math.random() * 8) + 1;
        }                 

        // массив заполняется случайными числами от 1 до 9
        for (int i = 0; i < n; i++){
            q[i] = (int)(Math.random() * 8) + 1;
            if (q_max < q[i])
                q_max = q[i];
        }                 

        Show(p, n);

        for (int i = 0; i < n; i++){
            System.out.print("--" + " ");
        }
        System.out.println();

        Show(q, n);

        // Находим простое число, на которое делим последовательно каждый q[i]
        for (int i = 2; i < q_max; i++) {
            boolean isprime = true;
            for (int j = 2; j <= i/j; j++) {
                if (i % j == 0)
                    isprime = false;
            }
            if (isprime){
                // Сокращение дроби
                for (int k = 0; k < n; k++){
                    while (p[k] % i == 0 && q[k] % i == 0){
                        p[k] /= i;
                        q[k] /= i;
                    }
                }
            }
        }

        System.out.println("Сокращение дроби");
        Show(p, n);
        for (int i = 0; i < n; i++){
            System.out.print("--" + " ");
        }
        System.out.println();
        Show(q, n);

        // находим НОД
        for (int i = 2; i < q_max; i++) {
            boolean isprime = true;
            for (int j = 2; j <= i/j; j++) {
                if (i % j == 0)
                    isprime = false;
            }
            if (isprime){
                boolean isnod = false;
                for (int k = 0; k < n; k++){
                    if (q[k] % i == 0)
                        isnod = true;
                    else{
                        isnod = false;
                        break;
                    }
                }
                if (isnod) {
                    nod *= i;
                }
            }
        }
        // находим НОК
        for (int i = 0; i < n; i++){
            nok *= q[i];
        }
        nok = nok / nod;

        // находим новые значения числителей
        for (int i = 0; i < n; i++) {
            p[i] *= (nok / q[i]);
        }
        SortShell(p, n);

        System.out.println("Упорядоченая дробь с общим знаменателем");
        Show(p, n);
        for (int i = 0; i < n; i++){
            System.out.print("--" + " ");
        }
        System.out.println();

        System.out.println(nok);

    }

    public static void SortShell (long[] array, int size){
        // реализация сортировки Шелла
        long temp = 0;
        int j = 0;
        while (j < size - 1) {
            if (array[j] > array[j + 1]) {
                temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
                if (j > 0)
                    j--;
                else
                    j++;
            }
            else 
                j++;
        }
    } 
    
    public static void Show(long[] array, int size) {
        // вывод на экран
        for (int i = 0; i < size; i++){
            System.out.print(array[i] + " ");
        }                 
        System.out.println();
    }
} 
