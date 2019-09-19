import java.util.Scanner;

public class Task2307 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array size \"n\": ");
        int n = in.nextInt();
        System.out.print("Enter array size \"m\": ");
        int m = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];

        // массив заполняется случайными числами от -50 до 50
        for (int i = 0; i < n; i++){
            a[i] = (int)(Math.random() * 101) - 50;
        }                 

        // массив заполняется случайными числами от -50 до 50
        for (int i = 0; i < m; i++){
            b[i] = (int)(Math.random() * 101) - 50;
        }                 

        Show(a, n);
        Show(b, m);

        SortShell(a, n);
        SortShell(b, m);

        Show(a, n);
        Show(b, m);

        int i = 0;
        int j = 0;
        int k = 0;
        while (i < n + m - 1) {
            if (k >= n)
                k = n - 1;
            if (j >= n && b[j] > a[n - 1]) {
                System.out.println("b[" + j + "] after a[" + (n - 1) + "];");
                k++;
                i++;
                j++;
            } else if (b[j] < a[k]) {
                System.out.print("b[" + j + "] ");
                if (k > 0)
                    System.out.print("between a[" + (k - 1) + "] and ");
                else
                    System.out.print("before ");
                System.out.println("a[" + k + "]");
                j++;
                i++;
            } else {
                k++;
                i++;
            }
        }

        
    }

    public static void SortShell (int[] array, int size){
        // реализация сортировки Шелла
        int temp = 0;
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
    
    public static void Show(int [] array, int size) {
        // вывод на экран
        for (int i = 0; i < size; i++){
            System.out.print(array[i] + " ");
        }                 
        System.out.println();
    }
} 
