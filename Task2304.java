import java.util.Scanner;

public class Task2304 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array size \"n\": ");
        int n = in.nextInt();
        int[] a = new int[n];
        int temp = 0;
        int counter = 0;        // подсчет количества перестановок

        // массив заполняется случайными числами от -50 до 50
        for (int i = 0; i < n; i++){
            a[i] = (int)(Math.random() * 101) - 50;
            System.out.print(a[i] + " ");
        }                 
        System.out.println();

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n - i - 1; j++){
                if (a[j] > a[j + 1]){
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    counter++;
                }
            }
        }

        // Print
        for (int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }                 
        System.out.println();
        System.out.println("Counter = " + counter);
    }
}
