import java.util.Scanner;

public class Task2306 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array size \"n\": ");
        int n = in.nextInt();
        int[] a = new int[n];
        int temp = 0;
        int j = 0;

        // массив заполняется случайными числами от -50 до 50
        for (int i = 0; i < n; i++){
            a[i] = (int)(Math.random() * 101) - 50;
            System.out.print(a[i] + " ");
        }                 
        System.out.println();

        // реализация сортировки Шелла
        while (j < n - 1) {
            if (a[j] > a[j + 1]) {
                temp = a[j];
                a[j] = a[j + 1];
                a[j + 1] = temp;
                if (j > 0)
                    j--;
                else
                    j++;
            }
            else 
                j++;
        }
    
        // вывод на экран
        for (int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }                 
        System.out.println();
    }
} 
