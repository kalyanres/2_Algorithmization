import java.util.Scanner;

public class Task2303 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array size \"n\": ");
        int n = in.nextInt();
        int[] a = new int[n];
        int temp = Integer.MIN_VALUE;
        int max_index = 0;

        // массив заполняется случайными числами от -50 до 50
        for (int i = 0; i < n; i++){
            a[i] = (int)(Math.random() * 101) - 50;
            System.out.print(a[i] + " ");
        }                 
        System.out.println();

        for (int i = 0; i < n; i++){
            for (int j = i; j < n; j++){
                if (temp < a[j]){
                    temp = a[j];
                    max_index = j;
                }
            }
            temp = a[i];
            a[i] = a[max_index];
            a[max_index] = temp;
            temp = Integer.MIN_VALUE;
        }
        // массив заполняется числами
        for (int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }                 
        System.out.println();
    }
}
